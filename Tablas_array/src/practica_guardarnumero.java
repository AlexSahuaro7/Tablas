import java.util.Scanner;

public class practica_guardarnumero {
    public static void main (String[] args){
        //Crea un programa en Java que:
        //
        //Pida al usuario cuántos números quiere ingresar.
        //
        //Permita al usuario introducir esa cantidad de números (uno por uno).
        //
        //Guarde los números en un array.
        //
        //Muestre los números ingresados al final.
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos numeros quieres introducir");
        int cantidad = sc.nextInt();

        int numeros [] = new int[cantidad];

        for (int i = 0; i<cantidad; i++) {
            System.out.println("introduzca los numeros " +(i+1) +" : ");
            numeros [i] = sc.nextInt();
        }
        System.out.println("mostrar numeros ingresados ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("numero " +(i+1)+ ":" +numeros[i]);

        }
    }
}
