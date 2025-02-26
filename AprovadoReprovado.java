import java.util.Scanner;

public class AprovadoReprovado{

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 3 notas: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if( media >= 7)
            System.out.println("Sua média foi: " +  media + "e você foi Aprovado!");
        else
            System.out.println("Sua média foi:"+ media + "e você foi Reprovado :C");

        scanner.close();


    }

    public static class Teste1{
        public static void main (String[]args){
            System.out.println("Calebe é um Gostoso");

        }
    }
}