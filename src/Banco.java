import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<Conta> contas;

    public Banco(String _nome) {
        this.nome = _nome;
        this.contas = new ArrayList<>();
    }

    public void addConta(Conta conta){
        this.contas.add(conta);
    }
}
