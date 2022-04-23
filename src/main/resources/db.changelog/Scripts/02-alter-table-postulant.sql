--liquibase formatted sql
--changeset kamikaze:alter-table-postulant
ALTER TABLE gym."postulant" ADD COLUMN id SERIAL PRIMARY KEY;

--rollback ALTER TABLE gym."professor" DROP COLUMN IF EXISTS id;