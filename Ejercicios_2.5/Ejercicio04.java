public class Ejercicio04 {
  public static void main (String[] args) {
    double factorEuroPtas;
    double euros;
    long pesetas;

    factorEuroPtas = 166.386;
    euros = 50;

    pesetas = (long) (euros * factorEuroPtas);

    System.out.println ("La cantidad de "+euros+" € equivalea la cantidad de "+pesetas+" pesetas.");
    System.out.printf ("La cantidad de %.2f € equivalea la cantidad de %.2f pesetas.\n",euros,(double)pesetas);
    System.out.printf ("La cantidad de %.2f € equivalea la cantidad de %d pesetas.\n",euros,pesetas);
  }
}
