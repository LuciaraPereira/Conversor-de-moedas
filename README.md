# 💱 Conversor de Moedas em Java Desafio Alura Projeto ONE

Este é um projeto simples de **conversor de moedas** que utiliza a API [ExchangeRate API](https://www.exchangerate-api.com/) para buscar as taxas de câmbio em tempo real.

## 🚀 Funcionalidades

- Conversão entre:
  - BRL (Real) ↔ USD (Dólar)
  - BRL ↔ EUR (Euro)
- Consulta de taxas de câmbio atuais usando HTTP requests.
- Estrutura modular usando classes separadas:
  - `Main` – Ponto de entrada do programa
  - `Convertor` – Lógica de conversão
  - `BuscadorDeMoedas` – Conexão com a API
  - `Moedas` – Representação dos dados da API (usando record)

## 🛠 Tecnologias

- Java 
- Biblioteca [Gson](https://github.com/google/gson) para parse de JSON
- API pública: [ExchangeRate API](https://www.exchangerate-api.com/)


