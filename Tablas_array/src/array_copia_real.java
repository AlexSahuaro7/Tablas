import java.util.Arrays;

public class array_copia_real {
     public static void main(String[] args) {
         int [] original = {9, 10, 5, 3, 6};
         int [] copia = original.clone();

         copia[0] = 100;

         System.out.println(Arrays.toString(original));
         System.out.println(Arrays.toString(copia));

    }
}
