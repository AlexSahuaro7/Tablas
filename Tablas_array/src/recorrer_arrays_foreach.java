public class recorrer_arrays_foreach {
    public static void main(String[] args) {
        int [] valores = {5,6,7,8} ;
        int suma =0;

        for (int v: valores) {
            suma = suma +v;
        }
            System.out.println("suma total:" +suma);
    }
}
