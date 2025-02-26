    import java.util.Scanner;

    public class codigocop {
    public static void main(String[] args) {
        // Declarando a variável para o scanner
        Scanner sc = new Scanner(System.in);

        // Solicitando o dia da semana ao usuário
        int diaDaSemana;
        System.out.println("Entre com o dia da semana (1 a 7): ");
        diaDaSemana = sc.nextInt();

        // Fechando o scanner
        sc.close();

        // Declaração da variável que armazenará o nome do dia
        String dia;

        // Usando o switch para determinar o nome do dia
        switch (diaDaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Dia inválido";
        }

        // Exibindo o nome do dia
        System.out.println("Hoje é " + dia);
    }
}