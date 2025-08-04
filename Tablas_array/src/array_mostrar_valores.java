public class array_mostrar_valores {
    public static void main (String[] args) {
        int[] numeros = {10,20,30,40,50}; // numeros.length es el tamaño del array
        for (int i = 0; i< numeros.length; i++) {
            System.out.println("Elemento en posicion "+i +": " +numeros[i]);
        }
    }
}
