import java.util.Arrays;

public class bubbles {
    public static void main(String[] args) {
        System.out.println("Мне бы масив пузьрком отсоритровать.");
        int[] massif = {1, 2, 5, 3, 24, 11, 38, 22};
        System.out.println(Arrays.toString(massif));
        boolean Sorted = false;
        int byfer;
        while (!Sorted) {
            Sorted = true;
            for (int i = 0; i < massif.length - 1; i++) {
                if (massif[i] > massif[i + 1]) {
                    Sorted = false;

                    byfer = massif[i];
                    massif[i] = massif[i + 1];
                    massif[i + 1] = byfer;
                }
            }
        }
        System.out.println("Держи, брат.");
        System.out.println(Arrays.toString(massif));
    }
}