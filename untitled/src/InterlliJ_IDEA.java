import java.util.Scanner;
import java.util.Random;

public class InterlliJ_IDEA {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int palpite, num = 0;
        num = rand.nextInt(10) + 1;
        System.out.println("Digite seu palpite:");
        palpite = entrada.nextInt();
        if (palpite == num) {
            System.out.println("Voce acertou, o numero era" +num);
        }
        else {
            if (palpite < num){
                System.out.println("Seu palpite esta abaixo o numero era" + num);
            }else {
                System.out.println("Seu paçpite esta acima. O numero era" + num);
            }
        }
        entrada.close();
    }

}
