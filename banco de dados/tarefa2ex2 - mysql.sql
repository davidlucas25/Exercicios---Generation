create database db_brecho;

use db_brecho;

create table tb_produtos (
	id bigint auto_increment,
    nome varchar(20),
    tipo varchar(20),
    tamanho varchar(20),
    cor varchar(20),
    sexo varchar(20),
    preco decimal(7,2),
    
    primary key(id)
    );
    
    insert into tb_produtos(nome, tipo, tamanho, cor, sexo, preco)
		values("Camiseta Nick", "Camiseta", "M", "Preta", "Masculina",20.90); 
	 insert into tb_produtos(nome, tipo, tamanho, cor, sexo, preco)
		values("Camiseta Nick", "Camiseta", "P", "Preta", "Feminina",25.90); 
	 insert into tb_produtos(nome, tipo, tamanho, cor, sexo, preco)
		values("Camiseta Adydas", "Camiseta", "GG", "Azul", "Masculina",39.99);
	 insert into tb_produtos(nome, tipo, tamanho, cor, sexo, preco)
		values("Jaqueta jeans", "Jaqueta", "M", "Azul", "Unissex", 79.99);
	 insert into tb_produtos(nome, tipo, tamanho, cor, sexo, preco)
		values("Air Nick", "Tênis", "M", "Branco", "Feminino", 69.99);
	 insert into tb_produtos(nome, tipo, tamanho, cor, sexo, preco)
		values("Calça moletom", "Calça", "G", "Preta", "Masculina", 70.99);
	 insert into tb_produtos(nome, tipo, tamanho, cor, sexo, preco)
		values("Saia", "Saia", "P", "Amarela", "Feminina", 19.99);
	 insert into tb_produtos(nome, tipo, tamanho, cor, sexo, preco)
		values("Calça moletom", "Calça", "M", "Azul", "Unissex", 48.99);
        
	select * from tb_produtos where preco > 50;
    
    select * from tb_produtos where preco < 50;
    
    select * from tb_produtos where id = 2;
    
    update tb_produtos set preco = 29.90 where id = 7;
    
    delete from tb_produtos where id = 2;
    delete from tb_produtos where id = 3;
    
	
    