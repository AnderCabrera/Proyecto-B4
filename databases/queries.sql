-- clientes
use sistema_bancario;
select * from clientes;
select nombre, contrasena from clientes;

select id_Cliente from clientes where nombre = "Ander";

-- cuentas
select * from cuentas;

SELECT * FROM cuentas 
INNER JOIN clientes 
ON cuentas.id_cliente=clientes.id_cliente;


    
    