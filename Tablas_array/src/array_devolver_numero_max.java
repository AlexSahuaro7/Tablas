public class array_devolver_numero_max {
    public static int maximo(int t[]) { // esta funcion recibe un array de enteros (int t[]) como parametro.
        // devuelve un numero entero (int) que sera el mayor valor dentro del array.
        int max = t[0]; //creamos una varaible llama max y le damos el valor del primer elemento del array t
        for (int i=0; i<t.length ; i++) { // bucle for, empieza desde la primera posicion del array, recorre el array mientras no llegue al final
            if (t[i]>max) { // dentro del bucle comparamos t[i] con max, si el numero actual es mayor que max, lo guardamos como nuevo maximo.
                max = t[i];
            }
        }
        return max; //cuando el numero termina devolvemos el numero mas grande que hemos encontrado
    }
    public static void main (String[] args) {
        int[] numeros = {12,15,20,89}; // creamos un array llamado numeros que contiene 4 enteros
        int resultado = maximo(numeros); // llamamos a la funcion maximo, le pasamos el array numeros, y guardamos el resultad en resultado.
        System.out.println("el numero maximo es: " +resultado);
    }
}
