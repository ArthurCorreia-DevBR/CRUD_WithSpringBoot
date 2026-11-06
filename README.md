# ☕ CRUD com Java e Spring Boot

Projeto de API RESTful desenvolvido com Java e Spring Boot, focado em boas práticas de arquitetura backend, persistência de dados, tratamento global de exceções e padronização de respostas de erro da aplicação.

---

## 📌 Sobre o Projeto

Este projeto consiste em um sistema de cadastro e gerenciamento de usuários (CRUD), desenvolvido para aplicar conceitos fundamentais e avançados do ecossistema Spring.

Nas últimas atualizações, o foco principal foi o refatoramento do tratamento de exceções e o fortalecimento das regras de negócio, garantindo retornos HTTP adequados e respostas consistentes para o cliente da API.

### 🚀 Principais Melhorias Recentes
- Padronização de Respostas de Erro: Implementação da classe ExceptionResponse para manter um payload previsível e estruturado em cenários de falha.
- Tratamento Global de Exceções: Centralização do tratamento de erros com @RestControllerAdvice e métodos anotados com @ExceptionHandler.
- Tratamento de Campos Opcionais: Correção de NullPointerException no cadastro de usuários sem idade declarada, tornando a informação opcional sem comprometer a aplicação.
- Ajuste de Status HTTP: Readequação do código de status para e-mails duplicados para 409 CONFLICT, seguindo as convenções e padrões do protocolo REST.

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database (banco de dados em memória para ambiente de testes e desenvolvimento)
- Lombok (redução de código boilerplate)
- Maven (gerenciamento de dependências)

---

## 📑 Endpoints da Aplicação

Método | Endpoint | Descrição | Status de Sucesso
POST | /users | Cadastra um novo usuário | 201 CREATED
GET | /users | Lista todos os usuários cadastrados | 200 OK
GET | /users/{id} | Busca um usuário específico pelo ID | 200 OK
PUT | /users/{id} | Atualiza os dados de um usuário existente | 200 OK
DELETE | /users/{id} | Remove um usuário pelo ID | 204 NO CONTENT

---

## ⚠️ Tratamento de Exceções e Respostas da API

Quando ocorre algum erro na requisição, a API retorna uma resposta estruturada seguindo o modelo da classe ExceptionResponse:

{
  "timestamp": "2026-11-06T13:19:00",
  "status": 409,
  "error": "Conflict",
  "message": "O e-mail informado já está cadastrado no sistema.",
  "path": "/users"
}

### Exceções Mapeadas:
- 404 NOT FOUND: Usuário não encontrado pelo ID informado.
- 409 CONFLICT: Tentativa de cadastro de e-mail já existente.
- 400 BAD REQUEST: Falha de validação nos campos enviados na requisição.
- 500 INTERNAL SERVER ERROR: Erros inesperados e genéricos do servidor.

---

## ⚙️ Como Executar o Projeto Localmente

### Pré-requisitos
- Java JDK 17 ou superior instalado.
- Maven instalado (ou utilizar o wrapper ./mvnw).

### Passo a passo

1. Clone o repositório:
git clone https://github.com/ArthurCorreia-DevBR/CRUD_WithSpringBoot.git

2. Acesse o diretório do projeto:
cd CRUD_WithSpringBoot

3. Execute a aplicação via Maven:
./mvnw spring-boot:run
(No Windows: mvnw.cmd spring-boot:run)

4. Acesse o banco de dados H2 (opcional):
- URL Console: http://localhost:8080/h2-console
- JDBC URL: jdbc:h2:mem:testdb
- User: sa
- Password: (deixar em branco)

---

## 👤 Autor

Desenvolvido por Arthur Correia.

GitHub: https://github.com/ArthurCorreia-DevBR
