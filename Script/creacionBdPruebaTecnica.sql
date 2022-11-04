/*
*****************************************************************************************
*	Quién realiza	:	Jonathan Murillo Jaramillo										*
*	Cuando realiza	:	26/10/2022														*
*	Para quién		:	Castor															*
*	Descripción		:	Se crea base de datos con el fin de manejo de CRUD de la		*
*						prueba técnica, adicionalmente con esta se crea tabla con datos *
*****************************************************************************************
*/

CREATE DATABASE IF NOT EXISTS PRUEBATECNICA;
USE PRUEBATECNICA;

CREATE TABLE IF NOT EXISTS empleados
(
	id INT AUTO_INCREMENT PRIMARY KEY,
    cedula		 int,
    nombre 	 	 varchar(60),
    ruta     	 varchar(200),
    fecha		 varchar(100),
    cargo	 	 int
);

-- Datos de ejemplo...
INSERT IGNORE INTO empleados(cedula, nombre, ruta, fecha, cargo) 
VALUES('1001577726','Jonathan Murillo Jaramillo', 'noaplica','20221026',1);


