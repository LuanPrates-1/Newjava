import java.util.Scanner;

public class loop {
    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Diga sua avaliação para o seu filme  ");
            nota = leitura.nextDouble();
            mediaAvaliacao += + nota;
            // += significa que ele recebe oque já tinha....
            // no caso seria como seu eu tivesse escrito mediA... = mediaA

        }
        System.out.println("A média de avaliações " + mediaAvaliacao/3);

    }
}
