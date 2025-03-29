# Calculadora de IMC em Java 💪

Este é um projeto simples de uma **Calculadora de IMC (Índice de Massa Corporal)**, feita em Java, ideal para iniciantes.  
O programa recebe o peso (em kg) e a altura (em centímetros), calcula o IMC e exibe a classificação de acordo com as faixas da OMS.

## 🛠 Tecnologias utilizadas

- Java (JDK 8 ou superior)
- Console (entrada e saída via terminal)

## 🚀 Como usar

1. Compile os arquivos:
   ```
   javac Main.java IMCCalculadora.java IMCClassificador.java
   ```

2. Execute o programa:
   ```
   java Main
   ```

3. Digite os dados solicitados:
   - **Peso** em quilogramas (ex: `70`)
   - **Altura** em centímetros (ex: `175`)

O programa vai calcular seu IMC e mostrar a classificação.

## 📊 Faixas de classificação

| IMC                   | Classificação        |
|-----------------------|----------------------|
| Menor ou igual a 18.5 | Abaixo do peso       |
| 18.6 – 24.9           | Peso normal          |
| 25.0 – 29.9           | Sobrepeso            |
| 30.0 – 34.9           | Obesidade grau I     |
| 35.0 – 39.9           | Obesidade grau II    |
| 40.0 ou mais          | Obesidade grau III   |

## 📁 Estrutura do projeto

```
.
├── Main.java
├── IMCCalculadora.java
├── IMCClassificador.java
└── README.md
```

## ✍️ Autor

Feito com 💻 por Ícaro Lyra Rangel Tercio
