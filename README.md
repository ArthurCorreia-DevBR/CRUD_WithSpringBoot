<div align="center">

# ☕ PrimeiroSpringBoot

### 🚀 Minha jornada no desenvolvimento Backend com Java

Aprendendo a construir aplicações Java com Spring Boot, explorando
persistência de dados e os fundamentos do desenvolvimento de APIs.

<br>

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

</div>

---

## 📌 Sobre o projeto

Este repositório marca o início da minha jornada prática com **Spring Boot**, dando continuidade aos meus estudos em Java e desenvolvimento Backend.

O objetivo é aplicar os conhecimentos adquiridos na construção de aplicações Java, explorando os recursos do ecossistema Spring e aprendendo a trabalhar com entidades e persistência de dados.

Mais do que acompanhar exemplos, este projeto faz parte da minha evolução para desenvolver minhas próprias aplicações e APIs REST.

## 🛠️ Tecnologias e conceitos

| Tecnologia | Aplicação |
|---|---|
| ☕ Java | Linguagem principal do projeto |
| 🌱 Spring Boot | Base para o desenvolvimento da aplicação |
| 🗄️ JPA | Mapeamento de objetos Java para estruturas relacionais |
| 🏷️ Hibernate | Implementação de ORM utilizada pelo ecossistema JPA, quando configurada |
| 🔧 Git e GitHub | Versionamento e publicação do código |

## 📚 O que estou praticando?

- Estruturação de projetos com Spring Boot;
- Criação e organização de classes Java;
- Mapeamento de entidades com anotações JPA;
- Encapsulamento e organização de atributos;
- Construtores, getters e setters;
- Fundamentos para trabalhar com persistência de dados;
- Evolução dos conhecimentos em desenvolvimento Backend.

## 🧩 Primeiro modelo

Uma das classes desenvolvidas durante os estudos é a `PeopleModel`, responsável por representar dados de cadastro.

A entidade possui os seguintes atributos:

| Atributo | Descrição |
|---|---|
| `id` | Identificador do registro |
| `nome` | Nome da pessoa |
| `email` | E-mail da pessoa |
| `idade` | Idade da pessoa |

A classe utiliza anotações como `@Entity`, `@Table`, `@Id` e `@GeneratedValue` para configurar seu mapeamento com JPA.

## 💻 Como executar

### Pré-requisitos

- Java JDK compatível com a versão do projeto;
- IntelliJ IDEA ou outra IDE compatível com Java;
- Maven, caso não utilize o Maven Wrapper incluído no projeto.

### Executando localmente

**1. Clone o repositório**

```bash
git clone https://github.com/ArthurCorreia-DevBR/PrimeiroSpringBoot.git
