public class array_encontrar_numero_mayor {
    public static void main (String[] args) {
        int [] datos = {12,7,45,23,9};
        int max = datos [0];
        for (int i = 0; i< datos.length; i++) {
            if (datos[i]>max){
                max = datos[i];
            }
        }
        System.out.println("el valor maximo es: "+max);
    }
}
