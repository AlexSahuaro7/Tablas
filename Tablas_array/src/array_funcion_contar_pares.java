public class array_funcion_contar_pares {
    public static int contarpares(int[] t) { // se crea la funcion la cual recibe el array
        int contador = 0;
        for (int i = 0; i < t.length; i++) { // se crea el bucle para recorrer todas los numeros del array
            if (t[i] % 2 == 0) { // se crea el condicional para comprobar si es par
                contador++;
            }

        }
        return contador;

    }
    public static void main(String[] args) {
        int[] numeros = {1, 4, 6, 7, 9, 12, 14} ;
        int cantidadpares = contarpares(numeros); // se realiza la llamada a la funcion
        System.out.println("cantidad de numeros pares: "+cantidadpares);

        }
    }


