## Project Library

Esse projeto utiliza-se de um escopo resumido do funcionamento de um sistema de biblioteca, referente ao gerenciamento de livros e controle de empréstimos. Tem como objetivo de aplicar técnicas de desenvolvimento de APIs Rest Full em Java com Spring Boot e técnicas de desenvolvimento colaborativo com Github.

## Conceitos e tecnologias utilizadas no desenvolvimento:
- Banco de dados Postgres
- Controle de migrações do banco com Flyway
- Tratamento exceções e controle de mensagens de validação com Controller Advice
- Utilização de DTOs para classes de representação de recursos
- Documentação da API com OpenAPI


## Diagrama de Classes

<div>
  <img src="https://user-images.githubusercontent.com/61840250/222799517-8fc73ec2-afc7-4d95-9f6f-d336c095a48c.png" />
</div>

## Requisitos Funcionais
- Realizar o gerenciamento de livros
- Realizar o gerenciamento de gênero 
- Realizar o gerenciamento dos pessoas
- Realizar o gerenciamento de autores
- Realizar o gerenciamento de exemplares de livros
- Realizar empréstimo de um exemplar de livro 
    - Não pode ser realizado empréstimo para usuário suspenso
    - O número máximo de livros emprestados por usuário é de 3
- Realizar devolução de um exemplar emprestado 
- Aplicar suspensão de 15 dias ao usuário, caso ele realize a devolução do livro em atraso.
