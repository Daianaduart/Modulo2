-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE Cliente (
IdCliente INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
Email VARCHAR(40),
Nome VARCHAR(40),
Cpf VARCHAR(40),
idade INTEGER
)

CREATE TABLE Viagem (
IdViagem INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
volta VARCHAR(40),
Destino VARCHAR(40),
Ida VARCHAR(40),
IdCliente INTEGER,
FOREIGN KEY(IdCliente) REFERENCES Cliente (IdCliente)
)

