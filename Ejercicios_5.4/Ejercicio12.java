import java.util.Scanner;

public class Ejercicio12 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("\nEste programa escribe los n primeros números de la serie de Fibonacci.\n");
    System.out.print("\nIntroduzca el valor de 'n': ");
    int n = s.nextInt();
    
    int i;
    
    int a = 0;
    int b = 1; 
    int parcial;
    
    for (i=1; i<=n; i++) {
        System.out.printf("%d",a);
        
        // cálculo siguiente valor
        parcial = b+a; 
        a = b;
        b = parcial;
        
        if (i<n) {
          System.out.print(", ");
        }
      
    }
    
  }
}
    
