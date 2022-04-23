--liquibase formatted sql
--changeset kamikaze:create-table-professor
CREATE TABLE gym.professor IF (
"name" text NOT NULL,
surname text NOT NULL,
birth date NOT NULL,
identification char NOT NULL,
height float4 NOT NULL,
weight integer NOT NULL,
address_id integer not null,
subject_id integer not null
)
----rollback DROP TABLE IF EXISTS gym."professor";