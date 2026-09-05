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

## Operación

- Compilar y verificar desde este repositorio con `./mvnw -B clean verify`.
- El módulo usa Java 21 y Spring Boot 4.1.0.
- El entorno local sirve el frontend hermano mediante Nginx en
  `http://games.localhost:8080`; Vite permanece interno en el puerto `5175`.
- `scripts/deploy-local.sh` levanta el entorno compartido completo. No existe aún un
  destino productivo para Games; `scripts/deploy-production.sh` debe rechazar la
  publicación en vez de inventar uno.
