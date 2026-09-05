# Memoria de agentes — Games

## Regla absoluta de endpoints

Los guiones (`-`) están totalmente prohibidos en todos los segmentos de endpoints. Los
conceptos compuestos se modelan con recursos anidados en inglés, por ejemplo
`/api/clients`, nunca `/api-clients`. No crear rutas ni aliases con guiones; una ruta
existente que los use es deuda que debe corregirse, no un precedente que copiar.

## Regla de documentación

Una conversación dedicada a código no modifica la documentación pública. Registra
cualquier delta para personas en
`../platform/docs/prompts/public-documentation-backlog.md`; la publicación se realiza
únicamente cuando se solicite de forma explícita.

## Alcance

Games es el ejecutable backend propietario del comportamiento específico de juegos y
de las solicitudes de su frontend. El código reutilizable por otros módulos pertenece
a Plataforma.

## Estado actual

El módulo contiene únicamente el arranque mínimo de Spring Boot. No tiene controllers,
services, repositories, entidades, endpoints, seguridad, persistencia ni almacenamiento
de archivos.

## Pendiente diferido

- Diferido por decisión del usuario: conectar `Guardar`, `Continuar` y `Reiniciar`
  partida, y permitir abrir/exportar el documento YAML del editor. Son flujos
  separados: el progreso del jugador no reemplaza el contenido de la aventura.
- El frontend ya tiene `game-progress.js` y `game-progress-storage.js`, con snapshot
  versionado y validación de juego, flags, inventario, escenas y posiciones; todavía
  no están conectados a la interfaz. El editor tampoco abre ni exporta documentos.
  La memoria detallada del frontend permanece en `docs/frontend-agent-memory.md`.
- Al retomarlo, reutilizar esos contratos sin crear backend ni nuevas dependencias;
  validar YAML y conservar datos ante errores de almacenamiento o incompatibilidad.
  Éxito observable: guardar, recargar y continuar conserva escena, inventario, flags
  y posiciones; reiniciar restablece la partida de forma explícita; exportar y abrir
  el YAML reproduce el contenido editado sin confundirlo con un guardado de progreso.
  No implementar estos flujos hasta que se retomen.

## Operación

- Compilar y verificar desde este repositorio con `./mvnw -B clean verify`.
- El módulo usa Java 21 y Spring Boot 4.1.0.
- El entorno local sirve el frontend hermano mediante Nginx en
  `http://games.localhost:8080`; Vite permanece interno en el puerto `5175`.
- `scripts/deploy-local.sh` levanta el entorno compartido completo. No existe aún un
  destino productivo para Games; `scripts/deploy-production.sh` debe rechazar la
  publicación en vez de inventar uno.
