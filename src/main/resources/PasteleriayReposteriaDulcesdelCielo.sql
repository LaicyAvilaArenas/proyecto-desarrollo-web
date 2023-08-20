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
telefono varchar(10) not null,
fecha_entrega date,
descripcion varchar (80) not null,
primary key (numero_pedido));

INSERT INTO pasteleria.pedidos (numero_pedido,nombre_cliente,telefono,fecha_entrega,descripcion) VALUES 
(1,'Milagro','5555555','2019-12-12','pastel con relleno de chocolate'),
(2,'Andrea','6666666','2019-12-12','pastel con relleno de vainilla');

create table pasteleria.pasteles(
numero_pastel int not null auto_increment,
nombre_pastel varchar(50) not null,
primary key (numero_pastel));

INSERT INTO pasteleria.pasteles (numero_pastel,nombre_pastel) VALUES
(1,'Pastel Astronauta'),
(2,'Pastel Harry Potter'),
(3,'Pastel Cerveza'),
(4,'Pastel Star Wars'),
(5,'Pastel Paris'),
(6,'Pastel mariposas'),
(7,'Pastel Cerveza'),
(8,'Pastel minecraft'),
(9,'Pastel Batman'),
(10,'Pastel Marvel');

create table pasteleria.categorias(
numero_categoria int not null auto_increment,
tipo_categoria varchar(30) not null,
nombre_categoria varchar(30) not null,
primary key (numero_categoria));

INSERT INTO pasteleria.categorias (numero_categoria,tipo_categoria,nombre_categoria) VALUES
(1,'pastelería','Tortas Frías'),
(2,'pastelería','Celebraciones'),
(3,'repostería','Fullbox'),
(4,'pastelería','Cupcakes'),
(5,'repostería','Galletas'),
(6,'repostería','Lunchbox'),
(7,'repostería','Postres');

create table pasteleria.proveedores(
numero_proveedor int not null auto_increment,
nombre_proveedor varchar(30) not null,
primary key (numero_proveedor));

INSERT INTO pasteleria.proveedores (numero_proveedor,nombre_proveedor) VALUES
(1,'puratos'),
(2,'CakeSupplies');

create table pasteleria.utensilios(
numero_utensilios int not null auto_increment,
nombre_utensilios varchar(30) not null,
primary key (numero_utensilios));

INSERT INTO pasteleria.utensilios (numero_utensilios,nombre_utensilios) VALUES
(1,'espátulas'),
(2,'Cepillo de silicona'),
(3,'Peine de decoración de pasteles'),
(4,'Molde de silicona'),
(5,'boquillas de pastelería');

create table pasteleria.productos(
numero_productos int not null auto_increment,
fecha_vencimiento date,
nombre_productos varchar(30) not null,
primary key (numero_productos));

INSERT INTO pasteleria.productos (numero_productos,fecha_vencimiento,nombre_productos) VALUES
(1,'2019-12-12','mantequilla'),
(2,'2019-12-12','harina');

create table pasteleria.finanzas(
numero_mes int not null auto_increment,/*este id corresponde al mes del año, ya que los datos colocados se basan de cada mes*/
gastos varchar(30) ,
gastos_entrada int ,
gastos_salida int ,
primary key (numero_mes));

INSERT INTO pasteleria.finanzas (numero_mes, gastos, gastos_entrada, gastos_salida) VALUES
(1,'comida',900,300),
(2,'transporte',500,300);

create table pasteleria.administradores(
numero_admin int not null auto_increment,
nombre_admin varchar(30) not null,
primary key (numero_admin));

INSERT INTO pasteleria.administradores (numero_admin, nombre_admin) VALUES
(1,'Luana Marchena');