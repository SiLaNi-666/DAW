--Ejercicio 1
--Utilizando en SQL Developer la conexión DAW o DAM, crear una tabla llamada cosas. Dicha tabla tendrá las siguientes columnas (parámetros):
DROP TABLE cosas;
CREATE TABLE cosas (
    nombre VARCHAR2 (25),
    cantidad NUMBER (5) CHECK (cantidad BETWEEN 0 AND 10000),
    precio NUMBER (8,2),CHECK (cantidad BETWEEN 0 AND 100000.00),
    fecha DATE DEFAULT SYSDATE
    );


--Ejercicio 2
-- Añadir a la tabla anterior (alter) una restricción PK_COSAS_cod_cosa que indique que la columna cod_cosa es la clave primaria de la tabla.
DROP TABLE cosas;
CREATE TABLE cosas (
    cod_cosa NUMBER (5),
    nombre VARCHAR2 (25),
    cantidad NUMBER (5) CHECK (cantidad BETWEEN 0 AND 10000),
    precio NUMBER (8,2),CHECK (precio BETWEEN 0 AND 100000.00),
    fecha DATE DEFAULT SYSDATE
    );
ALTER TABLE cosas ADD CONSTRAINT pk_cosas PRIMARY KEY (cod_cosa);


--Ejercicio 3
-- Insertar en dicha tabla 3 filas, con diferentes valores. En dos de ellos dejar la fecha en blanco.
DROP TABLE cosas;
CREATE TABLE cosas (
    
    nombre VARCHAR2 (25),
    cantidad NUMBER (5) CHECK (cantidad BETWEEN 0 AND 10000),
    precio NUMBER (8,2),CHECK (precio BETWEEN 0 AND 100000.00),
    fecha DATE DEFAULT SYSDATE
    );
ALTER TABLE cosas ADD cod_cosa NUMBER (5)
ALTER TABLE cosas ADD CONSTRAINT pk_cosas PRIMARY KEY (cod_cosa);

INSERT INTO cosas (cod_cosa, nombre, cantidad, precio, fecha)VALUES (12345, 'Mesa', 235, 76845.45);
INSERT INTO cosas VALUES (56789, 'Silla', 543, 82631.45);
INSERT INTO cosas VALUES (23472, 'Movil', 876, 98764.45);


--Ejercicio 4
--Borramos la tabla cosas (DROP TABLE cosas) y la volvemos a crear definiendo la clave primaria:
DROP TABLE cosas;
CREATE TABLE cosas (
    id NUMBER(4) PRIMARY KEY,
    nombre VARCHAR2(25),
    fecha DATE DEFAULT SYSDATE
    );


--Ejercicio 5
--Probamos a insertar dos registros con la misma clave, y comprobamos que provoca un error.
DROP TABLE cosas;
CREATE TABLE cosas (
    id NUMBER(4) PRIMARY KEY,
    nombre VARCHAR(25),
    fecha DATE DEFAULT SYSDATE
    );
--Poner directamente los datos sin indicar las columnas, da error
INSERT INTO cosas (id, nombre)
VALUES (5678, 'Silla');
SELECT * FROM cosas;


--Ejercicio6 y 7
--Borramos la tabla de nuevo, y la volvemos a crear usando CONSTRAINT.
--Insertar varios registros para comprobar que la restricción funciona y aparece el nombre que hemos definido.
DROP TABLE cosas;
    CREATE TABLE cosas (
    id NUMBER(4),
    nombre VARCHAR(25),
    fecha DATE DEFAULT SYSDATE,
    CONSTRAINT cosas_pk PRIMARY KEY (id)
    );

--Ejercicio8
CREATE TABLE mascotas (
    id NUMBER (4),
    dni VARCHAR2 (9),
    raza VARCHAR2 (30) NOT NULL,
    f_nacimiento DATE,
    PRIMARY KEY (id, DNI)
    );
INSERT INTO mascotas VALUES (1, '12345678K', 'Chiguagua', '03-12-2024');
INSERT INTO mascotas VALUES (2, '12345678A', 'Chiguagua', '03-12-2024');
INSERT INTO mascotas VALUES (3, '12345678K', 'Chiguagua', '03-12-2024');

SELECT * FROM mascotas;
DROP TABLE mascotas


--Ejercicio10
CREATE TABLE mascotas (
    id NUMBER(4) PRIMARY KEY,
    nombre VARCHAR2 (20),
    dni VARCHAR2(9),
    raza VARCHAR2(30),
    propietario NUMBER(4),
    f_nacimiento DATE,
    FOREIGN KEY (propietario) REFERENCES propietarios (cod_pro)
    );

CREATE TABLE propietarios (
    cod_pro NUMBER(5) PRIMARY KEY,
    dni VARCHAR2(9) NOT NULL UNIQUE,
    nombre VARCHAR2(20),
    direccion VARCHAR2(30)
    );



