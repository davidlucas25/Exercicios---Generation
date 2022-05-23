create database db_rh;

use db_rh;

create table tb_colaboradores (
	id bigint auto_increment,
    nome varchar(30) not null,
    idade int not null,
    sexo varchar(30),
    periodo varchar(20),
    tempo_de_empresa int,
    salario decimal(9,2),
    
	primary key (id)
);

insert into tb_colaboradores(nome, idade, sexo, periodo, tempo_de_empresa, salario) 
	values ("David Lucas", 19, "Masculino", "Manhã", 2, 5000.00);
insert into tb_colaboradores(nome, idade, sexo, periodo, tempo_de_empresa, salario)
	values("Mark Zuckerberg", 38, "Masculino", "Noturno", 10, 9000000.00);
insert into tb_colaboradores(nome, idade, sexo, periodo, tempo_de_empresa, salario)
	values("Augusta Ada", 36, "Feminino", "Manhã", 25, 45000.00);
insert into tb_colaboradores(nome, idade, sexo, periodo, tempo_de_empresa, salario)
	values("Elon Musk", 50, "Masculino", "Noturno", 30, 9999999.99);
insert into tb_colaboradores(nome, idade, sexo, periodo, tempo_de_empresa, salario)
	values("Nayara Mendes", 20, "Feminino", "Noturno", 1, 4000.00);

select * from tb_colaboradores where salario > 2000;

select * from tb_colaboradores where salario < 2000;

update tb_colaboradores set salario = 10000.00 where id = 1;