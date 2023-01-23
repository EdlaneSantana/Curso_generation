
CREATE DATABASE db_rh;
USE db_rh;


CREATE TABLE tb_colaborador(
id BIGINT AUTO_INCREMENT,
nome VARCHAR(60) NOT NULL,
data_nasc DATE NOT NULL,
data_atual TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
idade INT GENERATED ALWAYS AS (YEAR(data_atual) - year(data_nasc)),
salario DECIMAL NOT NULL,
PRIMARY KEY(id)
);


INSERT INTO tb_colaborador(nome, data_nasc, salario)
VALUES("PEDRO", "1990-04-25", 1500.00);
INSERT INTO tb_colaborador(nome, data_nasc, salario)
VALUES("MARIA", "2000-11-19", 3500.00);
INSERT INTO tb_colaborador(nome, data_nasc, salario)
VALUES("JOANA", "2001-05-19", 4500.00);
INSERT INTO tb_colaborador(nome, data_nasc, salario)
VALUES("FRANCISCA", "2003-10-17", 2500.00);
INSERT INTO tb_colaborador(nome, data_nasc, salario)
VALUES("PAULA", "1980-04-25", 5500.00);

SELECT * FROM tb_colaborador;

SELECT * FROM tb_colaborador WHERE salario>2000.00;

SELECT * FROM tb_colaborador WHERE salario<2000.00;

UPDATE tb_colaborador
SET salario = 1569
WHERE id = 1;



