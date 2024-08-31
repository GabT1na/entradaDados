import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

 //  System.out.println("Entre com um número inteiro: ");
 //   int numero = sc.nextInt();
  //  System.out.println("O número digitado foi:");
   // System.out.println(numero);

    //System.out.println("Entre com um número racional: ");
   // double numero = sc.nextDouble();
   // System.out.println("O número digitado foi:");
    //System.out.println(numero);
    
    System.out.println("Entre com o nome do seu futuro filho(a): ");
    String nome = sc.nextString();
    System.out.println("O nome escolhido foi:");
    System.out.println(nome);
    sc.close();
    
  }
}