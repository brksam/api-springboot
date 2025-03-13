# API Spring Boot - Produtos e FIPE

Este projeto contém duas APIs desenvolvidas em **Spring Boot**:
1. **API de Produtos**: Permite operações **CRUD** (Create, Read, Update, Delete) para gerenciar produtos.
2. **API FIPE**: Consome a API pública [FIPE](https://parallelum.com.br/fipe/api/v1) para obter informações sobre veículos.

## 📌 Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Spring Web**
- **H2 Database** (Banco de dados em memória para testes)
- **Maven**

---

## 🚀 Como Rodar o Projeto

### 🔹 1. Clonar o repositório
```bash
git clone https://github.com/seu-usuario/api-springboot.git
cd api-springboot
```

### 🔹 2. Configurar o Banco de Dados (Opcional)
O projeto usa **H2 Database** por padrão, mas pode ser configurado para MySQL ou PostgreSQL. Altere o arquivo `src/main/resources/application.properties` conforme necessário.

### 🔹 3. Compilar e Executar
```bash
mvn clean install
mvn spring-boot:run
```
O projeto estará disponível em: **http://localhost:8080**

---

## 📖 Documentação da API

### 🔹 API de Produtos (`/api/produtos`)

#### ➤ Criar um Produto (POST)
```http
POST /api/produtos
```
**Body (JSON):**
```json
{
  "nome": "Notebook Dell",
  "preco": 4500.00
}
```
**Resposta:** `201 Created`

#### ➤ Listar Produtos (GET)
```http
GET /api/produtos
```
**Resposta:** `200 OK`
```json
[
  { "id": 1, "nome": "Notebook Dell", "preco": 4500.00 }
]
```

#### ➤ Atualizar Produto (PUT)
```http
PUT /api/produtos/1
```
**Body (JSON):**
```json
{
  "nome": "Notebook Lenovo",
  "preco": 5000.00
}
```
**Resposta:** `200 OK`

#### ➤ Deletar Produto (DELETE)
```http
DELETE /api/produtos/1
```
**Resposta:** `204 No Content`

---

### 🔹 API FIPE (`/api/fipe`)

#### ➤ Consultar Tabela FIPE (GET)
```http
GET /api/fipe
```
**Resposta:** `200 OK` (Exemplo)
```json
{
  "marcas": [
    { "codigo": "1", "nome": "Chevrolet" },
    { "codigo": "2", "nome": "Fiat" }
  ]
}
```

---

## 🛠️ Testando com Postman
Se estiver testando localmente e o **Postman** apresentar erro de **localhost**, ative o **Postman Desktop Agent**.

---

## 📜 Licença
Este projeto é de código aberto sob a licença **MIT**.

📌 Criado por Samuel Souto(https://github.com/brksam).

