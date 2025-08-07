public class array_original_copia {
    public static void main(String[] args) {
        int [] original = {9,10,85,90};
        int [] copia = original;

        copia[0] = 99;

        System.out.println("original[0]: " +original[0]);
        System.out.println("original[0]: " +copia[0]);

        System.out.println(copia);
        System.out.println(original);
    }
}
