import java.util.Scanner;

public class multiplicacao {
    public static void main(String[] args) {

        int n1,n2,res;
         Scanner scn = new Scanner(System.in);

         System.out.println("===multiplicação===");
         System.out.println("digite o primeiro numero:");
         n1 = scn.nextInt();

         System.out.println("digite o segundo numero:");
         n2 = scn.nextInt();

         res = n1*n2;

         System.out.println("resultado e:"+ res);

    }
}
