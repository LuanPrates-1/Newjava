import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a temperatura hoje?");


        int GrausCelcius = scanner.nextInt();

        double formula = (GrausCelcius * 1.8)+32;

        int Variavel = (int) formula;

        System.out.println("A temmperatura convertida é :" + formula);



    }
}