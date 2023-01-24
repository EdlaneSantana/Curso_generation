CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_personagens(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(20) NOT NULL,
autor VARCHAR(30) NOT NULL,
ano INT(4) NOT NULL,
edicao INT(2) NOT NULL
);

CREATE TABLE tb_classes(
id BIGINT AUTO_INCREMENT PRIMARY KEY,
poder_ataque INT NOT NULL,
poder_defesa INT NOT NULL
);

ALTER TABLE tb_personagens ADD classes_id BIGINT;

ALTER TABLE tb_personagens ADD CONSTRAINT fk_personagens_categorias
FOREIGN KEY (classes_id) REFERENCES tb_classes(id);

INSERT INTO tb_classes(poder_ataque, poder_defesa)
VALUES(200, 1000);
INSERT INTO tb_classes(poder_ataque, poder_defesa)
VALUES(6000, 2000);
INSERT INTO tb_classes(poder_ataque, poder_defesa)
VALUES(5000, 5000);
INSERT INTO tb_classes(poder_ataque, poder_defesa)
VALUES(7000, 6000);
INSERT INTO tb_classes(poder_ataque, poder_defesa)
VALUES(5500, 1500);

SELECT * FROM tb_classes;
SELECT * FROM tb_personagens;

INSERT INTO tb_personagens(nome, autor, ano, edicao, classes_id)
VALUES("HOMEM-ARANHA", "DESCONHECIDO", 200, 2, 1);
INSERT INTO tb_personagens(nome, autor, ano, edicao, classes_id)
VALUES("THOR", "DESCONHECIDO", 200, 3, 2);
INSERT INTO tb_personagens(nome, autor, ano, edicao, classes_id)
VALUES("HULK", "DESCONHECIDO", 2010, 4, 1);
INSERT INTO tb_personagens(nome, autor, ano, edicao, classes_id)
VALUES("ARANHA MEN", "DESCONHECIDO", 2005, 5, 1);
INSERT INTO tb_personagens(nome, autor, ano, edicao, classes_id)
VALUES("HOMEM-ARANHA", "DESCONHECIDO", 2007, 6, 1);
INSERT INTO tb_personagens(nome, autor, ano, edicao, classes_id)
VALUES("MORGANA", "DESCONHECIDO", 2000, 7, 4);
INSERT INTO tb_personagens(nome, autor, ano, edicao, classes_id)
VALUES("SABRINA", "DESCONHECIDO", 1900, 8, 4);
INSERT INTO tb_personagens(nome, autor, ano, edicao, classes_id)
VALUES("HOMEM DE FERRO", "DESCONHECIDO", 2001, 9, 1);

SELECT nome, autor, ano, edicao, classes_id FROM tb_personagens 
INNER JOIN tb_classes ON tb_classes.id = tb_personagens.classes_id;

SELECT * FROM tb_classes 
INNER JOIN tb_personagens ON tb_personagens.classes_id=tb_classes.id 
WHERE tb_classes.poder_ataque > 2000;

SELECT * FROM tb_classes 
INNER JOIN tb_personagens ON tb_personagens.classes_id=tb_classes.id 
WHERE tb_classes.poder_defesa > 1000 AND tb_classes.poder_defesa < 2000;

SELECT * FROM tb_personagens WHERE nome LIKE '%C%';

SELECT * FROM tb_classes 
INNER JOIN tb_personagens ON tb_personagens.classes_id=tb_classes.id 
WHERE tb_personagens.classes_id = 1 ;














