import java.util.Arrays;

public class invertir_array {
    public static void main(String[] args) {

        int[] datos = {1, 2, 3, 4, 5};
        int[] invertido = new int[datos.length];

for (int i = 0; i < datos.length; i ++) {
    invertido[i] = datos[datos.length - 1 -i];
    //Vamos a analizar esto más a fondo:
    //
    //El índice i empieza en 0 y va aumentando: 0, 1, 2, 3, 4
    //
    //El índice desde donde coges los datos es:
    //datos.length - 1 - i
    //Piensa en dos punteros:
    //
    //Uno va de izquierda a derecha (i)
    //
    //Otro va de derecha a izquierda (datos.length - 1 - i)
}

        System.out.println(Arrays.toString(invertido)); // debe mostrar [5, 4, 3, 2, 1]

    }
}
