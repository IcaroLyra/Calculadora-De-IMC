# 💪 Calculadora de IMC em Java

Projeto de estudo com entrada e saída pelo terminal. Recebe peso em quilogramas e altura em centímetros, calcula `peso / (alturaEmMetros × alturaEmMetros)` e exibe uma classificação implementada no código.

## Tecnologias

- Java: JDK 8 ou superior.
- `Scanner` para leitura de dados.
- Classes separadas para entrada, cálculo e classificação.

## Como compilar e executar

Com `javac` e `java` disponíveis, execute na raiz do repositório:

```sh
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```

Informe os dados solicitados, por exemplo:

- Peso: `70` kg.
- Altura: `175` cm.

O resultado numérico esperado nesse exemplo é aproximadamente `22,86`, com a mensagem `Peso normal`. O separador decimal exibido depende da configuração regional do Java.

## Organização

| Arquivo | Responsabilidade |
| --- | --- |
| `src/Main.java` | Entrada dos dados e exibição do resultado |
| `src/IMCCalculadora.java` | Cálculo do IMC e conversão da altura de centímetros para metros |
| `src/IMCClassificador.java` | Classificação do valor calculado |

## Regras presentes na implementação

A tabela abaixo descreve o comportamento atual do programa.

| Condição no código | Mensagem |
| --- | --- |
| IMC ≤ 18,5 | Abaixo do peso |
| 18,5 < IMC ≤ 24,9 | Peso normal |
| 24,9 < IMC ≤ 29,9 | Sobrepeso |
| 29,9 < IMC ≤ 34,9 | Obesidade grau I |
| 34,9 < IMC ≤ 39,9 | Obesidade grau II |
| IMC > 39,9 | Obesidade grau III |

## Limitações e melhorias pendentes

- Não valida peso e altura positivos nem impede altura zero.
- Entradas não numéricas podem interromper o programa.
- A leitura de números decimais depende da configuração regional do `Scanner`.
- Os limites do classificador precisam de revisão e testes de fronteira; a tabela documenta a implementação e não valida critérios clínicos.
- Não há testes automatizados.

Projeto educacional; não se destina a orientar decisões de saúde.

## Autor

Ícaro Lyra Rangel Tercio.
