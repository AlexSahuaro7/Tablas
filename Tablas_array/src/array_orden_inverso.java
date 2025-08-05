import java.util.Scanner;
// Enunciado completo:
//Escribe una aplicación en Java que:
//
//Solicite al usuario cuántos números desea introducir.
//
//Permita introducir esa cantidad de números enteros por teclado.
//
//Al finalizar, muestre los números introducidos en orden inverso al que fueron ingresados.
public class array_orden_inverso {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        System.out.println("cuantos numeros desea introducir");
        cantidad = sc.nextInt();

        int numeros [] = new int[cantidad] ;

        for (int i = 0; i<cantidad; i++){
            System.out.println("introduce el numero " +(i+1));
            numeros[i] = sc.nextInt();

        }
        for (int i = 0; i<cantidad; i++) {
            System.out.println("el numero " +(i+1)+ ":" +numeros[i]);

        }
        System.out.println("mostrar numeros en orden inverso");
        for (int i = cantidad - 1; i >=0; i--){
            System.out.println("los numeros son" +(cantidad-i)+ ":" +numeros[i]);
        }

    }
}
