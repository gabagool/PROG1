public class IsMinimumQuestion {
    public static boolean isMin(int a, int[] array) {
        if (array.length > 0){
            arraySort(array);
            return array[0] == a;
        }
        return false;
    }

    public static void arraySort(int[] b) {

        if (b.length != 1) {
            for (int i = 0; i < b.length - 1; i++) {
                int min = b[i];
                int indexOfMin = i;

                for (int j = i + 1; j < b.length; j++) {
                    if (b[j] < min) {
                        min = b[j];
                        indexOfMin = j;
                    }
                }
                int temp = b[i];
                b[i] = b[indexOfMin];
                b[indexOfMin] = temp;
            }

        }
    }
}
    // Skriv metoden i denna klass

