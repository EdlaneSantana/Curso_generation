CREATE DATABASE db_escola;
USE db_escola;
DROP TABLE tb_alunos;

CREATE TABLE tb_alunos(
id BIGINT AUTO_INCREMENT,
nome VARCHAR(60) NOT NULL,
nome_mae VARCHAR(60) NOT NULL,
disciplina CHAR(1) NOT NULL,
nota DECIMAL NOT NULL,
ano_letivo INT NOT NULL,
PRIMARY KEY(id)
);

INSERT INTO tb_alunos(nome, nome_mae, disciplina, nota, ano_letivo)
VALUES("JOANA", "MARIA", "M", 7, 2023);
INSERT INTO tb_alunos(nome, nome_mae, disciplina, nota, ano_letivo)
VALUES("JOANA ANGELICA", "FRANCISCA", "P", 8, 2023);
INSERT INTO tb_alunos(nome, nome_mae, disciplina, nota, ano_letivo)
VALUES("PEDRO", "TEREZA", "P", 5, 2023);
INSERT INTO tb_alunos(nome, nome_mae, disciplina, nota, ano_letivo)
VALUES("PAULO", "PAULA", "M", 4, 2023);
INSERT INTO tb_alunos(nome, nome_mae, disciplina, nota, ano_letivo)
VALUES("PAULO", "JOANA", "M", 8, 2023);
INSERT INTO tb_alunos(nome, nome_mae, disciplina, nota, ano_letivo)
VALUES("ZE", "CRISTINA", "M", 7, 2023);
INSERT INTO tb_alunos(nome, nome_mae, disciplina, nota, ano_letivo)
VALUES("LIA", "LINDAURA", "P", 9, 2023);
INSERT INTO tb_alunos(nome, nome_mae, disciplina, nota, ano_letivo)
VALUES("RENATO", "FLORICEIA", "P", 5, 2023);

SELECT * FROM tb_alunos;

SELECT * FROM tb_alunos
WHERE nota > 7 AND disciplina = "P";

SELECT * FROM tb_alunos
WHERE nota < 7 AND disciplina = "M";

SELECT * FROM tb_alunos
WHERE nota > 7 AND disciplina = "P";

SELECT * FROM tb_alunos
WHERE nota > 7 AND disciplina = "M";

UPDATE tb_alunos
SET nome = "PAULO SERGIO"
WHERE id = 9;


