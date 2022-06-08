import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        char resp;
        String nome;
        int idade;
        resp = 's';

        while (resp == 's') {
            System.out.println("digite seu nome:");
            nome = entrada.next();
            System.out.println("Digite sua idade");
            idade = entrada.nextInt();
            if (idade >18) {
                System.out.println("seu nome eh" + nome);
            }
            System.out.println("deseja continuar?  (s/n):");
        }
        entrada.close();
    }
}
