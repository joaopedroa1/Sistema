import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Funcoes funcao = new Funcoes();
        Scanner leitura = new Scanner(System.in);
        String produto = "Teclado Mecânico";
        int quantidade = 50;
        int opcao = 0;
        System.out.println("Nome do produto: "+produto);
        System.out.println("Quantidade em estoque: "+quantidade + " unidades");
        System.out.println("Sua opção atual: "+ opcao);
        System.out.println("--MENU--");
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("[ 1 ] - Consultar quantidade em estoque;");
        System.out.println("[ 2 ] - Adicionar produtos ao estoque;");
        System.out.println("[ 3 ] - Retirar produtos de estoque;");
        System.out.println("[ 4 ] - Sair");
        while (opcao != 4){
            System.out.println("Digite sua opção: ");
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("Temos em estoque " + quantidade + " unidades");
            } else if (opcao == 2) {
                funcao.add();
                System.out.println(funcao.b + " unidades restantes");
            } else if (opcao == 3) {
                funcao.sub();
                System.out.println(funcao.b + " unidades restantes");
            } else if(opcao == 4){
                System.out.println("Até a próxima!");
            }
            }
        }
    }
