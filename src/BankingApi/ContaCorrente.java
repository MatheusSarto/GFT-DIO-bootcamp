package BankingApi;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente _cliente) {
        super(_cliente);
    }
    public ContaCorrente(String _nome, String _sobrenome, int _idade, char _genero, String _cpf) {
        super(_nome,  _sobrenome, _idade, _genero, _cpf);
    }
    public void imprimirInformacoes(){
        System.out.printf("Tipo de conta : Corrente\nNome do cliente: %s %s\nCPF: %s\nSaldo em conta: %2f\n", this.cliente.getNome(), this.cliente.getSobrenome(), this.cliente.getCpf(), this.saldo);
    }
}
