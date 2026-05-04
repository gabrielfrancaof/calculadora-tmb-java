# 🖩 Calculadora de Taxa Metabólica Basal (TMB) e GET em Java

Este é um projeto desenvolvido em **Java** para calcular a Taxa Metabólica Basal (TMB) e o Gasto Energético Total (GET) de um usuário, com base em suas características físicas e nível de atividade.

O projeto foi construído como parte do meu desenvolvimento na área de Engenharia de Software, focando em utilizar lógicas estruturadas da Orientação a Objetos (POO) e aplicando boas práticas (Clean Code e Princípio DRY).

## 🚀 Funcionalidades
- Recebe dados do usuário via console (peso, altura, idade, sexo e nível de atividade).
- Isola os dados do usuário em um modelo de domínio (Pessoa).
- Calcula a Taxa Metabólica Basal (TMB) utilizando a equação de **Mifflin-St Jeor** (padrão ouro atual recomendado por nutricionistas).
- Calcula o Gasto Energético Total (GET) aplicando multiplicadores de atividade física.
- Tratamento de exceções básicas (dados inválidos) e formatação de saída para o padrão US (ponto flutuante).

## 🧠 Arquitetura e POO
O projeto foi intencionalmente dividido em três classes para respeitar o princípio da **Responsabilidade Única**:
1. **`Pessoa`**: Classe de modelo (Molde) que guarda os atributos físicos (peso, altura, idade, sexo, atividade). Não possui métodos de cálculo.
2. **`CalculadoraNutricional`**: O "Cérebro" (Service). Não possui interface com o usuário (Scanner ou Prints). Apenas recebe o objeto `Pessoa`, processa a matemática e devolve os resultados double.
3. **`Main`**: A porta de entrada do software. Lida exclusivamente com a interação do usuário (I/O), instancia os objetos e exibe o resultado formatado.

## 🧮 A Matemática 
A fórmula utilizada para o cálculo da TMB é:
- **Homens:** `(10 x peso em kg) + (6.25 x altura em cm) - (5 x idade em anos) + 5`
- **Mulheres:** `(10 x peso em kg) + (6.25 x altura em cm) - (5 x idade em anos) - 161`

A fórmula utilizada para o cálculo do GET é:
- **Sedentário:** `(pouco ou nenhum exercício): TMB x 1,2`
- **Leve:** `(exercício leve 1-3 dias/semana): TMB 1,375`
- **Moderado:** `(exercício moderado 3-5 dias/semana): TMB x 1,55`
- **Ativo:** `(exercício pesado 6-7 dias/semana): TMB x 1,725`

## 💻 Como executar o projeto
1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.
2. Clone este repositório:
   ```bash
   git clone https://github.com/gabrielfrancaof/calculadora-tmb-java.git
