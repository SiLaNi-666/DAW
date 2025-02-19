drop table mproductos CASCADE CONSTRAINTS;
drop table productos CASCADE CONSTRAINTS;
drop table alimentacion CASCADE CONSTRAINTS;
drop table animales CASCADE CONSTRAINTS;
drop table clientes CASCADE CONSTRAINTS;
drop table empleados CASCADE CONSTRAINTS;
drop table especies CASCADE CONSTRAINTS;
drop table manimales CASCADE CONSTRAINTS;
drop table medicacion CASCADE CONSTRAINTS;
drop table proveedores CASCADE CONSTRAINTS;
drop table sociedades CASCADE CONSTRAINTS;
drop table tipoeventos CASCADE CONSTRAINTS;
drop table ubicaciones CASCADE CONSTRAINTS;

CREATE TABLE alimentacion (Id_alimentacion NUMBER NOT NULL,descripcion VARCHAR(150),PRIMARY KEY (Id_alimentacion)) ;
INSERT INTO alimentacion (Id_alimentacion, descripcion) VALUES (1, 'vegetariana');
INSERT INTO alimentacion (Id_alimentacion, descripcion) VALUES (2, 'ovolacteovegetariana');
INSERT INTO alimentacion (Id_alimentacion, descripcion) VALUES (3, 'carnivoro');
INSERT INTO alimentacion (Id_alimentacion, descripcion) VALUES (4, 'omnivoro');

CREATE TABLE animales (Id_animal NUMBER NOT NULL,id_especie NUMBER,nombre_pila VARCHAR(50),fecha_ingreso DATE,fecha_salida DATE,nacimiento DATE,foto VARCHAR(200),id_cuidador NUMBER,
id_medicacion NUMBER,id_ubicacion NUMBER,sexo VARCHAR(255),PRIMARY KEY (Id_animal));
INSERT INTO animales (Id_animal, id_especie, nombre_pila, fecha_ingreso, fecha_salida, nacimiento, foto, id_cuidador, id_medicacion, id_ubicacion, sexo) VALUES(1, 1, 'copito', to_date('2009-01-01','yyyy-mm-dd') , NULL, to_date('2006-03-07','yyyy-mm-dd'), 'http://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Gorilla_CinZoo_02036.jpg/200px-Gorilla_CinZoo_02036.jpg', 6, 6, 3, 'varon');
INSERT INTO animales (Id_animal, id_especie, nombre_pila, fecha_ingreso, fecha_salida, nacimiento, foto, id_cuidador, id_medicacion, id_ubicacion, sexo) VALUES(2, 2, 'pijamas', to_date('2008-06-02','yyyy-mm-dd'), NULL, to_date('2005-09-15','yyyy-mm-dd'), 'http://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Beautiful_Zebra_in_South_Africa.JPG/200px-Beautiful_Zebra_in_South_Africa.JPG', 6, 6, 3, 'hembra');
INSERT INTO animales (Id_animal, id_especie, nombre_pila, fecha_ingreso, fecha_salida, nacimiento, foto, id_cuidador, id_medicacion, id_ubicacion, sexo) VALUES(3, 3, 'goloso', to_date('2009-04-15','yyyy-mm-dd'), NULL, to_date('2008-06-02','yyyy-mm-dd'), 'http://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Ours_des_pyrenees_aspe_2002.jpg/230px-Ours_des_pyrenees_aspe_2002.jpg', 7, 5, 3, 'varon');
INSERT INTO animales (Id_animal, id_especie, nombre_pila, fecha_ingreso, fecha_salida, nacimiento, foto, id_cuidador, id_medicacion, id_ubicacion, sexo) VALUES(4, 4, 'raro', to_date('2008-10-22','yyyy-mm-dd'), NULL, to_date('2007-08-15','yyyy-mm-dd'), 'http://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Platypus.jpg/250px-Platypus.jpg', 7, 6, 3, 'varon');
INSERT INTO animales (Id_animal, id_especie, nombre_pila, fecha_ingreso, fecha_salida, nacimiento, foto, id_cuidador, id_medicacion, id_ubicacion, sexo) VALUES(5, 5, 'rey', to_date('2008-01-08','yyyy-mm-dd'), NULL, to_date('2003-09-08','yyyy-mm-dd'), 'http://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Lion_waiting_in_Nambia.jpg/230px-Lion_waiting_in_Nambia.jpg', 6, 5, 3, 'varon');
INSERT INTO animales (Id_animal, id_especie, nombre_pila, fecha_ingreso, fecha_salida, nacimiento, foto, id_cuidador, id_medicacion, id_ubicacion, sexo) VALUES(6, 5, 'reina', to_date('2008-11-18','yyyy-mm-dd'), NULL, to_date('2005-03-09','yyyy-mm-dd'), 'http://upload.wikimedia.org/wikipedia/commons/thumb/a/a7/Lioness%2C_Olomouc.jpg/230px-Lioness%2C_Olomouc.jpg', 6, 6, 3, 'hembra');
INSERT INTO animales (Id_animal, id_especie, nombre_pila, fecha_ingreso, fecha_salida, nacimiento, foto, id_cuidador, id_medicacion, id_ubicacion, sexo) VALUES(7, 5, 'principe', to_date('2009-05-01','yyyy-mm-dd'), NULL, to_date('2009-05-01','yyyy-mm-dd'), 'http://www.fonditos.com/wallpapers/vista/03053.jpg', 7, 3, 3, 'varon');

