import java.util.Scanner;


public class U03EP07B {

    public static void main(String[] args) {

        int n = 0 , probabilidad = 0 , numeros = 0;

        Scanner stdin = new Scanner(System.in);
        System.out.print("Tamano: ");
        n = stdin.nextInt();

        String[][] matriz = new String[n][n];

        for (int i = 0 ; i < n ; i++ ) {
            
            for (int j = 0 ; j < n ; j++ ) {

                probabilidad = (int) (Math.random() * 10) ;
                if (probabilidad == 1 ) {
                    
                    numeros = (int) (Math.random() * 10) ;
                    matriz[i][j] = numeros+"" ;
                }
                
                else { matriz[i][j] = null ;
                }
            }
        }

        System.out.print("\nMatriz casi nula: \n\n");
        for (int i = 0 ; i < n ; i++ ) {
            
            System.out.print("  |  ");
            
            for (int j = 0 ; j < n ; j++ ) {
                
                System.out.print( matriz[i][j] );
                System.out.print(" ");
            }
            
            System.out.print(" |\n");
        }

        for (int i = 0 ; i < n ; i++ ) {
            
            for (int j = 0 ; j < n ; j++ ) {

                probabilidad = (int) (Math.random() * 10) ;
                matriz[i][j] =  probabilidad+"" ;
            }
        }

        System.out.print("\nMatriz optima: \n\n");
        for (int i = 0 ; i < n ; i++ ) {
            
            System.out.print("  |  ");
            
            for (int j = 0 ; j < n ; j++ ) {
                
                System.out.print( matriz[i][j] );
                System.out.print(", ");
            }
            
            System.out.print(" |\n");
        }
    }
}