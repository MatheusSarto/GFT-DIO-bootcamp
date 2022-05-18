package BankingApi;

public class Cliente {
        private String nome;
        private String sobrenome;
        private int idade;
        private char genero;
        private String cpf;

        public Cliente(String _nome, String _sobrenome, int _idade, char _genero, String _cpf){
                this.nome = _nome;
                this.sobrenome = _sobrenome;
                this.idade = _idade;
                this.genero = _genero;
                this.cpf = _cpf;
        }

        public String getNome(){
                return this.nome;
        }
        public String getSobrenome(){
                return this.sobrenome;
        }
        public String getCpf(){
                return this.cpf;
        }
}
