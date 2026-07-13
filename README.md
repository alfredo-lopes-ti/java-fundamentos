# ☕ Java — Fundamentos

Repositório dedicado à prática dos fundamentos da linguagem Java: sintaxe básica, controle de fluxo, arrays e manipulação de strings. É o ponto de partida antes de avançar para orientação a objetos.

> 💡 Este repositório cobre a **sintaxe da linguagem**. Para conceitos de Orientação a Objetos (classes, encapsulamento, herança, interfaces, coleções), veja o repositório [`java-orientacao-a-objetos`](https://github.com/alfredo-lopes-ti/java-orientacao-a-objetos).

---

## 🛠️ Tecnologias e Ferramentas
* **Linguagem:** Java 17+
* **Gerenciador de Dependências:** Maven
* **IDE:** IntelliJ IDEA

---

## 📂 Organização do Repositório

O projeto segue a estrutura padrão do Maven (`src/main/java/`), organizada em módulos numerados por ordem de aprendizado. Cada exercício fica em seu próprio pacote/pasta e inclui um comentário Javadoc no topo do `Main.java` com o enunciado do problema.

| Módulo | Conceito Praticado | Exercícios |
| :--- | :--- | :--- |
| `📦 _01_sintaxe_basica` | Variáveis, tipos primitivos, casting, operadores aritméticos, `Scanner`, `Math`. | 08 |
| `📦 _02_estruturas_condicionais` | `if/else`, `switch`, operador ternário. | 12 |
| `📦 _03_estruturas_repeticao` | `for`, `while`, casos de teste em lote. | 07 |
| `📦 _04_arrays_e_metodos` | Arrays de tipos primitivos, métodos estáticos, parâmetros e retorno. | 🚧 em construção |
| `📦 _05_strings_e_manipulacao` | `String`, `StringBuilder` e métodos de manipulação de texto. | 🚧 em construção |

---

## 🚀 Como Executar o Projeto Localmente

### Pré-requisitos
1. Ter o **JDK 17** (ou superior) instalado.
2. Ter o **Maven** configurado na sua máquina.

### Passos para Configuração
1. Clone o repositório:
   ```bash
   git clone https://github.com/alfredo-lopes-ti/java-fundamentos.git
   ```
2. Entre na pasta do projeto:
   ```bash
   cd java-fundamentos
   ```
3. Compile o projeto com Maven:
   ```bash
   mvn compile
   ```
4. Execute qualquer classe `Main` diretamente pela sua IDE, ou via terminal, apontando para o pacote do exercício desejado, por exemplo:
   ```bash
   java -cp target/classes _01_sintaxe_basica.ex01_precificacao_produto.Main
   ```

---

## 📌 Sobre este repositório

Cada exercício é independente e contém um comentário Javadoc explicando o enunciado do problema, além de comentários no corpo do código explicando o raciocínio por trás de cada conceito. A ideia é servir como base sólida antes de avançar para Orientação a Objetos e, posteriormente, para frameworks como Spring Boot.
