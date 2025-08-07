public class array_funcion_ordenar {
    public static void ordenarascendente(int[] t) {
        for (int i =0; i<t.length -1; i++) { // este bucle recorre el arry desde la posicion 0 hasta la penultima
            // el indice i representa la posicion actual que estamos ordenando.
        for (int j = i +1; j<t.length; j++) {
            //Este bucle recorre los elementos que están después del índice i.
            //
            //j compara t[i] con los valores que vienen después.
            //
            //Así encontramos si hay un valor menor que el actual.
            if (t[i] > t[j]) {
                // Si el elemento en la posición i es mayor que el que está en la posición j, significa que están mal colocados.
                //
                //Debemos intercambiarlos para que el menor quede antes.
                int temp = t[i];
                t[i] = t[j];
                t[j] = temp;
            }


        }
        }
    }
    public static void main(String[] args) {
        int[] numeros = {5,2,8,1,3} ;
        ordenarascendente(numeros);
        System.out.println("array ordenado: ");
        for (int n : numeros) {
            System.out.println(n + " ");
        }
    }
}
