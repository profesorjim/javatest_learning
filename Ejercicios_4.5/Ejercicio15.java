import java.util.Scanner;

public class Ejercicio15 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("\nEste programa pinta una pirámide rellena con el carácter que ud. indique, y con la orientación que ud. elija\n");
    System.out.print("\nIntroduzca el carácter de relleno: ");
    char a = s.next().charAt(0);
    System.out.print("\nElija la orientación:\n");
    char o;
    
    System.out.print("1.- Apuntando hacia arriba\n");
    System.out.print("2.- Apuntando hacia abajo\n");
    System.out.print("3.- Apuntando hacia la izquierda\n");
    System.out.print("4.- Apuntando hacia la derecha\n");
    
    o = s.next().charAt(0);
    
    System.out.print("\n\n\n\n");
    
    switch (o) {
      case '1':
        // orientación arriba
        System.out.printf("    %c\n",a);
        System.out.printf("   %c%c%c\n",a,a,a);
        System.out.printf("  %c%c%c%c%c\n",a,a,a,a,a);
        System.out.printf(" %c%c%c%c%c%c%c\n",a,a,a,a,a,a,a);
        System.out.printf("%c%c%c%c%c%c%c%c%c\n",a,a,a,a,a,a,a,a,a);
        break;
      case '2':
        // orientación abajo
        System.out.printf("%c%c%c%c%c%c%c%c%c\n",a,a,a,a,a,a,a,a,a);
        System.out.printf(" %c%c%c%c%c%c%c\n",a,a,a,a,a,a,a);
        System.out.printf("  %c%c%c%c%c\n",a,a,a,a,a);
        System.out.printf("   %c%c%c\n",a,a,a);
        System.out.printf("    %c\n",a);
      case '3':
        // orientación izquierda
        System.out.printf("    %c\n",a);
        System.out.printf("   %c%c\n",a,a);
        System.out.printf("  %c%c%c\n",a,a,a);
        System.out.printf(" %c%c%c%c\n",a,a,a,a);
        System.out.printf("%c%c%c%c%c\n",a,a,a,a,a);
        System.out.printf(" %c%c%c%c\n",a,a,a,a);
        System.out.printf("  %c%c%c\n",a,a,a);
        System.out.printf("   %c%c\n",a,a);
        System.out.printf("    %c\n",a);
        break;
      case '4':
        // orientación derecha
        System.out.printf("%c\n",a);
        System.out.printf("%c%c\n",a,a);
        System.out.printf("%c%c%c\n",a,a,a);
        System.out.printf("%c%c%c%c\n",a,a,a,a);
        System.out.printf("%c%c%c%c%c\n",a,a,a,a,a);
        System.out.printf("%c%c%c%c\n",a,a,a,a);
        System.out.printf("%c%c%c\n",a,a,a);
        System.out.printf("%c%c\n",a,a);
        System.out.printf("%c\n",a);
        break;
      default:
        System.out.print("\nLa opción indicada no es válida.\n");
    }
    
  }
}
    
