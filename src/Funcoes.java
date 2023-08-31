import java.util.Scanner;

public class Funcoes {
    int b = 50;
    Scanner fun = new Scanner(System.in);
    void add (){
        System.out.println("Quantas unidades deseja adicionar?");
        int adicionar = fun.nextInt();
        b += adicionar;
    }
    void sub (){
        System.out.println("Quantas unidades deseja retirar?");
        int subtrair = fun.nextInt();
        b -= subtrair;
    }
}
