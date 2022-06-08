import java.util.Scanner;

public class Calculadora {
    public static void main ( String [] args ) {
        System.out.println("=== Calculadora ===");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero PUTA");
        double num1 = entrada.nextDouble(); // le a opção digitada

        System.out.println(" Digite putro numero ");
        double num2 = entrada.nextDouble();
        System.out.println("=== Operação Matematica ===");
        System.out.println("+ Adiciona os numeros ");
        System.out.println(" - Subtrai os numeros");
        System.out.println(" * multiplica os numeros");
        System.out.println("=== Escolha uma opcao ===");
        String oper = entrada.next();

        switch (oper) {
            case "+":
                double sub = num1 - num2;
                System.out.println("Voce escolheu adiçao ");
        }
    }
}
