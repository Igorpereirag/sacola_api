# sacola-api
API RESTful para Servir uma Aplicação com Domínio de Delivery
simulando um carinho de compras de aplicações de delivery semelhante ao IFOOD

**Funcionalidades:**
1. **Incluir itens na sacola:** Adicione produtos à sua sacola de compras de forma fácil e rápida.
2. **Visualizar sacola:** Tenha uma visão detalhada dos itens presentes em sua sacola como a quantidade de produtos inseridos,valor unitário e total dos itens antes de finalizar a compra.
3. **Fechar sacola:** Conclua suas compras de maneira simples, garantindo uma experiência de checkout eficiente.
4. **Excluir item da sacola:** Remova produtos indesejados da sacola com um clique, proporcionando flexibilidade ao usuário.

Aqui estão os endpoints e rotas para o código fornecido:

```markdown
# Endpoints e Rotas

A seguir estão os endpoints disponíveis nesta API.

## Incluir Item na Sacola

### Endpoint:
```
POST /sacola-api/sacolas
```

### Descrição:
Inclui um item na sacola.

### Parâmetros de Requisição:
- Corpo (Body): ItemDto

### Exemplo de Uso:
```json
POST /sacola-api/sacolas

{
  "nome": "Nome do Item",
  "quantidade": 3,
  "valorUnitario": 19.99
}
```
 # Endpoints e Rotas
## Ver Sacola

### Endpoint:
```
GET /sacola-api/sacolas/{id}
```

### Descrição:
Recupera informações sobre uma sacola específica.

### Parâmetros de Requisição:
- `id` (PathVariable): ID da sacola que você deseja visualizar.

### Exemplo de Uso:
```json
GET /sacola-api/sacolas/123
```

## Fechar Sacola

### Endpoint:
```
PATCH /sacola-api/sacolas/fecharSacola/{sacolaId}
```

### Descrição:
Fecha uma sacola existente com a opção de especificar a forma de pagamento.

### Parâmetros de Requisição:
- `sacolaId` (PathVariable): ID da sacola que você deseja fechar.
- `formaPagamento` (RequestParam): Forma de pagamento (inteiro).

### Exemplo de Uso:
```json
PATCH /sacola-api/sacolas/fecharSacola/456?formaPagamento=1
```

Lembre-se de substituir os valores de exemplo pelos dados reais ao fazer as solicitações. Certifique-se de seguir a documentação fornecida para garantir o uso correto desses endpoints.
```

 Baixa e importe a [Collection](postman_collection/Sacola-API.postman_collection.json) deste projeto para interagir com a api




**Ferramentas**
Antes de começar, certifique-se de ter as seguintes ferramentas instaladas em sua máquina:

- **Java JDK:** Versão 8 ou superior.
- **Git:** Versão 2.**.
- **Gradle:** Versão 7.**.
- **Postman:** Versão 9.**.

**Recomendação para utilização:**
Para uma experiência mais fluida durante autilização da api, sugiro instalar o **IntelliJ IDEA**
e executar o projeto diretamente pela IDE. Tambem é posivel utilizando o VS CODE com a 
instalação de extensões do package java


<h3>Tecnologias Utilizadas</h3>

<table>
<tr>
	<th>Dependência</th>
	<th>Versão</th>
</tr>
<tr>
	<td>spring initialzr</td>
	<td><a href="https://start.spring.io/">https://start.spring.io/</a></td>
</tr>
<tr>
	<td>spring-boot-starter-web</td>
	<td>2.7.4</td>
</tr>
<tr>
	<td>spring-boot-starter-data-jpa</td>
	<td>2.7.4</td>
</tr>
<tr>
	<td>lombok</td>
	<td>1.18.24</td>
</tr>
<tr>
	<td>springfox-boot-starter</td>
	<td>3.0.0</td>
</tr>
<tr>
	<td>h2</td>
	<td>2.1.214</td>
</tr>
</table>

STATUS: EM ANDAMENTO




