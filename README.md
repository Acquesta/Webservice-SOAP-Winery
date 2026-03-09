# Checkpoint 1 - Web Service SOAP (Winery) 

Projeto desenvolvido para a disciplina de Arquitetura SOA e Web Services. O objetivo desta atividade é aplicar os conceitos iniciais de arquitetura orientada a serviços (SOA), desenvolvendo um Webservice SOAP do lado da publicação (Server) e do consumo (Client).

## 👥 Integrantes da Equipe
Este projeto foi desenvolvido por:

1. Alexia Ramalho (RM:558385)
2. Enzo Real (RM:557943)
3. Gustavo Pasquini (RM:555454)
4. Hellen Silva (RM:559008)
5. Lorenzo Adinolfi (RM:557397)

**Professor:** Carlos Eduardo Machado de Oliveira

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java (versão 17 ou superior)
* **Build Automation:** Maven
* **Especificação:** Jakarta EE (JAX-WS) com as dependências `jaxws-rt` e o plugin `jaxws-maven-plugin`

## 📁 Estrutura do Projeto
O repositório está dividido em duas partes principais, simulando um ambiente real de fornecimento e consumo de serviços:

* `/Winery/Publisher/WinerySys`: Aplicação servidora que publica os serviços `WineStockService` e `WineWarningService` nas portas locais 8085 e 8086.
* `/Winery/Consumer/WineStockClient`: Aplicação cliente que consome o serviço para consultar a lista de vinhos (`getMenu`).
* `/Winery/Consumer/WineOrderClient`: Aplicação cliente que realiza pedidos (`placeOrder`) e consome alertas de estoque (`sendWarn`).

## 🚀 Como Executar

### 1. Iniciando o Servidor (Publisher)
1. Navegue até o projeto `WinerySys`.
2. Execute a classe driver `Loader`.
3. Verifique no console a mensagem "Serviço publicado!" e confirme a disponibilidade acessando os endpoints no navegador.

### 2. Executando os Clientes (Consumers)
1. Certifique-se de que o servidor (`WinerySys`) está rodando.
2. Nos projetos `WineStockClient` e `WineOrderClient`, utilize o Maven para realizar o `build` (isso gerará as classes necessárias via `wsimport`).
3. Execute a classe `ApplicationClient1` no projeto de estoque para ver o menu no console.
4. Execute a classe `ApplicationClient2` no projeto de pedidos para registrar uma ordem e ver os alertas no console.
