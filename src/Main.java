import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {8,7,6,5};
        for (int i = 0; i < array.length/2; i++) {
            int t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }
        System.out.println(Arrays.toString(array));
    }
}