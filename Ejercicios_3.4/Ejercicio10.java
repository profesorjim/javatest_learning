import java.util.Scanner;

public class Ejercicio10 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce la cantidad en MegaBytes: ");

    long num1 = s.nextLong();
    
    long kilobytes = num1 * 1024;
    
    long gigabytes = num1 / 1024;
    
    long restomegas = num1 % 1024;
 

    System.out.println("La cantidad de información "+num1+" megabytes equivale a "+ kilobytes + " kilobytes.");
    System.out.println("La cantidad de información "+num1+" megabytes equivale a "+ gigabytes + " gigabytes, sobrando " +restomegas+" megabytes.");
  }
}
