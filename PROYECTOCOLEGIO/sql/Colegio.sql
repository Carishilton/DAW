drop database colegio;
create database colegio;
use colegio;

create table cursos (
	codigo int primary key,
	descripcion varchar(100)
);
describe cursos;

create table alumnos (
	codigo int(5) primary key,
	nombre varchar(50),
	apellidos varchar(50),
	codigo_curso int(5),
	constraint fk_alumnos_cursos foreign key(codigo_curso) references cursos(codigo)

);
describe alumnos;

insert into cursos values (1, "Desarrollo Web");
insert into cursos values (2, "Desarrollo Multiplataforma");