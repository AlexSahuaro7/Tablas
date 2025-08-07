import java.util.Arrays;

public class array_copia_referencia {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = a;

        b [1] = 99;

        System.out.println(a);
        System.out.println(b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }
}