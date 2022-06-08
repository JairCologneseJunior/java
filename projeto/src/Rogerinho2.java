import java.util.Scanner;
public class Rogerinho2 {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);
        int palpite;
        System.out.println("Digitar seu palpite:");
        palpite  = entrada.nextInt();
        if(palpite == 13) {
            System.out.println("É 13 mermo");
        }
        else {
            if (palpite < 13) {
                System.out.println("Seu palpite esta a baixo ");
            } else {
                System.out.println("Seu palpite esta acima");
            }
        }
        entrada.close();
    }
}