CREATE TABLE clientes (Id_cliente NUMBER NOT NULL,nombre VARCHAR(50),tipo_sociedad NUMBER,fecha_alta DATE,fecha_baja DATE,comentario VARCHAR(150),PRIMARY KEY (Id_cliente));
INSERT INTO clientes (Id_cliente, nombre, tipo_sociedad, fecha_alta, fecha_baja,comentario) VALUES (1, 'green_peace', 5, to_date('2009-04-01','yyyy-mm-dd'), to_date('2012-12-31','yyyy-mm-dd'), 'ong ecologista');
INSERT INTO clientes (Id_cliente, nombre, tipo_sociedad, fecha_alta, fecha_baja,comentario) VALUES (2, 'caja_madrid', 2, to_date('2009-04-02','yyyy-mm-dd'), to_date('2012-12-31','yyyy-mm-dd'), 'ayuda a especies en extincion');
INSERT INTO clientes (Id_cliente, nombre, tipo_sociedad, fecha_alta, fecha_baja,comentario) VALUES (3, 'fulanito detal', 3, to_date('2009-04-03','yyyy-mm-dd'), to_date('2012-12-31','yyyy-mm-dd'), 'colaborador');
INSERT INTO clientes (Id_cliente, nombre, tipo_sociedad, fecha_alta, fecha_baja,comentario) VALUES (4, 'fulanito decual', 3, to_date('2009-05-05','yyyy-mm-dd'), to_date('2012-12-31','yyyy-mm-dd'), 'voluntario');

CREATE TABLE empleados (Id_empleado NUMBER NOT NULL,nombre VARCHAR(50),ubicacion NUMBER,PRIMARY KEY (Id_empleado));
INSERT INTO empleados (Id_empleado, nombre, ubicacion) VALUES (1, 'antonio camborio', 1);
INSERT INTO empleados (Id_empleado, nombre, ubicacion) VALUES (2, 'benito diaz',2);
INSERT INTO empleados (Id_empleado, nombre, ubicacion) VALUES (3, 'carlos espino', 3);
INSERT INTO empleados (Id_empleado, nombre, ubicacion) VALUES (4, 'dario fernandez', 4);
INSERT INTO empleados (Id_empleado, nombre, ubicacion) VALUES (5, 'esteban garcia', 5);
INSERT INTO empleados (Id_empleado, nombre, ubicacion) VALUES (6, 'francisco hernandez', 6);
INSERT INTO empleados (Id_empleado, nombre, ubicacion) VALUES (7, 'gerardo iglesias', 6);

