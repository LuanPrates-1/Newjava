import java.util.Random;
import java.util.Scanner;


        public class outroLoop {

            public static void main(String[] args) {
                Scanner leitor = new Scanner(System.in);
                int numeroGerado = new Random().nextInt(100);
                int tentativas = 0;
                int numeroDigitado = 0;

                while (tentativas < 5) {
                    System.out.println("digite um número de 1 a 100 : ");
                    leitor.nextInt();
                    tentativas++;


                    if (numeroDigitado == numeroGerado) {
                        System.out.println("Parabéns vocÊ concluiu o desafio " + tentativas + "tentativas!");
                        break;
                    } else if (numeroDigitado < numeroGerado) {
                        System.out.println("O número que você digitou é menor");

                    } else {
                        System.out.println("O número que você digitou é maior");
                    }

                    if (tentativas == 5 && numeroDigitado != numeroGerado) {
                        System.out.println("vocÊ não conseguiu completar o desafio em 5 tentativas"+numeroGerado);
                    }

                }
            }
        }