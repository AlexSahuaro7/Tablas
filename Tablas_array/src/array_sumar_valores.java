import java.util.Stack;

public class array_sumar_valores {
    public static void main(String[] args) {
        int[] numeros = {5,10,15,20};
        int suma =0; //se crea una variable para guardar la suma
        for (int i =0; i < numeros.length; i++) {
            suma = suma +numeros[i];
            // por ejemplo valor 0 numero[i] 5 suma antes 0 suma despues 0 + 5 =5
            // valor i =1 numero[i]= 10 suma antes 5 suma despues 5 + 10 = 15
        }
        System.out.println("la suma es: "+suma);
    }
}
