create database db_registroEscola;

use db_registroEscola;

create table tb_estudantes (
	id bigint auto_increment not null,
    nome_completo varchar(100) not null,
    ra bigint not null,
    idade int,
    genero varchar(20),
    media decimal(4,2) not null,
    
    primary key(id)
);

insert into tb_estudantes(nome_completo, ra, idade, genero, media) 
	values("David Lucas Cerqueira Mendes", 12345678, 20, "Masculino", 9.5);
insert into tb_estudantes(nome_completo, ra, idade, genero, media) 
	values("Erika", 12345672, 20, "Feminino", 6.5);
insert into tb_estudantes(nome_completo, ra, idade, genero, media) 
	values("Lucas", 12345673, 25, "Masculino", 5.5);
insert into tb_estudantes(nome_completo, ra, idade, genero, media) 
	values("Matheus", 12345674, 34, "Masculino", 8.5);
insert into tb_estudantes(nome_completo, ra, idade, genero, media) 
	values("Eduardo", 12345675, 29, "Masculino", 9);
insert into tb_estudantes(nome_completo, ra, idade, genero, media) 
	values("Jessica", 12345676, 25, "Feminino", 7.5);
insert into tb_estudantes(nome_completo, ra, idade, genero, media) 
	values("Larissa", 12345677, 19, "Feminino", 8.2);
insert into tb_estudantes(nome_completo, ra, idade, genero, media) 
	values("Julia", 12345679, 21, "Feminino", 10);

select * from tb_estudantes where media > 7.0;

select * from tb_estudantes where media < 7.0;

update tb_estudantes set media = 10 where id = 1;