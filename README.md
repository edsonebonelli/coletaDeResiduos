# ♻️ Coleta de Resíduos

> Aplicação Spring Boot para automação do cadastro e coleta de resíduos, promovendo sustentabilidade e gestão eficiente.

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring--Boot-3.5.0--M3-brightgreen.svg)
![Docker](https://img.shields.io/badge/Docker-Enabled-blue.svg)
![GitHub Actions](https://img.shields.io/github/actions/workflow/status/SEU_USUARIO/coletaDeResiduos/ci.yml)

---

## 📋 Descrição

O **Coleta de Resíduos** é um sistema web RESTful que permite o gerenciamento inteligente da coleta de resíduos. Foi desenvolvido com foco em práticas modernas de DevOps, como **containerização com Docker** e **integração contínua com GitHub Actions**.

---

## ⚙️ Tecnologias

- Java 17  
- Spring Boot 3.5.0  
- Spring Data JPA  
- Flyway (migração de banco)  
- MySQL  
- Docker  
- GitHub Actions  
- Maven  

---

## 🏗️ Arquitetura do Projeto

coletaDeResiduos/ ├── src/ │ ├── main/ │ │ ├── java/br/com/fiap/coletaDeResiduos/ │ │ │ ├── controller/ │ │ │ ├── domain/ │ │ │ ├── dto/ │ │ │ ├── enums/ │ │ │ ├── infra/ │ │ │ ├── repository/ │ │ │ └── service/ │ │ └── resources/ │ │ ├── db/migration/ │ │ └── application.properties ├── .github/workflows/ci.yml ├── Dockerfile ├── pom.xml └── README.md

## 📋 Como Executar Localmente Pré-requisitos

- Java 17+
- Docker (opcional)
- Maven

## ⚙️ Via Maven

- ./mvnw spring-boot:run

## ⚙️ Via Docker

- docker build -t coleta-de-residuos .
- docker run -p 8080:8080 coleta-de-residuos

## 📦 Configurações do Banco de Dados
- O projeto utiliza MySQL e migrações com Flyway. No (application.properties) configure:
  
- spring.datasource.url=jdbc:mysql://localhost:3306/coleta
- spring.datasource.username=seu_usuario
- spring.datasource.password=sua_senha
- spring.flyway.enabled=true

## 🔐 Segurança
- A aplicação possui integração com Spring Security e autenticação via JWT.

## 🙋‍♂️ Autor
Desenvolvido por Edson e Alice — Desenvolvedores.
