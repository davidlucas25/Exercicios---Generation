create database db_quitanda;

use db_quitanda;

create table tb_produtos (
	id bigint auto_increment,
    nome varchar(30) not null,
    tipo varchar(20) not null,
    preco decimal(7,2),
    quantidade int not null,
    cor varchar(20),

	primary key(id)
);
insert into tb_produtos(nome, tipo, preco, quantidade, cor)
	values ("Maça","Fruta",7.00,20,"Vermelho");
insert into tb_produtos(nome, tipo, preco, quantidade, cor)
	values ("Alface","Verdura",3.00,30,"Verde");
insert into tb_produtos(nome, tipo, preco, quantidade, cor)
	values ("Repolho","Verdura",5.00,20,"Amarelo");
insert into tb_produtos(nome, tipo, preco, quantidade, cor)
	values ("Lentiha","Legume",7.00,40,"Branco");
insert into tb_produtos(nome, tipo, preco, quantidade, cor)
	values ("Pimentão","Legume",4.50,80,"Vermelho, Verde");
insert into tb_produtos(nome, tipo, preco, quantidade, cor)
	values ("Laranja","Fruta",6.40,20,"Laranja");
insert into tb_produtos(nome, tipo, preco, quantidade, cor)
	values ("Limão","Fruta",8.10,20,"Verde");
insert into tb_produtos(nome, tipo, preco, quantidade, cor)
	values ("Tomate","Fruta",6.75,20,"Vermelho");

select * from tb_produtos where tipo like "%Fruta%";

select * from tb_produtos where tipo like "%Legume%";

select * from tb_produtos where tipo = "Verdura";

delete from tb_produtos where id = 2;
delete from tb_produtos where id = 3;
