package BankingApi;

public class Conta implements IConta{
    private static final int count = 1;
    private static final int agenciaPadrao = 1;

    public int agencia;
    public int numero;
    public double saldo;
    public Cliente cliente;

    public Conta(double _saldo, Cliente _cliente){
        this.agencia = agenciaPadrao;
        this.numero = 1;
        this.saldo = _saldo;
        this.cliente = _cliente;
    }
    public Conta(Cliente _cliente){
        this.agencia = agenciaPadrao;
        this.numero = 1;
        this.saldo = 0;
        this.cliente = _cliente;
    }
    public Conta(String _nome, String _sobrenome, int _idade, char _genero, String _cpf){
        this.agencia = agenciaPadrao;
        this.numero = 1;
        this.saldo = 0;
        this.cliente = new Cliente(_nome, _sobrenome, _idade, _genero, _cpf);

    }

    public void setCliente(Cliente _cliente){
        this.cliente = _cliente;
    }

    @Override
    public void transferencia(double valor, Conta contaDestino){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
        }
        else {
            System.out.println("Saldo em conta insuficiente!");
        }
    }
    @Override
    public void deposito(double valor){
        this.saldo += valor;
    }
    @Override
    public void sacar(double valor){
        if(this.saldo >= valor) {
            this.saldo -= valor;
        }
        else {
            System.out.println("Saldo em conta insuficiente!");
        }
    }
    @Override
    public void imprimirInformacoes(){
        System.out.printf("\nNome do cliente: %s %s\nCPF: %s\nSaldo em conta: %2f\n", this.cliente.getNome(), this.cliente.getSobrenome(), this.cliente.getCpf(), this.saldo);
    }
}
