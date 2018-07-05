import java.util.Scanner;

public class Ejercicio24 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("\nEste programa escribe una pirámide de números con 'n' filas.\n");
    System.out.print("\nIntroduzca el valor de 'n': ");
    int n = s.nextInt();
    
    int i;
    int j;
    
    for (i=0; i<n; i++) {
        for (j=0; j<(n-i); j++) {
            System.out.printf(" ");
        }
        for (j=0;j<=i;j++) {
            System.out.printf("%d",(j+1)%10);
        }
        for (;j>1;j--) {
            System.out.printf("%d",(j-1)%10);
        }
        System.out.printf("\n");
    }
    
  }
}
    
