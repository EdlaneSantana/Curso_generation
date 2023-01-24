CREATE DATABASE db_farmacia_bem_estar;
USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
tipo VARCHAR(20) NOT NULL,
corticoide CHAR(1) NOT NULL
);

CREATE TABLE tb_produtos(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(30) NOT NULL,
preco DECIMAL(10,2) NOT NULL,
marca VARCHAR(20) NOT NULL,
unidade_medida CHAR(2),
categoria_id BIGINT,
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);


INSERT INTO tb_categorias(tipo, corticoide)
VALUES ("DIABTES", "S");
INSERT INTO tb_categorias(tipo, corticoide)
VALUES ("COSMETICO", "N");
INSERT INTO tb_categorias(tipo, corticoide)
VALUES ("FISIOCULTURISMO", "S");
INSERT INTO tb_categorias(tipo, corticoide)
VALUES ("ANALGESICO", "N");
INSERT INTO tb_categorias(tipo, corticoide)
VALUES ("PSICOTICO", "N");


INSERT INTO tb_produtos(nome, preco, marca, unidade_medida, categoria_id)
VALUES("BASE", 99.50, "IVONE", "g", 2);
INSERT INTO tb_produtos(nome, preco, marca, unidade_medida, categoria_id)
VALUES("DOCECLEAN", 88.50, "GEOFARM", "ml", 1);
INSERT INTO tb_produtos(nome, preco, marca, unidade_medida, categoria_id)
VALUES("SABONETE", 13.80, "NATURALS", "ml", 2);
INSERT INTO tb_produtos(nome, preco, marca, unidade_medida, categoria_id)
VALUES("GARDENAL", 105.12, "GENERICO", "g", 5);
INSERT INTO tb_produtos(nome, preco, marca, unidade_medida, categoria_id)
VALUES("DIPIRONA", 20.50, "BAYER", "g", 4);
INSERT INTO tb_produtos(nome, preco, marca, unidade_medida, categoria_id)
VALUES("WHEY-PROTEIN", 99.80, "HULK", "g", 3);
INSERT INTO tb_produtos(nome, preco, marca, unidade_medida, categoria_id)
VALUES("SABONETE EM BARRA", 20.50, "PROTEX", "g", 2);
INSERT INTO tb_produtos(nome, preco, marca, unidade_medida, categoria_id)
VALUES("PERFUME", 30.00, "ALFAZEMA", "ml", 2);

SELECT * FROM tb_produtos
WHERE preco > 50.00;

SELECT * FROM tb_produtos
WHERE preco > 5.00 AND preco < 60.00;

SELECT * FROM tb_produtos WHERE nome LIKE '%C%';

SELECT * FROM tb_produtos
INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id;
 
SELECT * FROM tb_produtos
INNER JOIN tb_categorias ON tb_categorias.id = tb_produtos.categoria_id
WHERE tipo = "COSMETICO";
