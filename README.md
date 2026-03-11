# 📺 Simulador de Smart TV - Explorando POO com Java

### 📋 Sobre o Projeto
Este projeto é um exercício prático de **Programação Orientada a Objetos (POO)** desenvolvido para consolidar conhecimentos básicos em Java. Ele simula o funcionamento lógico de uma Smart TV, permitindo o controle de estados (ligado/desligado), ajuste de volume e navegação entre canais.

### 🧠 Conceitos de Programação Aplicados
Para um desenvolvedor iniciante, este projeto é fundamental para entender:

1. Encapsulamento e Estado (SmartTV.java): A classe principal que gerencia o estado da TV (ligada/desligada, canal, volume). Ela foca apenas nas regras de negócio do aparelho.

2. Desacoplamento e Interface (ControleRemoto.java): Criamos uma classe intermediária que utiliza a classe Scanner para capturar a entrada do usuário. Isso isola a lógica de interação (Menu via Console) da lógica do aparelho.

3. Associação de Objetos: O ControleRemoto "tem uma" SmartTV. Esse relacionamento de associação é a base para sistemas complexos.

4. Tratamento de Exceções: Implementação de try-catch para evitar que o sistema feche inesperadamente caso o usuário digite um caractere inválido no console.

### 🛠️ Funcionalidades
- [x] Ligar e Desligar o aparelho.
- [x] Aumentar e diminuir o volume.
- [x] Trocar de canal (incremento unitário ou escolha direta).

### 🚀 Tecnologias Utilizadas
* **Linguagem:** Java 17+
* **Conceitos:** POO, Tratamento de Exceções, Classes Wrapper (Integer), Entrada/Saída (Scanner).

### 📂 Estrutura de Arquivos
* `SmartTV.java`: Classe que contém a lógica e os atributos da televisão.
* `Usuario.java`: Classe principal que executa a simulação e interage com os métodos.
* `ControleRemoto.java`: Classe que contem o scanner que processara a entrada de comandos do usuário.

### 🔧 Como Executar
1. Certifique-se de ter o **JDK** instalado em sua máquina.
2. Clone o repositório:
   ```bash
   git clone https://github.com/JohnAraujoGervasio/Pequeno-Sistema-SmartTV.git

### Compile os arquivos:
javac *.java

### Execute o programa:
java Usuario 
______________________________________________
Desenvolvido por: Naylton John Araujo Gervasio
