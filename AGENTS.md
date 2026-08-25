# Instrucciones para agentes

Antes de modificar este proyecto, lee `docs/agent-memory.md` completo. Si el cambio
afecta infraestructura compartida, lee además `../docs/agent-memory.md`.

Después de un cambio material, actualiza esa memoria en la misma unidad de trabajo.
Conserva solamente decisiones vigentes, operación necesaria, pendientes reales y la
verificación más reciente. No guardes contraseñas, tokens, secretos, archivos `.env`
ni datos personales.

`docs/agent-memory.md` es contexto vigente para agentes y `docs/prompts/` guarda
instrucciones delegables cuando sean necesarias. La documentación para personas se
publica únicamente en `frontend/docs/` y no se duplica dentro de Games.

Durante trabajo funcional, anota cualquier delta público en
`../docs/prompts/public-documentation-backlog.md` y no modifiques la web. Sólo una
petición explícita de actualización documental consume esas entradas.
