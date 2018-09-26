

public class NNumerosAleatorios {
  public static void main (String[] args) {
    
   
    int maxIteraciones = 19;
    int minRangoAleatorio = 18;
    int maxRangoAleatorio = 65;
    
    int iteraciones;
    int contador;
    int numeroAleatorio;
  
    
    iteraciones = (int) (Math.random ()*maxIteraciones)+1;  // El valor que se obtine estará entre 1 y maxIteraciones, ambos inclusive
    
    System.out.println("Se van a generar " + (iteraciones) +" números aleatorios:");
    
    for (contador=1; contador <=iteraciones; contador++) { //realizará iteraciones iteraciones
      numeroAleatorio = (int) (Math.random ()*(maxRangoAleatorio+1-minRangoAleatorio))+18; 
      
      System.out.println("Nº "+contador+" ---> " + numeroAleatorio);
    }
  }
}
