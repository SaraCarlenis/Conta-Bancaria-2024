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