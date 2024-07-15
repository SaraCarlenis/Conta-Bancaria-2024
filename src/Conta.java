public abstract class Conta implements IConta {
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo; 


    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++; 
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;

    }

    @Override
    public double exibirSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }
    
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        contaDestino.sacar(valor);

    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void extracted() {
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d%n", numero));
        System.out.println(String.format("Saldo %.2f", saldo));
    }

    
}
