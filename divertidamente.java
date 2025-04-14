import java.util.Scanner;

public class divertidamente {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int amg;
        int alegria = 0;
        int tristeza = 30;
        double a1,a2,a3,media;
        int alg;
        
        System.out.println("quantas amizades ela fez?");
        amg = scn.nextInt();
        
        System.out.println("pontos na a1?");
        a1 = scn.nextDouble();

        System.out.println("pontod na a2?");
        a2 = scn.nextDouble();

        System.out.println("pontos a3?");
        a3 = scn.nextDouble();
        
        System.out.println("algoritimos resolvidos?");
         alg = scn.nextInt();
       
         if (amg > 0) {
            alegria =+ 10*amg;
        }else if (amg == 0) {
            tristeza =+ 30;
        }
        
        media = (a1 + a2 + a3) / 3;
        
        if (media >= 7 ) {
            System.out.println("APROVADA");
            alegria =+ 50;
        } else {
            System.out.println("reprovada");
            tristeza =+ 50;
        } 
        
        if (alg > 0) {
            alegria =+ 10 * 10;
            
        }else {
            tristeza =+ 10 * (10 - alg);
        }
        
        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        }else{
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }
    }   
    
}    
        
    
    

