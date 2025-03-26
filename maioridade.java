import java.util.Scanner;

public class maioridade {
    public static void main(String[] args) {
        int nascimento,anoatual,idade,maior = 18;

        Scanner scn = new Scanner(System.in);

        System.out.println("escreva seu ano de nascimento:");
        nascimento = scn.nextInt();

        System.out.println("em que ano estamos:");
        anoatual = scn.nextInt();

        idade = anoatual-nascimento;

        System.out.println("sua idade é:"+ idade);
        if (idade>=18) {
            System.out.println("voce atingiu a maior idade:");
        } else {
            System.out.println("voce nao atingiu a maior idade"); 
        }
    }

}