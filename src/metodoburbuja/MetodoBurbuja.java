import java.util.Arrays;


/*
@author Lucas Arenas Arteaga, Diego Fernanado Rendon, Luis Erney Polo Perez, Brayan Villanueva, Oscar Valderrama, Yennifer Alexandra Madrigal Orozco.
*/

public class MetodoBurbuja {
   
 private static void burbuja(int[] arreglo) {
        
        for (int x = 0; x < arreglo.length; x++) {
            for (int y = 0; y < arreglo.length - 1; y++) {
            	
              
                if (arreglo[y] > arreglo[y+1]) {      
                    System.out.println("Elemento actual es mayor: " + String.valueOf(arreglo[y]) + " Se cambia con: " + String.valueOf(arreglo[y+1]));
                    int auxiliar=arreglo[y];
                    arreglo[y] = arreglo[y + 1];
                    arreglo[y + 1]= arreglo[y];
                    arreglo[y+1]=auxiliar;
                }
            }
        }
    }




 public static void main(String[] args) {
        int numeros[] = {21,40,4,9,10,35};
        
        System.out.println("Elementos del Arreglo antes de Organizarlos: " + Arrays.toString(numeros));
    
        burbuja(numeros);


        System.out.println("Elementos del Arreglo Despues de Organizarlos con Metodo de la burbuja: " + Arrays.toString(numeros));
       }

}