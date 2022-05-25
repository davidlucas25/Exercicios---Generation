CREATE DATABASE db_farmacia_bem_estar;

USE db_farmacia_bem_estar;

CREATE TABLE tb_produtos(
	id bigint auto_increment,
	nome varchar(255),
    valor decimal(9,2),
    quantidade int,
    marca varchar(255),
	categorias_id bigint,
    
    primary key (id),
    
    -- duas maneiras de fazer a forein key
    foreign key (categoria_id) REFERENCES tb_categorias(id)
    -- categoria_id bigint REFERENCES tb_categorias(id)
);

CREATE TABLE tb_categorias(
	id bigint auto_increment, 
    nome_categoria varchar(255),
    setor varchar(255),
	
    primary key(id)
);

select * from tb_categorias;

INSERT INTO tb_categorias(nome_categoria, setor) VALUES ("Anti-Inflamatório","Medicamentos");
INSERT INTO tb_categorias(nome_categoria, setor) VALUES ("Suplementos","Fitness");

INSERT INTO tb_produtos(nome, valor, quantidade, marca, categorias_id) VALUES ("Paracetabem", 30.00, 10, "Genérico", 1);
INSERT INTO tb_produtos(nome, valor, quantidade, marca, categorias_id) VALUES ("Amoxicimol", 100.00, 10, "Genérico", 3);
INSERT INTO tb_produtos(nome, valor, quantidade, marca, categorias_id) VALUES ("Creatina", 180.00, 5, "Energia", 3);

SELECT * FROM tb_produtos WHERE valor > 50.00;

SELECT * FROM tb_produtos WHERE valor > 5.00 and valor < 60.00;

SELECT * FROM tb_produtos WHERE nome LIKE "%c%";

SELECT * FROM tb_produtos 
	INNER JOIN tb_categorias on tb_categorias.id = tb_produtos.categorias_id;
    
SELECT * FROM tb_produtos
	INNER JOIN tb_categorias on tb_categorias.id = tb_produtos.categorias_id 
	WHERE tb_categorias.setor like "%Generico%";


