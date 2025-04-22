CREATE TABLE clientes (
    id                 BIGINT                AUTO_INCREMENT PRIMARY KEY,
    nome               VARCHAR(100)          NOT NULL,
    email              VARCHAR(100)          NOT NULL,
    telefone           VARCHAR(16)           NOT NULL,
    cpf                VARCHAR(14)           NOT NULL,
    data_cadastro      DATE                  NOT NULL,
    status_cliente     VARCHAR(20)           NOT NULL,
    tipo_cliente       VARCHAR(20)           NOT NULL,
    logradouro         VARCHAR(100)          NOT NULL,
    numero             VARCHAR(6)            NOT NULL,
    complemento        VARCHAR(100)          NOT NULL,
    bairro             VARCHAR(50)           NOT NULL,
    cidade             VARCHAR(50)           NOT NULL,
    estado             VARCHAR(50)           NOT NULL,
    cep                VARCHAR(11)           NOT NULL
);
