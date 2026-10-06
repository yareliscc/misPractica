create database MiProyecto;

USE MiProyecto;

/*CREAR LAS TABLAS*/
CREATE TABLE vuelo (
    id_vuelo INT NOT NULL UNIQUE,
    codigo_vuelo VARCHAR(100) NOT NULL UNIQUE,
    estado_vuelo BOOLEAN ,
    origen VARCHAR(100) NOT NULL,
    destino  VARCHAR(100) NOT NULL
);


CREATE TABLE tarifa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_vuelo bigint,
    categoria INT NOT NULL,
    monto DOUBLE NOT NULL
);

/*insertar datos en tablas*/


INSERT INTO tarifa (id_vuelo,categoria, monto) VALUES
(808970, 1 ,20.00),
(300, 2, 300.00),
(34645, 3, 500.00);

INSERT INTO vuelo (id_vuelo,codigo_vuelo, estado_vuelo, origen, destino) VALUES
(808970,303, true,'Santiago', 'Puerto Montt'),
(300,404,false ,'Antofagasta','La Serena'),
(3453453,405,true ,'Santiago','Isla de Pascua'),
(234235,406,true ,'Antofagasta','Puerto Montt'),
(34645,407,true ,'Antofagasta','Isla de Pascua');

/*VER LAS TABLAS*/

select * from tarifa;
select * from vuelo;
