public class funcion_array_sumar_numeros {
    public static int suma(int[] t) {
        int total =0;
        for (int i=0; i <t.length; i++) {
            total += t[i];
            // t[i] → es el número que hay en la posición i del array.
            //
            //total += t[i]; → lo suma al total acumulado.
        }
        return total;
    }
    public static void main(String[] args) {
        int[] numeros = {3,5,8,9} ;
        int resultado = suma(numeros);
        System.out.println("la suma es :" +resultado);
    }
}
//  ¿Cómo se conecta numeros con t?
//numeros → es el array original que creas en main.
//
//suma(numeros) → aquí estás llamando a la función suma y le estás pasando el array numeros como argumento.
//
//Dentro de la función suma, ese array se recibe como t.