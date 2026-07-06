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

O projeto segue a estrutura padrão do Maven (`src/main/java/`), organizada em módulos numerados por ordem de aprendizado:

| Módulo | Conceito Praticado |
| :--- | :--- |
| `📦 _01_sintaxe_basica` | Variáveis, tipos primitivos, casting, operadores aritméticos e lógicos. |
| `📦 _02_entrada_saida` | Leitura de dados com `Scanner`, saída formatada (`System.out`, `printf`, `String.format`). |
| `📦 _03_estruturas_condicionais` | `if/else`, `switch`, operador ternário. |
| `📦 _04_estruturas_repeticao` | `for`, `while`, `do-while`, `break`/`continue`. |
| `📦 _05_arrays_e_metodos` | Arrays de tipos primitivos, métodos estáticos, parâmetros e retorno. |
| `📦 _06_strings_e_manipulacao` | `String`, `StringBuilder` e métodos de manipulação de texto. |

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
4. Execute qualquer classe `Main`/`Program` diretamente pela sua IDE, ou via terminal, apontando para a classe desejada, por exemplo:
   ```bash
   java -cp target/classes _01_sintaxe_basica.Main
   ```

---

## 📌 Sobre este repositório

Cada módulo é independente e contém exemplos comentados em português, explicando não só o código, mas o raciocínio por trás de cada conceito. A ideia é servir como base sólida antes de avançar para Orientação a Objetos e, posteriormente, para frameworks como Spring Boot.
