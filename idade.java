import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("diga sua idade:");
        int idade = scn.nextInt();

        if (idade>=18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }
    }
}
