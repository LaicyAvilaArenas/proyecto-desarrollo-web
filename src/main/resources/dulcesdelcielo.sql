drop schema if exists pasteleria;
drop user if exists pasteleria_user;
CREATE SCHEMA pasteleria ;

/*Se crea un usuario para la base de datos llamado "pasteleria_user" y tiene la contraseña "pasteleria_Clave."*/
create user 'pasteleria_user'@'%' identified by 'pasteleria_Clave.';

/*Se asignan los prvilegios sobr ela base de datos Dulces del cielo al usuario creado */
grant all privileges on pasteleria.* to 'pasteleria_user'@'%';
flush privileges;

Create table pasteleria.pedidos(
numero_pedido int not null auto_increment,
nombre_cliente varchar(30) not null,
telefono int not null,
fecha_entrega varchar (40),
descripcion varchar (80) not null,
primary key (numero_pedido))

INSERT INTO pasteleria.pedidos (numero_pedido,nombre_cliente,telefono,fecha_entrega,descripcion) VALUES 
(1,'Milagro','5555555','12/12/2019','pastel con relleno de chocolate'),
(2,'Andrea','6666666','20/12/2019','pastel con relleno de vainilla');
