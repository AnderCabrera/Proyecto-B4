-- Usuarios

DELIMITER //
CREATE PROCEDURE agregar_cliente
(
IN  _nombre 			  VARCHAR(50),
    _apellido 			  VARCHAR(50),
    _sexo 				  VARCHAR(15),
    _direccion	    	  VARCHAR(100),
    _nacionalidad 		  VARCHAR(50),
    _dpi 				  VARCHAR(13),
    _telefono 			  VARCHAR(8),
    _compania_telefono 	  VARCHAR(50),
    _correo_electronico   VARCHAR(50),
    _contrasena 		  VARCHAR(50)
)
BEGIN
    INSERT INTO clientes 
    (
        nombre, 
        apellido, 
        sexo,
        direccion, 
        nacionalidad, 
        dpi, 
        telefono, 
        compania_telefono,
        correo_electronico, 
        contrasena
    ) 
    VALUES
    (
        _nombre, 
        _apellido, 
        _sexo, 
        _direccion, 
        _nacionalidad, 
        _dpi, 
        _telefono, 
        _compania_telefono,
        _correo_electronico, 
        _contrasena
    );
END //
DELIMITER ;

-- Cuentas

DELIMITER //
CREATE PROCEDURE agregar_cuenta
(
IN  _id_cliente 	 INT,
    _numero_cuenta 	 VARCHAR(50),
    _tipo_cuenta     VARCHAR(15),
    _saldo	    	 VARCHAR(100),
    _fecha_creacion  DATE
)
BEGIN
    INSERT INTO cuentas 
    (
        id_cliente, 
        numero_cuenta, 
        tipo_cuenta,
        saldo, 
        fecha_creacion
    ) 
    VALUES
    (
        _id_cliente, 
        _numero_cuenta, 
        _tipo_cuenta, 
        _saldo, 
        _fecha_creacion
    );
END //
DELIMITER ;

 -- call agregar_cliente("Ander", "Cabrera", "masculino", "ZONA 7", "Guatemala", "123321", "38815644", "Tigo", "abc@c.com", "1234");
 -- DROP PROCEDURE agregar_cliente;
 