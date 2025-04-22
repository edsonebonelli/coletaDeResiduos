CREATE TABLE rotas (
    id                   BIGINT                AUTO_INCREMENT        PRIMARY KEY,
    nome_da_rota         VARCHAR(100)          NOT NULL,
    data_da_coleta       DATE                  NOT NULL,
    hora_de_inicio       TIME                  NOT NULL,
    hora_de_termino      TIME                  NOT NULL,
    distancia_rota       VARCHAR(10)           NOT NULL,
    status_cliente       VARCHAR(20)           NOT NULL,
    tipo_cliente         VARCHAR(20)           NOT NULL
);


