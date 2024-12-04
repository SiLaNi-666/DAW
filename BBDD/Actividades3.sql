CREATE TABLE pub (
    cod_pub NUMBER(3) PRIMARY KEY UNIQUE,
    nombre VARCHAR2(15) NOT NULL,
    licencia_fiscal VARCHAR(50) NOT NULL,
    domicilio VARCHAR2(30),
    fecha_apertura DATE NOT NULL,
    horario VARCHAR (4) CHECK (horario IN ('HOR1', 'HOR2', 'HOR3')) NOT NULL,
    cod_localidad NUMBER(3) NOT NULL,
    FOREIGN KEY (cod_localidad) REFERENCES localidad (cod_localidad)
    );

DROP TABLE pub;

CREATE TABLE titular (
    dni_titular VARCHAR2(9) PRIMARY KEY UNIQUE,
    nombre VARCHAR2(15) NOT NULL,
    domicilio VARCHAR2(30),
    cod_pub NUMBER(3) NOT NULL,
    FOREIGN KEY (cod_pub) REFERENCES pub (cod_pub)
    );

DROP TABLE titular;

CREATE TABLE existencias (
    cod_articulo NUMBER(3) PRIMARY KEY UNIQUE,
    nombre VARCHAR(15) NOT NULL,
    cantidad NUMBER(3) NOT NULL,
    precio NUMBER CHECK (IN (precio > 0)) NOT NULL,
    cod_pub NUMBER(3) NOT NULL,
    FOREIGN KEY (cod_pub) REFERENCES pub (cod_pub)
    );

DROP TABLE existencias;

CREATE TABLE localidad (
    cod_localidad NUMBER(3) PRIMARY KEY UNIQUE,
    nombre VARCHAR2(15) NOT NULL
    );

DROP TABLE localidad;

CREATE TABLE pub_empleado (
    dni_empleado VARCHAR2(9) NOT NULL,
    cod_pub NUMBER(3) NOT NULL,
    funcion VARCHAR2(10) CHECK (funcion IN ('Camarero', 'Seguridad', 'Limpieza')) NOT NULL,
    FOREIGN KEY (cod_empleado) REFERENCES empleado (cod_empleado),
    FOREIGN KEY (cod_pub) REFERENCES pub (cod_pub)
    );

DROP TABLE pub_empleado;

CREATE TABLE empleado (
    dni_empleado VARCHAR2(9) PRIMARY KEY UNIQUE,
    nombre VARCHAR2(15) NOT NULL,
    domicilio VARCHAR2(30)
    );

DROP TABLE empleado;