CREATE TABLE especies (Id_especie NUMBER NOT NULL,nombre_comun VARCHAR(50),nombre_cientifico VARCHAR(50),id_alimentacion NUMBER,PRIMARY KEY (Id_especie)) ;
INSERT INTO especies (Id_especie, nombre_comun, nombre_cientifico, id_alimentacion) VALUES (1, 'gorila', 'primates gorilla', 1);
INSERT INTO especies (Id_especie, nombre_comun, nombre_cientifico, id_alimentacion) VALUES (2, 'cebra', 'equus zebra', 1);
INSERT INTO especies (Id_especie, nombre_comun, nombre_cientifico, id_alimentacion) VALUES (3, 'oso pardo', 'Ursus arctos', 4);
INSERT INTO especies (Id_especie, nombre_comun, nombre_cientifico, id_alimentacion) VALUES (4, 'ornitorrinco', 'Ornithorhynchus anatinus', 2);
INSERT INTO especies (Id_especie, nombre_comun, nombre_cientifico, id_alimentacion) VALUES (5, 'leon', 'panthera leo', 3);

CREATE TABLE manimales (
Id_movimiento NUMBER NOT NULL,
id_animal NUMBER,
fecha_movimiento DATE,
tipo_evento NUMBER,
descripcion VARCHAR(50),
PRIMARY KEY (Id_movimiento)
);

--TABLA VAC�A

CREATE TABLE medicacion (Id_medicacion NUMBER NOT NULL,descripcion VARCHAR(150),PRIMARY KEY (Id_medicacion));
INSERT INTO medicacion (Id_medicacion, descripcion) VALUES (1, 'vacunas');
INSERT INTO medicacion (Id_medicacion, descripcion) VALUES (2, 'analgesicos');
INSERT INTO medicacion (Id_medicacion, descripcion) VALUES (3, 'antipireticos');
INSERT INTO medicacion (Id_medicacion, descripcion) VALUES (4, 'antiinflamatorios');
INSERT INTO medicacion (Id_medicacion, descripcion) VALUES (5, 'antibioticos');
INSERT INTO medicacion (Id_medicacion, descripcion) VALUES (6, 'Sin_medicacion');

CREATE TABLE mproductos (
Id_mproducto NUMBER NOT NULL,
id_producto NUMBER NOT NULL,
id_proveedor NUMBER NOT NULL,
fecha_entrada DATE,
fecha_salida DATE,
cantidad NUMBER,
destino NUMBER,
PRIMARY KEY (Id_mproducto)
);

--TABLA VAC�A

CREATE TABLE productos (Id_producto NUMBER NOT NULL,id_proveedor NUMBER NOT NULL,nombre VARCHAR(50),stock NUMBER,PRIMARY KEY (Id_producto,id_proveedor));
INSERT INTO productos (Id_producto, id_proveedor, nombre, stock) VALUES (1, 1, 'piensos', 100);
INSERT INTO productos (Id_producto, id_proveedor, nombre, stock) VALUES (2, 2, 'carne', 300);
INSERT INTO productos (Id_producto, id_proveedor, nombre, stock) VALUES (3, 3, 'kits mantenimiento', 10);

