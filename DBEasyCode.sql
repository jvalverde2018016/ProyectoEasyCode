create database DBEasyCode;
use  DBEasyCode;

create table Estudiantes (
	codigoEstudiante int not null,
	nombre varchar (50),
    apellido varchar (50),
    edad varchar (50),
    fechaDeNaciemto varchar (50),
    carrera varchar (20),
    codigoTecnico varchar (15),
    codigoAcademico varchar (15),
    primary key PK_codigoEstudiante (codigoEstudiante)
);


