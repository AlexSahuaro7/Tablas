import java.util.Arrays;

public class array_suma {
    public static void main(String[] args) {
        int [] numero = new int[8];
        int suma =0;

        for (int i =0; i < numero.length; i++) {
            numero[i] = (int)(Math.random()*501);
            suma += numero[i] ;
        }
System.out.println("valores del array" +Arrays.toString(numero));
        System.out.println("suma de los elementos " +suma);

        }

    }

