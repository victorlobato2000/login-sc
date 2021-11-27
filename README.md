## _Projeto - Login_

---

O que foi usado para este projeto?

- Spring Boot;
- Spring Web;
- Spring Security;
- Spring Data JPA;
- MySQL;
- Intellij;
- Postman.
-----------
### Observações sobre o projeto:

- Para testar o projeto com um novo usuário, você pode criá-lo no Banco de Dados ou criar dentro da classe **Dados**;
- Caso tenha o XAMPP instalado, é possivel acessar o BD pelo caminho : localhost/phpmyadmin que será direcionado a uma interface gráfica;
- Para criar um novo usuario, é necessario criar uma senha, segue o link:
**Bcrypt-Generator.com = https://bcrypt-generator.com/**;
- Para testar a autenticação para as páginas de cada usuário, é possivel usar o Postman e acessar algum dos caminhos desejados:
 1. http://localhost:8080/home - apenas o USUARIO tem acesso;
 2. http://localhost:8080/adm - apenas o ADM tem acesso.
 - Para acessar a página de algum dos caminhos falados acima, é necessário ir em _Authorization_ (setar como Basic Auth) dentro do Postman, depois disso, insira o usuario e senha.

**Projeto concluído**

