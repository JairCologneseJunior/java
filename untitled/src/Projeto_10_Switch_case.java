import java.util.Scanner;

public class Projeto_10_Switch_case {
    public static void main ( String [] args ){
        System.out.println("======= Menu de Opcoes ========");
        System.out.println(" 1 - Cadastrar Produtos ");
        System.out.println(" 2 - Listas Produtos ");
        System.out.println(" 3 - Sair do Sistema ");
        System.out.println(" ======= Escolha uma opcao ======== ");


        Scanner entrada = new Scanner( System.in);
        int menu = entrada.nextInt(); // Lê a opção digitada

        switch (menu) {
            case 1:
                System.out.println("voce escolheu o menu 1");
                System.out.println("Que eh a opcao de cadastrar Produtos");
                break;
            case 2:
                System.out.println("voce escolheu o menu 2");
                System.out.println("Que e a opcao de Listar os produtos");
                System.out.println("parabens puta");
                break;
            case 3:
                System.out.println("voce escolheu o menu 3");
                System.out.println("Que e a opcao de sair do sistema");
                break;
            default:
                System.out.println("Item de menu invalido");
        }
        entrada.close();
    }
}
