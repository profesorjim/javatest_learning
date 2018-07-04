import java.util.Scanner;

public class Ejercicio09 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("\nEste programa resuelve ecuaciones de 2º grado del tipo ax² + bx + c = 0\n");
    System.out.print("\nIntroduzca el valor de \"a\": ");
    double a = s.nextDouble();
    System.out.print("\nIntroduzca el valor de \"b\": ");
    double b = s.nextDouble();
    System.out.print("\nIntroduzca el valor de \"c\": ");
    double c = s.nextDouble();
    
    double radicando = b*b - 4*a*c;
    double sol1;
    double sol2;
    
    if (a==0) {
      System.out.printf("\nNo se trata de una ecuación de segundo grado.\n");
      
    } else {
      if (radicando < 0) {
        System.out.print("\nLa ecuación no tiene soluciones dentro de los números reales.");
      } else {
          sol1 = (-b + Math.sqrt(radicando))/(2*a);
          sol2 = (-b - Math.sqrt(radicando))/(2*a);
          System.out.printf("\nLas soluciones son: x=%f;  x=%f",sol1,sol2);
      }
    }
    
   
    
    
  }
}
