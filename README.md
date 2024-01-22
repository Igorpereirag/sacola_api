# sacola-api
API RESTful para Servir uma Aplicação com Domínio de Delivery
simulando um carinho de compras de aplicações de delivery semelhante ao IFOOD

**Funcionalidades:**
1. **Incluir itens na sacola:** Adicione produtos à sua sacola de compras de forma fácil e rápida.
- **Endpoint:** `POST /sacola-api/sacolas`
   - **Descrição:** Adiciona um item à sacola com base nos detalhes fornecidos no corpo da solicitação.
   
2. **Visualizar sacola:** Tenha uma visão detalhada dos itens presentes em sua sacola como a quantidade
 de produtos inseridos,valor unitário e total dos itens antes de finalizar a compra.
 - **Endpoint:** `GET /sacola-api/sacolas/{id}`
   - **Descrição:** Recupera informações sobre uma sacola específica com base no ID fornecido.

3. **Fechar sacola:** Conclua suas compras de maneira simples, garantindo uma experiência de checkout 
eficiente.
- **Endpoint:** `PATCH /sacola-api/sacolas/fecharSacola/{sacolaId}`
   - **Descrição:** Fecha uma sacola existente, permitindo a especificação da forma de pagamento.

4. **Excluir item da sacola:** Remova produtos indesejados da sacola com um clique, proporcionando flexibilidade ao usuário. 
- **Endpoint:** `PATCH /removerItem/{id} `
   - **Descrição:** Remove um item especificado da sacala


**Exemplo de Uso:**
   Baixa e importe a [Collection](postman_collection/Sacola-API.postman_collection.json) no postaman com dados prontos para interagir com a api





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






