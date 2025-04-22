CREATE TABLE IF NOT EXISTS usuarios (
    id                 BIGINT                AUTO_INCREMENT PRIMARY KEY,
    login              VARCHAR(100)          NOT NULL,
    senha              VARCHAR(255)          NOT NULL
);