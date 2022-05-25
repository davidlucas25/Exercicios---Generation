create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categorias (
	id bigint auto_increment not null,
    tamanho varchar(30),
	tipo varchar(20),
    
    primary key(id)
);

create table tb_pizzas (
	id bigint auto_increment not null,
    sabor varchar(50),
    preco decimal(5,2),
    borda boolean,
    id_categorias bigint not null,
    
    primary key(id),
    foreign key(id_categorias) references tb_categorias(id)
);

-- Criando Categorias --
insert into tb_categorias(tamanho, tipo) 
	values("Broto", "Doce");
insert into tb_categorias(tamanho, tipo)
	values("Media", "Doce");
insert into tb_categorias(tamanho, tipo)
	values("Grande", "Doce");
insert into tb_categorias(tamanho, tipo)
	values("Gigante", "Doce");
insert into tb_categorias(tamanho, tipo) 
	values("Broto", "Salgada");
insert into tb_categorias(tamanho, tipo)
	values("Media", "Salgada");
insert into tb_categorias(tamanho, tipo)
	values("Grande", "Salgada");
insert into tb_categorias(tamanho, tipo)
	values("Gigante", "Salgada");
    
-- Criando Pizzas --
insert into tb_pizzas(sabor, preco, borda, id_categorias)
	values("Portuguesa", 24.99, false, 5);
insert into tb_pizzas(sabor, preco, borda, id_categorias)
	values("Portuguesa", 26.99, true, 5);
insert into tb_pizzas(sabor, preco, borda, id_categorias)
	values("Portuguesa", 31.99, false, 6);
insert into tb_pizzas(sabor, preco, borda, id_categorias)
	values("Portuguesa", 33.99, true, 6);
insert into tb_pizzas(sabor, preco, borda, id_categorias)
	values("Portuguesa", 38.99, false, 7);
insert into tb_pizzas(sabor, preco, borda, id_categorias)
	values("Portuguesa", 41.99, true, 7);
insert into tb_pizzas(sabor, preco, borda, id_categorias)
	values("Portuguesa", 45.99, false, 8);
insert into tb_pizzas(sabor, preco, borda, id_categorias)
	values("Portuguesa", 47.99, true, 8);

select * from tb_pizzas where preco > 45.00;

select * from tb_pizzas where preco > 50.00 and preco < 100.00;

select * from tb_pizzas where id_categorias like "%5%";
 
select tb_pizzas.sabor, tb_categorias.tamanho, tb_pizzas.preco from  tb_pizzas	
	inner join tb_categorias on tb_categorias.id = tb_pizzas.id_categorias;
    
select tb_pizzas.sabor, tb_categorias.tamanho, tb_pizzas.preco from  tb_pizzas	
	inner join tb_categorias on tb_categorias.id = tb_pizzas.id_categorias
    where tb_categorias.tipo like "%Doce%";