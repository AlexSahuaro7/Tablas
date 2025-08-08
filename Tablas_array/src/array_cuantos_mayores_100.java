import java.util.Scanner;

public class array_cuantos_mayores_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        int contador =0;
        System.out.println("cuantos numeros quieres introducir?");
        cantidad = sc.nextInt();
        int [] numero = new int [cantidad];

        for (int i=0; i< numero.length; i++) {
            System.out.println("introduce el numero" + (i + 1) + ": ");
            numero[i] = sc.nextInt();
            if (numero[i]>100) {
                contador ++;
            }
        }

        System.out.println("hay"+contador+"numeros mayores que 100");
    }
}
