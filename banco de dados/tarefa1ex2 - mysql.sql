create database db_ecommerce;

use db_ecommerce; 

create table tb_produtos (
	id bigint auto_increment,
    nome varchar(30),
    tipo varchar(30),
    valor decimal(9.2) not null,
    quantidade int,
    marca varchar(30),
    
    primary key(id)
    );
    
insert into tb_produtos(nome, tipo, valor, quantidade, marca)
	values ("Smartphone S20 Samgswing", "Celular", 4999.99, 50, "Samswing");
insert into tb_produtos(nome, tipo, valor, quantidade, marca)
	values ("Smartphone S10 Samgswing", "Celular", 1999.99, 50, "Samswing");
insert into tb_produtos(nome, tipo, valor, quantidade, marca)
	values ("Smartphone A01 Samgswing", "Celular", 999.99, 100, "Samswing");
insert into tb_produtos(nome, tipo, valor, quantidade, marca)
	values ("Tablet 21' Samswing", "Tabler", 2999.99, 60, "Samswing");
insert into tb_produtos(nome, tipo, valor, quantidade, marca)
	values ("Redmi note 9 Pro", "Celular", 999.99, 50, "Chia-homi");
insert into tb_produtos(nome, tipo, valor, quantidade, marca)
	values ("Redmi note 8", "Celular", 479.99, 70, "Chia-homi");
insert into tb_produtos(nome, tipo, valor, quantidade, marca)
	values ("Notebook Pozitivo 19' ", "Celular", 5999.99, 50, "Pozitivo");
insert into tb_produtos(nome, tipo, valor, quantidade, marca)
	values ("Mouse Reazer 3000dps", "Mouse", 399.99, 50, "Mouse");
    
select * from tb_produtos where valor > 500;

select * from tb_produtos where valor < 500;

update tb_produtos set valor = 700 where id = 6;
    

	

        