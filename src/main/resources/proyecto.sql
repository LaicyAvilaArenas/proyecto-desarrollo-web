Create table pedidos
(numero_pedido    Long not null, /* PK */
nombre_cliente     varchar(30) not null,
telefono   integer not null,
descripcion varchar (80) not null,
fecha_entrega     varchar (40),
constraint pk_pedidos primary key (numero_pedido)
)