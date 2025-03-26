//importa a biblioteca
import java.util.Scanner;

public class login {

  public static void main(String[] args) {
     //declara as variaveis
    String senha = "PROGRAMACAO";
    int contador = 1;
    Scanner scn = new Scanner(System.in);
    //executa o comando escreva
    System.out.println("digite a senha de acesso:");
    //atribui a variavel ao escreva
    senha = scn.next();
    //fecha o scanner
    scn.close();
    //executa a funçao while loogo apo indo pro bloco if else simples = se se-nao
    while (true && contador<=3) {
      if (senha.equalsIgnoreCase("programacao")) {
        System.out.println("senha correta,seja bem vindo(a)");
        return;
      }else {
        System.out.println("senha errada");
        contador = contador +1;
      }
    }
  }
}