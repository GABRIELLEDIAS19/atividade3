import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;

    System.out.println("Seja bem-vindo ao posto de gasolina!");
  System.out.println("");
    System.out.println("Qual tipo de combustivel o senhor(a) deseja?");
    System.out.println("1 - Álcool, 2 - Gasolina, 3 - Diesel, 4 - Fim");

    int opcao = sc.nextInt();

    while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
      System.out.println("**");
      System.out.println("Codigo Invalido. Tente novamente");
      opcao = sc.nextInt();
    }
    while (opcao > 0 && opcao < 4) {
      if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
        System.out.println("**");
        System.out.println("Codigo Invalido. Tente novamente");
        opcao = sc.nextInt();
      }
      if (opcao == 1) {
        alcool = alcool + 1;
       System.out.println("Mais alguma coisa?");
        opcao = sc.nextInt();
      }
      if (opcao == 2) {
        gasolina = gasolina + 1;
        System.out.println("Mais alguma coisa?");
        opcao = sc.nextInt();
      }
      if (opcao == 3) {
        diesel = diesel + 1;
        System.out.println("Mais alguma coisa?");
        opcao = sc.nextInt();
      }

      while (opcao != 1 && opcao != 2 && opcao != 2 && opcao != 3 && opcao != 4) {
        System.out.println("Codigo Invalido. Tente novamente");
        opcao = sc.nextInt();
      }
   }
    int soma = alcool + gasolina + diesel;
    if (opcao == 4);
    System.out.println("Muito obrigado! Volte sempre.");
    System.out.println("Clientes: ");
  System.out.println("Alcool: " + alcool);
    System.out.println("Gasolina: " + gasolina);
    System.out.println("Diesel: " + diesel);
    System.out.println("Total de clientes: " + soma);
  
    sc.close();
  }


}