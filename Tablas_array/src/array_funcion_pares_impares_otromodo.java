public class array_funcion_pares_impares_otromodo {
    // La función devuelve un array de enteros
    public static int[] contar(int[] t) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Devolvemos un array con los dos contadores
        return new int[] {pares, impares};
    }

    public static void main(String[] args) {
        int[] numeros = {3, 2, 5, 4, 6};

        // Guardamos el array que devuelve la función
        int[] resultado = contar(numeros);

        System.out.println("Cantidad de números pares: " + resultado[0]);
        System.out.println("Cantidad de números impares: " + resultado[1]);
    }
}
// Cuando una función devuelve un array, por ejemplo:
//
//return new int[] {pares, impares};
//estamos empaquetando dos valores dentro de un array de tamaño 2, donde:
//
//resultado[0] es el primer valor del array → en este caso: número de pares
//
//resultado[1] es el segundo valor del array → en este caso: número de impares