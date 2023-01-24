CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_pizzas(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
descricao VARCHAR(20) NOT NULL,
sabor VARCHAR(20) NOT NULL,
preco DECIMAL(10,2) NOT NULL,
temperatura CHAR(6),
categoria_id BIGINT,
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);


CREATE TABLE tb_categorias(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
tipo VARCHAR(10) NOT NULL,
lactose CHAR(1) NOT NULL
);

INSERT INTO tb_categorias(tipo, lactose)
VALUES ("DOCE", "S");
INSERT INTO tb_categorias(tipo, lactose)
VALUES ("NEUTRA", "N");
INSERT INTO tb_categorias(tipo, lactose)
VALUES ("DOCE", "S");
INSERT INTO tb_categorias(tipo, lactose)
VALUES ("NEUTRA", "N");
INSERT INTO tb_categorias(tipo, lactose)
VALUES ("SALGADA", "N");

INSERT INTO tb_pizzas(descricao, sabor, preco, temperatura, categoria_id)
VALUES("MC-DONALD", "CARNE", 76.00, "GELADA", 2);
INSERT INTO tb_pizzas(descricao, sabor, preco, temperatura, categoria_id)
VALUES("NAPOLITANO", "CHOCOLATE E MORANGO", 53.00, "GELADA", 1);
INSERT INTO tb_pizzas(descricao, sabor, preco, temperatura, categoria_id)
VALUES("CATUPIRI", "FRANCO COM CATUPIRI", 92.00, "QUENTE", 4);
INSERT INTO tb_pizzas(descricao, sabor, preco, temperatura, categoria_id)
VALUES("VEGANO", "CARNE VEGANA", 45.00, "QUENTE", 3);
INSERT INTO tb_pizzas(descricao, sabor, preco, temperatura, categoria_id)
VALUES("4 QUEIJOS", "QUEIJO", 101.00, "GELADA", 2);
INSERT INTO tb_pizzas(descricao, sabor, preco, temperatura, categoria_id)
VALUES("2 QUEIJOS", "QUEIJO", 35.00, "QUENTE", 5);
INSERT INTO tb_pizzas(descricao, sabor, preco, temperatura, categoria_id)
VALUES("FRANCO", "FRANGO A PARMEGIANA", 95.00, "QUENTE", 5);
INSERT INTO tb_pizzas(descricao, sabor, preco, temperatura, categoria_id)
VALUES("DIA DE FESTA", "BRIGADEIRO", 39.00, "QUENTE", 1);

SELECT * FROM tb_pizzas
WHERE preco > 45.00;

SELECT * FROM tb_pizzas
WHERE preco < 50.00 AND preco < 100.00;

SELECT * FROM tb_pizzas WHERE descricao LIKE '%M%';

SELECT * FROM tb_pizzas
INNER JOIN tb_categorias ON tb_pizzas.categoria_id = tb_categorias.id;

SELECT * FROM tb_pizzas
INNER JOIN tb_categorias ON tb_pizzas.categoria_id = tb_categorias.id
WHERE tb_categorias.tipo = "DOCE";










