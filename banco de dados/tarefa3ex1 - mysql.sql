create database db_generation_game_online;

use db_generation_game_online;

create table tb_classes (
	id bigint auto_increment not null,
    classe varchar(255) not null,
    fraco_contra varchar(255),
    forte_contra varchar(255),
    
    primary key(id)
    );
    
create table tb_personagens (
	id_personagens bigint auto_increment not null,
    nome varchar(255) not null,
	ataque int,
	armadura int,
    defesa_magica int,
	magia int, 
	vida int not null,
    id_classes bigint not null,
    
    primary key(id_personagens),
    foreign key(id_classes) references tb_classes(id)
);

-- Adicionando Elementos das Classes --
insert into tb_classes(classe, fraco_contra, forte_contra) 
	values ("Tank", "Atirador, Lutador", "Assassino, Mago");
insert into tb_classes(classe, fraco_contra, forte_contra)
	values("Atirador", "Assassino, Mago", "Tank, Lutador");
insert into tb_classes(classe, fraco_contra, forte_contra)
	values("Assassino", "Tank", "Atirador, Mago, Assassino");
insert into tb_classes(classe, fraco_contra, forte_contra)
	values("Mago", "Assassino, Tank", "Atirador, Lutador");
insert into tb_classes(classe, fraco_cointra, forte_contra)
	values("Lutador", "Atirador, Mago", "Tank, Assassino");
    
-- Adicionando Elementos dos Personagens --
insert into tb_personagens(nome, ataque, armadura, defesa_magica, magia, vida)
	values("Ahri", 53, 21, 30, 28, 514);
insert into tb_personagens(nome, ataque, armadura, defesa_magica, magia, vida)
	values("Alistar", 61, 25, 32, 0, 613);
insert into tb_personagens(nome, ataque, armadura, defesa_magica, magia, vida)
	values("Darius", 57, 30, 28, 0, 582);
insert into tb_personagens(nome, ataque, armadura, defesa_magica, magia, vida)
	values("Master Yi", 55, 15, 30, 0, 444);
insert into tb_personagens(nome, ataque, armadura, defesa_magica, magia, vida)
	values("Veigar", 50, 22, 30, 28, 493);
insert into tb_personagens(nome, ataque, armadura, defesa_magica, magia, vida)
	values("Nasus", 53, 15, 30, 10, 500);
insert into tb_personagens(nome, ataque, armadura, defesa_magica, magia, vida)
	values("Ashe", 56, 21, 30, 0, 528);
insert into tb_personagens(nome, ataque, armadura, defesa_magica, magia, vida)
	values("Vayne", 53, 19, 30, 0, 598);
    
select * from tb_personagens where ataque > 2000;

select * from tb_personagens where armadura > 1000 and armadura < 2000;

select * from tb_personagens where nome like "%C%";

select * from tb_personagens 
	inner join tb_classes on tb_classes.id = tb_personagens.id_classes;

select * from tb_personagens
	inner join tb_classes on tb_classes.id = tb_personagens.id_classes
    where tb_classes.classe like "%Tank%";

