--liquibase formatted sql
--changeset kamikaze:create-table-postulant
CREATE SCHEMA IF NOT EXISTS gym;
CREATE TABLE gym."postulant"(
"name" text NOT NULL,
surname text NOT NULL,
birth date NOT NULL,
identification char NOT NULL,
height float4 NOT NULL,
weight integer NOT NULL,
address_id integer not null,
payment_plan_id integer not null,
payment_method_id integer not null
)
--rollback DROP TABLE IF EXISTS gym."postulant";