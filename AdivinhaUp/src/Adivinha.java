import java.util.Scanner;
import java.util.Random;


public class Adivinha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int palpite, num = 0;
        num = rand.nextInt(10) + 1;
        do {
            System.out.println("digite seu palpite");
            palpite = entrada.nextInt();
            if (palpite == num) {
                System.out.println("voce acertou");
            }else{
                if (palpite < num) {
                    System.out.println("Seu palpite esta abaixo");


                }
            }
        }while (palpite !=num);
        entrada.close();
    }
}
