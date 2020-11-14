CREATE TABLE IF NOT EXISTS cartao (
	idcartao BIGINT(20) auto_increment NOT NULL,
	nome varchar(255) NOT NULL,
	tipo ENUM('DEBITO', 'CREDITO', 'ALIMENTACAO') NOT NULL,
	limite DECIMAL NOT NULL,
	numerofinal varchar(4) NOT NULL,
	CONSTRAINT idcartao_fk PRIMARY KEY (idcartao)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;

INSERT INTO gastosdb.cartao
(idcartao, nome, tipo, limite, numerofinal)
VALUES(1, 'Nubank', 'CREDITO', 4250, '5792')
ON DUPLICATE KEY UPDATE nome="Nubank";
