import java.util.Scanner;

public class cases{
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);

       int dia;
       System.out.println("digite um valor:");
       dia = scn.nextInt();
       switch (dia) {
        case 1: 
        System.out.println("dom"); 
        break;
        
        case 2: 
        System.out.println("seg"); 
        break;
        
        case 3: 
        System.out.println("ter"); 
        break;
        
        case 4: 
        System.out.println("quar"); 
        break;
        
        case 5: 
        System.out.println("quin"); 
        break;
        
        case 6: 
        System.out.println("sex"); 
        break;
        
        case 7: 
        System.out.println("sab"); 
        break;
        
        default: 
        System.out.println("escreva um valor valido");
       }
       scn.close();
    }
}