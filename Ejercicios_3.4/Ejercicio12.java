import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;
import java.text.DecimalFormatSymbols;

public class Ejercicio12 {
  public static void main (String[] args) {
    double pesoNota1 = 40;
    double pesoNota2 = 60;
    DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
    simbolos.setDecimalSeparator('.');
    DecimalFormat formato1 = new DecimalFormat ("#.##",simbolos);

    Scanner s = new Scanner(System.in);

    s.useLocale(Locale.ENGLISH);

    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = s.nextDouble();
  
    System.out.print("¿Qué nota quieres sacar como media con el 2º examen? ");
    double media = s.nextDouble();

    double nota2 = (media * 100 - nota1*pesoNota1)/pesoNota2;

    //System.out.println("Para tener un "+media+" como nota media necesitas sacar un "+nota2+" en el segundo examen.");
    System.out.println("Para tener un "+formato1.format(media)+" como nota media necesitas sacar un "+formato1.format(nota2)+" en el segundo examen.");
    //System.out.printf("Para tener un %.-2f como nota media necesitas sacar un %.-2f en el segundo examen.\n",media,nota2);
  }
}
