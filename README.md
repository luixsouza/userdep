# User and Department API

## Visão Geral
Este projeto consiste em uma API REST para gerenciar usuários e departamentos. Ele utiliza Spring Boot, JPA para mapeamento objeto-relacional, e o banco de dados H2. 

### Casos de Uso
- **Buscar todos os usuários**: Retorna uma lista de todos os usuários cadastrados.
- **Buscar usuário pelo ID**: Retorna as informações de um usuário específico.
- **Inserir um novo usuário**: Adiciona um novo usuário ao sistema.

## Tecnologias Utilizadas
- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Postman (para testar a API)

## Funcionalidades
1. **Modelo de Domínio**: Define as entidades `User` e `Department`.
2. **Banco de Dados H2**: Configuração de banco de dados em memória.
3. **EndPoints REST**:
   - `GET /users`: Retorna todos os usuários.
   - `GET /users/{id}`: Retorna o usuário com o ID especificado.
   - `POST /users`: Insere um novo usuário.
