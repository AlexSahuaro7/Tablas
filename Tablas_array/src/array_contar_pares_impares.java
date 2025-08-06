public class array_contar_pares_impares {

    // Función que muestra cuántos pares e impares hay
    public static void contar(int[] t) {
        int pares = 0;
        int impares = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }

    public static void main(String[] args) {
        int[] numeros = {3, 2, 5, 4, 6};
        contar(numeros); // Llamada a la función
    }
}
