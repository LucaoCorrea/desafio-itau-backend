# Desafio Itaú Júnior - Backend Java

Este repositório contém a solução para o desafio de backend proposto pelo Itaú, desenvolvido em Java. O objetivo do desafio foi criar uma API RESTful para gerenciar transações e fornecer estatísticas sobre essas transações.

## Repositório Original

O desafio foi baseado no repositório disponível em: [https://github.com/feltex/desafio-itau-backend](https://github.com/feltex/desafio-itau-backend).

## Aprendizados

Durante o desenvolvimento deste projeto, pude aprender e aprimorar meus conhecimentos em:

- **API RESTful**: Desenvolvimento de endpoints para criação, exclusão e consulta de transações.
- **Spring Boot**: Utilização do framework Spring Boot para criar aplicações Java de forma rápida e eficiente.
- **Validação de Dados**: Uso de anotações como `@Valid` e `@NotNull` para garantir a integridade dos dados recebidos.
- **Manipulação de Datas**: Trabalhei com `OffsetDateTime` para lidar com datas e horários das transações.
- **Estatísticas em Tempo Real**: Implementação de uma funcionalidade que calcula estatísticas (soma, média, mínimo, máximo e contagem) das transações dos últimos 60 segundos.

## Agradecimentos

Gostaria de agradecer ao [Matheus Leandro Ferreira](https://www.linkedin.com/in/matheus-leandro-ferreira/) pelo vídeo tutorial que me ajudou a entender melhor o desafio e a implementar a solução. O vídeo pode ser acessado aqui: [https://www.youtube.com/watch?v=VqsXgE2RVtQ](https://www.youtube.com/watch?v=VqsXgE2RVtQ).

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **TransactionService.java**: Serviço responsável por gerenciar as transações e calcular as estatísticas.
- **Transaction.java**: Modelo que representa uma transação.
- **StatisticsResponse.java**: DTO (Data Transfer Object) para encapsular as estatísticas das transações.
- **TransactionRequest.java**: DTO para receber os dados de uma nova transação.
- **StatisticsController.java**: Controlador que expõe o endpoint para obter as estatísticas das transações.
- **TransactionController.java**: Controlador que expõe os endpoints para criar e limpar transações.
- ## Como Executar o Projeto

1.  Clone o repositório:

        git clone https://github.com/LucaoCorrea/desafio-itau-backend.git

2.  Navegue até o diretório do projeto:

        cd desafio-itau-backend

3.  Execute o projeto com Maven:

        mvn spring-boot:run

4.  A API estará disponível em `http://localhost:8080`.

## Endpoints da API

### Criar uma Transação

- **POST** `/transacao`

  - **Body**:

        {
          "valor": 100.0,
          "dataHora": "2023-10-01T10:00:00Z"
        }

  - **Resposta**: `201 Created` se a transação for criada com sucesso.

### Limpar Transações

- **DELETE** `/transacao`

  - **Resposta**: `200 OK` se as transações forem limpas com sucesso.

### Obter Estatísticas

- **GET** `/estatistica`

  - **Resposta**:

        {
          "count": 5,
          "sum": 500.0,
          "avg": 100.0,
          "min": 50.0,
          "max": 150.0
        }

## Prints do Postman

Aqui estão alguns exemplos de como os endpoints podem ser testados usando o Postman:

### Criar uma Transação

![Criar Transação](https://github.com/LucaoCorrea/desafio-itau-backend/blob/main/PostmanPrints/PostTransactions.png?raw=true)

> Tela do Postman com o método POST na Endpoint `/transacao`, criando uma transação.

### Limpar Transações

![Limpar Transações](https://github.com/LucaoCorrea/desafio-itau-backend/blob/main/PostmanPrints/DeleteTransactions.png?raw=true)

> Tela do Postman com o método DELETE na Endpoint `/transacao`, deletando uma transação.

### Obter Estatísticas

![Obter Estatísticas](https://github.com/LucaoCorrea/desafio-itau-backend/blob/main/PostmanPrints/GetStatistics.png?raw=true)

> Tela do Postman com o método GET na Endpoint `/estatistica`, retornando estatísticas da transação.

## Conclusão

Este desafio foi uma excelente oportunidade para praticar e aprimorar minhas habilidades em desenvolvimento backend com Java e Spring Boot. Aprendi muito sobre como construir APIs RESTful eficientes e como lidar com validações e estatísticas em tempo real.

Sinta-se à vontade para explorar o código e contribuir com melhorias!

[Meu LinkedIn.](https://www.linkedin.com/in/lucas-corr%C3%AAa-222422256/)
