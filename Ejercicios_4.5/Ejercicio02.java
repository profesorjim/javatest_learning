
public class Ejercicio02 {
  public static void main (String[] args) {
    System.out.print("\nIntroduzca la hora que es: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora>=6) && (hora<=12)) {
      System.out.print("Buenos días.\n");
    } else if ((hora>=13) && (hora<=20)) {
      System.out.print("Buenas tardes.\n");
    } else if (((hora>=21) && (hora<=24)) || ((hora>=0) && (hora<=5))) {
      System.out.print("Buenas noches.\n");
    } else {
      System.out.print("La hora introducida es incorrecta.\n");
    }
    
    
  }
}
