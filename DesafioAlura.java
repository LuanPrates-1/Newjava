import java.util.Scanner;

public class DesafioAlura {
    public static void main(String[] args) {
        Scanner dadosCliente = new Scanner(System.in);
        String nome = "Toretto";
        String tipoDeConta = "corrente";
        double saldo = 1900.88;
        int opcao = 0;
        System.out.println("***************************");
        System.out.println("\n Nome do Cliente :"+nome);
        System.out.println("Saldo atual da conta :"+saldo);
        System.out.println("\n*************************");

        String menu = """
                **Digite sua opção**
                1- Consultar seu saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                """;;

        while(opcao != 4) {
            System.out.println(menu);
            opcao = dadosCliente.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo:" + saldo);
            } else if (opcao == 2) {

                System.out.println("Qual o valor que você deseja transferir? ");
                double valor = dadosCliente.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente em sua conta ");
                }
                else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado :"+saldo);
                }



            } else if (opcao == 3) {
                System.out.println("O valor recebido foi : ");
                double Valor = dadosCliente.nextDouble();
                saldo += Valor;
                System.out.println("Saldo atualizado :"+saldo);
            }else{
                System.out.println("Fim da operação;");
            }

        }
    }
}
