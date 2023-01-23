CREATE DATABASE db_lojagen;
use db_lojagen;

CREATE TABLE tb_produto(
id BIGINT AUTO_INCREMENT,
descricao VARCHAR(60) NOT NULL,
categoria CHAR(1) NOT NULL,
preco DECIMAL NOT NULL,
data_validade DATE,
PRIMARY KEY(id)
);

INSERT INTO tb_produto(descricao, categoria, preco, data_validade)
VALUES("FEIJÃO", "A" , 5.00, "2024-05-20");
INSERT INTO tb_produto(descricao, categoria, preco)
VALUES("MONITOR", "O", 1500.00);
INSERT INTO tb_produto(descricao, categoria, preco)
VALUES("ESCADA", "O", 300.00);
INSERT INTO tb_produto(descricao, categoria, preco)
VALUES("VIOLÃO", "O", 2600.00);
INSERT INTO tb_produto(descricao, categoria, preco, data_validade)
VALUES("WHEY-PROTEIN", "A", 105.00, "2024-05-23");
INSERT INTO tb_produto(descricao, categoria, preco)
VALUES("GUITARRA", "O", 6000.00);
INSERT INTO tb_produto(descricao, categoria, preco)
VALUES("BRIGADEIRO", "A", 5.00);

SELECT * FROM tb_produto;

SELECT * FROM tb_produto
WHERE preco > 500;

SELECT * FROM tb_produto
WHERE preco < 500;

UPDATE tb_produto
SET data_validade = "2023-01-23"
WHERE id = 7;


