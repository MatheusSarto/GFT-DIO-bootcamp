public interface IConta {
    void transferencia(double valor, Conta conta);
    void deposito(double valor);
    void sacar(double valor);
    void imprimirInformacoes();
}
