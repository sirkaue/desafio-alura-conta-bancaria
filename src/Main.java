import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "João";
        String tipoDaConta = "Corrente";
        double saldo = 3000;

        System.out.println("**************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDaConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("**************");

        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println("\n** Operações **");
            System.out.println("");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Sacar valor");
            System.out.println("3 - Depositar valor");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.print("Digite a opção desejada: ");
            System.out.println();
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Quantos deseja sacar? ");
                double valor = sc.nextDouble();
                if (valor <= 0) {
                    System.out.println("Impossivel sacar");
                } else if (valor > saldo) {
                    System.out.println("Saldo insuficiente. ");
                } else {
                    saldo -= valor;
                }
            } else if (opcao == 3) {
                System.out.println("Quantos deseja depositar?");
                double valor = sc.nextDouble();
                if (valor <= 0) {
                    System.out.println("Impossivel depositar");
                } else {
                    System.out.println("Valor recebido: ");
                    saldo += valor;
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}