CREATE DATABASE Sistema_bancario;
USE Sistema_bancario;

CREATE TABLE IF NOT EXISTS clientes (
    id_cliente         INT NOT NULL AUTO_INCREMENT,
    nombre             VARCHAR(50)  NOT NULL,
    apellido           VARCHAR(50)  NOT NULL,
    sexo               VARCHAR(15)  NOT NULL,
    direccion          VARCHAR(100) NOT NULL,
    nacionalidad       VARCHAR(50)  NOT NULL,
    dpi                VARCHAR(13)  NOT NULL,
    telefono           VARCHAR(8)   NOT NULL,
    compania_telefono  VARCHAR(50)  NOT NULL,
    correo_electronico VARCHAR(50)  NOT NULL,
    contrasena         VARCHAR(50)  NOT NULL,
    PRIMARY KEY (id_cliente)
);

CREATE TABLE IF NOT EXISTS cuentas (
    id_cuenta      INT         NOT NULL AUTO_INCREMENT,
    id_cliente     INT         NOT NULL,
    numero_cuenta  VARCHAR(20) NOT NULL,
    tipo_cuenta    VARCHAR(20) NOT NULL,
    saldo          FLOAT       NOT NULL,
    fecha_creacion DATE        NOT NULL,
    PRIMARY KEY (id_cuenta),
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);

CREATE TABLE IF NOT EXISTS transferencias (
    id_transferencia      INT 	 	  NOT NULL AUTO_INCREMENT,
    id_cuenta             INT         NOT NULL,
    numero_cuenta_destino VARCHAR(20) NOT NULL,
    monto                 FLOAT 	  NOT NULL,
    fecha_transferencia   DATE 	      NOT NULL,
    PRIMARY KEY (id_transferencia),
    FOREIGN KEY (id_cuenta) REFERENCES cuentas(id_cuenta)
);

CREATE TABLE IF NOT EXISTS retiros (
    id_retiro    INT    NOT NULL AUTO_INCREMENT,
    id_cuenta    INT    NOT NULL,
    monto        FLOAT  NOT NULL,
    fecha_retiro DATE   NOT NULL,
    PRIMARY KEY (id_retiro),
    FOREIGN KEY (id_cuenta) REFERENCES cuentas(id_cuenta)
);

CREATE TABLE IF NOT EXISTS depositos (
    id_deposito    INT    NOT NULL AUTO_INCREMENT,
    id_cuenta      INT    NOT NULL,
    monto          FLOAT  NOT NULL,
    fecha_deposito DATE   NOT NULL,
    PRIMARY KEY (id_deposito),
    FOREIGN KEY (id_cuenta) REFERENCES cuentas(id_cuenta)
);

CREATE TABLE IF NOT EXISTS servicios (
    id_servicio   INT NOT NULL AUTO_INCREMENT,
    tipo_servicio VARCHAR(20) NOT NULL,
    PRIMARY KEY (id_servicio)
);

CREATE TABLE IF NOT EXISTS servicios_no_cancelados (
    id_servicio  INT    NOT NULL,
    id_cuenta    INT    NOT NULL,
    fecha_inicio DATE   NOT NULL,
    fecha_fin    DATE   NOT NULL,
    monto        FLOAT  NOT NULL,
    PRIMARY KEY (id_servicio, id_cuenta),
    FOREIGN KEY (id_servicio) REFERENCES servicios(id_servicio),
    FOREIGN KEY (id_cuenta)   REFERENCES cuentas(id_cuenta)
);

CREATE TABLE IF NOT EXISTS servicios_cancelados (
    id_servicio       INT    NOT NULL,
    id_cuenta         INT    NOT NULL,
    fecha_cancelacion DATE   NOT NULL,
    monto             FLOAT  NOT NULL,
    PRIMARY KEY (id_servicio, id_cuenta),
    FOREIGN KEY (id_servicio) REFERENCES servicios(id_servicio),
    FOREIGN KEY (id_cuenta) REFERENCES cuentas(id_cuenta)
);

INSERT INTO servicios (tipo_servicio) VALUES ("Agua");
