import java.util.Scanner;

public class array_guardar_numero {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos numeros deseas introducir?");
        int numero = sc.nextInt();
        int [] guardado = new int[numero];

        for (int i = 0; i < numero; i++) {
            System.out.print("ingresa el numero " + (i + 1) + ":");
            guardado[i] = sc.nextInt();

        }

        System.out.print("numeros ingresados");
        for (int i =0; i < numero; i++ ){
            System.out.print("numero" +(i+1) + ":" + guardado[i]);

        }


    }
}
