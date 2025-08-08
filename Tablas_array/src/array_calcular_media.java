import java.util.Arrays;

public class array_calcular_media {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        double sumar = 0;
        for (int i =0; i < numeros.length; i++) {
            numeros [i] = (int) (Math.random()*101);
            sumar = sumar + numeros[i];

        }
        double media = sumar/ numeros.length;
        System.out.println("los numeros son "+ Arrays.toString(numeros));
        System.out.println(" la media es:" +media);
    }
}