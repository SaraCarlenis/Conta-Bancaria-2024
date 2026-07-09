# 💰 Conta Bancária 2024

Este projeto é uma simulação de um sistema bancário desenvolvido em **Java**.  
O objetivo é praticar conceitos de **Programação Orientada a Objetos (POO)**, como abstração, herança, encapsulamento e polimorfismo, aplicados em um contexto de contas bancárias.

---

## 🎯 Objetivo
- Implementar classes que representem entidades bancárias (Banco, Cliente e Conta).  
- Utilizar **interfaces** e **classes abstratas** para definir comportamentos comuns.  
- Criar diferentes tipos de contas (Corrente e Poupança).  
- Simular operações bancárias como depósito, saque, transferência e impressão de extrato.  

---

## 🛠️ Tecnologias utilizadas
- **Java 17+**  
- Programação Orientada a Objetos (POO)  
- Conceitos de abstração, herança e polimorfismo  

---

## 📌 Estrutura do Projeto
- **Banco** → Representa a instituição bancária.  
- **Cliente** → Representa o titular da conta.  
- **Conta (abstrata)** → Define os atributos e métodos comuns às contas.  
- **ContaCorrente** → Especialização da classe Conta, imprime extrato de conta corrente.  
- **ContaPoupanca** → Especialização da classe Conta, imprime extrato de conta poupança.  
- **IConta (interface)** → Define os métodos obrigatórios para qualquer conta.  
- **Main** → Classe principal para execução e testes das operações.  

---

## 🚀 Funcionalidades
- Criar contas correntes e poupança.  
- Depositar valores.  
- Sacar valores.  
- Transferir valores entre contas.  
- Exibir saldo atual.  
- Imprimir extrato da conta.  

---

## 💡 Exemplo de uso
```java
public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cc1 = new ContaCorrente();

        cc.depositar(100);
        cc.transferir(50, cc1);
        cc.depositar(300);

        System.out.println("Valor total da conta: " + cc.exibirSaldo()); 
        cc.imprimirExtrato();

        Conta poupanca = new ContaPoupanca();
        poupanca.transferir(50, poupanca);
        poupanca.sacar(20);
        poupanca.imprimirExtrato();

        System.out.println("Valor total da conta: " + poupanca.exibirSaldo()); 
    }
} 
```

## 📂 Como executar
1. Clone este repositório:
      git clone https://github.com/SaraCarlenis/Conta-Bancaria-2024.git
2. Acesse a pasta do projeto:
      cd Conta-Bancaria-2024/src
3. Compile os arquivos Java:
      javac *.java
4. Execute a classe principal:
      java Main

##👩‍💻 Autora##
Sara Hurtado ✨