CREATE TABLE proveedores (Id_proveedor NUMBER NOT NULL,id_cliente NUMBER DEFAULT 0,nombre VARCHAR(50),tipo_sociedad NUMBER,fecha_alta DATE,fecha_baja DATE,comentario VARCHAR(150),PRIMARY KEY (Id_proveedor));
INSERT INTO proveedores (Id_proveedor, id_cliente, nombre, tipo_sociedad, fecha_alta, fecha_baja, comentario) VALUES (1, 0, 'piensos la hiena', 6, to_date('2009-05-01','yyyy-mm-dd'),NULL, 'comida para hebivoros');
INSERT INTO proveedores (Id_proveedor, id_cliente, nombre, tipo_sociedad, fecha_alta, fecha_baja, comentario) VALUES (2, 1, 'green peace', 5, to_date('2009-05-01','yyyy-mm-dd'), NULL, 'comida para carnivoros');
INSERT INTO proveedores (Id_proveedor, id_cliente, nombre, tipo_sociedad, fecha_alta, fecha_baja, comentario) VALUES (3, 2, 'caja madrid', 2, to_date('2009-05-01','yyyy-mm-dd'), NULL, 'productos de mantenimiento');

CREATE TABLE sociedades (Id_tipo_sociedad NUMBER NOT NULL,descripcion VARCHAR(50),PRIMARY KEY (Id_tipo_sociedad));
INSERT INTO sociedades (Id_tipo_sociedad, descripcion) VALUES (1, 'fundacion');
INSERT INTO sociedades (Id_tipo_sociedad, descripcion) VALUES (2, 'SA');
INSERT INTO sociedades (Id_tipo_sociedad, descripcion) VALUES (3, 'persona_fisica');
INSERT INTO sociedades (Id_tipo_sociedad, descripcion) VALUES (4, 'organismo_oficial');
INSERT INTO sociedades (Id_tipo_sociedad, descripcion) VALUES (5, 'ong');
INSERT INTO sociedades (Id_tipo_sociedad, descripcion) VALUES (6, 'SL');
INSERT INTO sociedades (Id_tipo_sociedad, descripcion) VALUES (7, 'otros');

CREATE TABLE tipoeventos (Id_tipo NUMBER NOT NULL,descripcion VARCHAR(150),PRIMARY KEY (Id_tipo));
INSERT INTO tipoeventos (Id_tipo, descripcion) VALUES (1, 'parto');
INSERT INTO tipoeventos (Id_tipo, descripcion) VALUES (2, 'enfermedad');
INSERT INTO tipoeventos (Id_tipo, descripcion) VALUES (3, 'traslado');
INSERT INTO tipoeventos (Id_tipo, descripcion) VALUES (4, 'otros');

CREATE TABLE ubicaciones (Id_ubicacion NUMBER NOT NULL,descripcion VARCHAR(50),PRIMARY KEY (Id_ubicacion));
INSERT INTO ubicaciones (Id_ubicacion, descripcion) VALUES (1, 'stock');
INSERT INTO ubicaciones (Id_ubicacion, descripcion) VALUES (2, 'administracion');
INSERT INTO ubicaciones (Id_ubicacion, descripcion) VALUES (3, 'animales');
INSERT INTO ubicaciones (Id_ubicacion, descripcion) VALUES (4, 'empleados');
INSERT INTO ubicaciones (Id_ubicacion, descripcion) VALUES (5, 'veterinarios');
INSERT INTO ubicaciones (Id_ubicacion, descripcion) VALUES (6, 'cuidador');

