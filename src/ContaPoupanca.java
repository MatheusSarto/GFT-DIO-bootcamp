public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente _cliente) {
        super(_cliente);
    }
    public void imprimirInformacoes(){
        System.out.printf("Tipo de conta : poupanca\nNome do cliente: %s %s\nCPF: %s\nSaldo em conta: %2f\n", this.cliente.getNome(), this.cliente.getSobrenome(), this.cliente.getCpf(), this.saldo);
    }
}
