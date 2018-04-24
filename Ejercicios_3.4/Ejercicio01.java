import java.util.Scanner;

public class Ejercicio01 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce dos numeros, separados por un espacio: ");

    long num1 = s.nextLong();
    long num2 = s.nextLong();

    System.out.println("La suma de "+num1+" + "+num2+" es "+(num1+num2));
  }
}