ALTER TABLE clientes ADD CONSTRAINT fk_cli_soci FOREIGN KEY (tipo_sociedad) REFERENCES sociedades (id_tipo_sociedad);
ALTER TABLE proveedores ADD CONSTRAINT fk_pro_soci FOREIGN KEY (tipo_sociedad) REFERENCES sociedades (id_tipo_sociedad);
ALTER TABLE productos ADD CONSTRAINT fk_produ_prov FOREIGN KEY (id_proveedor) REFERENCES proveedores (id_proveedor);
ALTER TABLE mproductos ADD CONSTRAINT fk_mprodu_produ FOREIGN KEY (Id_producto,id_proveedor)REFERENCES productos (id_producto,id_proveedor) ON DELETE CASCADE;
--ALTER TABLE mproductos ADD CONSTRAINT fk_mprodu_produ2 FOREIGN KEY (id_proveedor) REFERENCES proveedores (id_proveedor);
ALTER TABLE mproductos ADD CONSTRAINT fk_mprodu_ubi FOREIGN KEY (destino) REFERENCES ubicaciones (id_ubicacion);
ALTER TABLE animales ADD CONSTRAINT fk_ani_ubi FOREIGN KEY (id_ubicacion) REFERENCES ubicaciones (id_ubicacion);
ALTER TABLE animales ADD CONSTRAINT fk_ani_esp FOREIGN KEY (id_especie) REFERENCES especies (id_especie);
ALTER TABLE manimales ADD CONSTRAINT fk_mani_ani FOREIGN KEY (id_animal) REFERENCES animales (id_animal) ON DELETE CASCADE;
ALTER TABLE manimales ADD CONSTRAINT fk_mani_teve FOREIGN KEY (tipo_evento) REFERENCES tipoeventos (id_tipo);
ALTER TABLE animales ADD CONSTRAINT fk_ani_medi FOREIGN KEY (id_medicacion) REFERENCES medicacion (id_medicacion);
ALTER TABLE animales ADD CONSTRAINT fk_ani_emp FOREIGN KEY (id_cuidador) REFERENCES empleados (id_empleado);
ALTER TABLE especies ADD CONSTRAINT fk_esp_ali FOREIGN KEY (id_alimentacion) REFERENCES alimentacion (id_alimentacion);
ALTER TABLE empleados ADD CONSTRAINT fk_emp_ubi FOREIGN KEY (ubicacion) REFERENCES ubicaciones (id_ubicacion);


--1. Devuelve el listado de los animales (todos los campos) que nacieron en 2009.
SELECT * 
FROM animales
WHERE EXTRACT (YEAR from nacimiento) = 2009;

--2. Devuelve el listado de proveedores que no tienen fecha de baja en la base de datos y además el tipo de 
--sociedad comience por S.
SELECT *
FROM proveedores JOIN sociedades on(proveedores.tipo_sociedad = sociedades.Id_tipo_sociedad)
WHERE fecha_baja is null
AND descripcion LIKE 'S%';

--3. Devuelve el listado de los cuidadores y los animales. Se debe mostrar el id y nombre de empleado, la especie 
--(nombre común) y el nombre del animal.


--4. Muestra un listado con la medicación que toma cada animal. Se debe mostrar en nombre de pila del animal y 
--la descripción de la medicación. En caso de no tomar medicación, debe aparecer 'Sin medicación'.
SELECT animales.nombre_pila, medicacion.descripcion
FROM animales JOIN medicacion USING (id_medicacion);

--5. Devuelve un listado con la alimentación que debe tomar cada animal. Se debe mostrar el nombre de pila y la 
--alimentación.
SELECT animales.nombre_pila, alimentacion.id_alimentacion, alimentacion.descripcion
FROM animales JOIN especies USING (id_especie)
LEFT JOIN alimentacion on (especies.id_alimentacion = alimentacion.id_alimentacion);

--6. Devuelve un listado con los productos de cada proveedor, mostrando id de producto, nombre de producto, 
--stock y nombre de proveedor. 
SELECT productos.id_producto, productos.nombre, productos.stock, proveedores.nombre
FROM productos JOIN proveedores USING (id_proveedor);

--7. Devuelve un listado de empleados que no cuidan de ningún animal. Muestra el id y el nombre.


--8. Devuelve un listado de empleados que no cuidan de ningún animal y donde están ubicados. Muestra id, 
--nombre y descripción de la ubicación.


--9. Devuelve el nombre y la fecha de nacimiento de la hembra animal más joven.
SELECT nombre, nacimiento
FROM animales JOIN manimales ON (animales.nacimiento = manimales.fecha_nacimiento)
WHERE sexo = 'Hembra'
ORDER BY fecha_nacimiento DESC;
