package BankingApi;

import java.util.Scanner;

public class MainBankingApi {
    public static void main(String[] args) {
        Conta conta;
        Conta conta2 = new ContaCorrente("EX", "EX", 18, 'm', "11111111111");

        Banco banco = new Banco("BancoEx");
        banco.addConta(conta2);

        Scanner sc = new Scanner(System.in);
        Scanner charSc = new Scanner(System.in);

        boolean noApp;

        System.out.println("Vamos cariar uma nova conta!!\nInforme seu nome: ");
        String nome = sc.next();

        System.out.println("Informe seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Informe seu genero\nm - Masculino  f- Feminino");
        char genero = charSc.next().charAt(0);

        System.out.println("Informe seu CPF: ");
        String cpf = sc.next();

        System.out.println("Apenas para finalizar! Deseja criar uma conta corrente ou poupanca? 1 - Corrente   2 - Poupanca");
        int resposta = sc.nextInt();

        Cliente _cliente = new Cliente(nome, sobrenome, idade, genero,  cpf);

        if(resposta == 1) {
            conta = new ContaCorrente(_cliente);
        }
        else{
            conta = new ContaPoupanca(_cliente);
        }

        System.out.println("Pronto!! Deseja fazer um deposito ??  1 - Sim  2 - Nao");
        resposta = sc.nextInt();

        if(resposta == 1){
            System.out.println("Informe a quantia desejada para o deposito: ");
            double valor = sc.nextDouble();
            conta.deposito(valor);
            System.out.println("Deposito bem sucedido! Criacao de conta finalizada!");
        }
        else{
            System.out.println("Criacao de conta finalizada!");
        }
        banco.addConta(conta);
        noApp = true;
        while(noApp == true){
            System.out.println("Nos do [nome do banco] ficamos muito felizes com sua escolha! O que deseja ?\n1 - Fazer um deposito\n2 - Sacar dinheiro\n3 - Fazer uma transferencia" +
                    "\n4 - Verificar informacoes basicas da conta\n5 - Sair do app");
            int validar = sc.nextInt();

            switch(validar){
                case 1:
                    System.out.println("Informe a quantidade desejada para o deposito: ");
                    double valor = sc.nextDouble();
                    conta.deposito(valor);
                    break;

                case 2:
                    System.out.println("Informe a quantidade desejada a se sacar: ");
                    valor = sc.nextDouble();
                    conta.sacar(valor);
                    break;
                case 3:
                    //Por ter apenas 2 contas registradas, irei deixar direcionado estritamente para a outra conta existente,
                    // mas poderia ser para qualquer outra, caso existisse.
                    System.out.println("Informe o valor da transferencia: ");
                    valor = sc.nextDouble();
                    conta.transferencia(valor, conta2);
                    break;

                case 4:
                    conta.imprimirInformacoes();
                    break;

                case 5:
                    System.out.println("Saindo da aplicacao...");
                    noApp = false;
                    break;
            }
        }
    }
}
