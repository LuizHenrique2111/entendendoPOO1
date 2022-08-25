import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Numero n1 = new Numero();
    Numero n2 = new Numero();
    Numero res = new Numero();
    String opc = "S";

    while (opc.equals("S") || opc.equals("s")) {
      System.out.print("\nDigite o primeiro valor: ");
      n1.setValor(scan.nextInt());

      System.out.print("\nDigite o segundo valor: ");
      n2.setValor(scan.nextInt());

      res.setValor(n1.getValor() + n2.getValor());
      System.out.printf("\nA soma de %d com %d é igual a %d", n1.getValor(), n2.getValor(), res.getValor());

      System.out.print("\n\nDeseja fazer uma nova operação?(S/N) ");
      opc = scan.next();

      System.out.print("\n----------------------------\n\n");
    }
  }
}