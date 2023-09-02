# Cadastro de Funcionarios
O objetivo deste projeto foi desenvolver um sistema web em Java para o cadastro de funcionários de uma empresa, no qual é possível registrar departamentos, cargos e, por fim, os funcionários.
# Indice
- Funcionalidades
- Regra de Negócios
- Tecnologias, bibliotecas e ferramentas utilizadas
- Arquitetura
- Como rodar
## Funcionalidades
- [x] Cadastrar, excluir e editar Departamentos
- [x] Cadastrar, excluir e editar Cargos
- [x] Cadastrar, excluir e editar Funcionários

## Regras de Negócio
Para as regras de negócio foram usados os seguintes critérios requistos:
- Os nomes dos Departamentos devem ser exclusivos.
- Os nomes de cargos devem ser únicos, a menos que pertençam a diferentes departamentos.
- Cada funcionário está associado a um cargo, e cada cargo está associado a um departamento.
- A exclusão de um cargo não é permitida se houver funcionários associados a ele.
- A exclusão de um departamento não é permitida se houver cargos associados a ele.
## Arquitetura
Para este projeto, adotou-se a **Arquitetura Em Camadas**, onde as responsabilidades estão divididas e centralizadas em contextos específicos, bem como o estilo arquitetural **REST**.
- **Camada Web:** contém outras subcamadas que juntas são responsáveis por receber as requisisões de clientes e verificar se os dados recebidos contém todos os requisitos.
- **Camada Service:** é responsável por conter toda a regra de negócio da aplicação.
- **Camada Repository:** é reponsável pela conexão com o Banco de Dados e por realizar as consultas e operações relacionadas à persistência de dados.
- **Camada Model:** contém as entidades de domínio da aplicação.
- **Camada Infra:** é responsável por tratar todas as exceções e devolver respostas personalizadas para o cliente.

Além de toda essa estrutura, foi implementado um controlador exclusivo para a entrega das páginas HTML. Nessas páginas, são realizadas requisições AJAX, e os dados são renderizados usando JavaScript puro.

## Tecnologias, bibliotecas e ferramentas utilizadas
### Backend
- Java
- Spring boot, Spring Validation e Spring Data JPA
- Hibernate
- PostgreSQL
- API's RESTful
- Padrão DTO
  
### Frontend
- HTML, CSS e Bootstrap
- JavaScript e requisições AJAX

## Como rodar o projeto
### Requisitos
- JDK 17+  intalado
- PostgreSql (Preferencialmente)
### Passo à passo Banco PostgresSQL
- Baixar uma cópia do projeto deste repositório (git clone https://github.com/danison00/Cadastro-de-Funcionarios.git)
- Criar uma instância de banco PostgreSQL 
- Acessar o arquivo *application.properties* no projeto
- Descomentar o bloco de código entitulado **#Postgre Local** e editar adicionando o nome do banco criado, usuário e senha nos locais indicados
- Executar o projeto
- Acessa http://localhost:8080/home

### Passo à passo Banco em Memória
- Baixar uma cópia do projeto deste repositório (git clone https://github.com/danison00/Cadastro-de-Funcionarios.git)
- Acessar o arquivo *application.properties* no projeto
- Descomentar o bloco de código entitulado **#Banco em memória** 
- Executar o projeto
- Acessa http://localhost:8080/home


