import java.util.Scanner;

public class subtracao {
    public static void main(String[] args) {
        int n1,n2,res;

        Scanner scn = new Scanner(System.in);

        System.out.println("===subtração===");
        System.out.println("digite o primeiro numero:");
        n1 = scn.nextInt();

        System.out.println("digite o segundo numero:");
        n2 = scn.nextInt();

        res = n1-n2;

        System.out.println("resultado final é:"+ res);

    }
}
