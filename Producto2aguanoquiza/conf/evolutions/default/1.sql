# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table cliente (
  id                            bigserial not null,
  name                          varchar(255),
  apellido                      varchar(255),
  direccion                     varchar(255),
  fecha                         timestamp,
  constraint pk_cliente primary key (id)
);


# --- !Downs

drop table if exists cliente cascade;

