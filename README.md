# Quarkus API Example

Esse projeto serve como base de API REST com endpoints que realizam operações CRUD.

## Tecnologias utilizadas

* [Quarkus](https://quarkus.io/)
* [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
* [Panache entity](https://quarkus.io/guides/hibernate-orm-panache)
* [Mapstruct](https://mapstruct.org/)
* [Flyway](https://flywaydb.org/)
* [Banco de dados PostgreSQL](https://www.postgresql.org/)
* [Docker](https://www.docker.com/)

## Estrutura de pacotes

    [domain] classes de domínio separadas em subpacotespara dto e entidades
    
    [mapper] classes referentes ao mapping de entidades e dtos
    
    [repository] respositories, a aplicação segue o padrão de uso dos repositories em vez de utilizar o persist 
    diretamente na entity.
    
    [resource] classes que provêm os recursos rest
    
    [service] services da aplicação

## Classes Genéricas de base

A API segue um modelo em que entidades que irão prover operações CRUD já podem nascer prontas, bastanto seguir o modelo extendendo as classes genericas de Mapper, Service e Resource

## Docker

No diretório src/main/docker encontram-se os arquivos referentes ao docker da aplicação, a aplicação está pré configurada para utilizar conexão com o postgres com a stack descrita no arquivo: **postgres-stack.yml**

## Flyway

A base de dados é toda criada através do flyway e as migrations podem ser encontradas em resources/db/migration

# Notas

A API de exemplo ainda está em sua primeira versão, posteriormente algumas melhorias podem ser incluídas, sinta-se a vontade para abrir alguma issue ou realizar outras contribuições com o repositório.
