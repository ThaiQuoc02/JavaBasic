public class solve {
    int solove(int[] arr) {
        int n = arr.length;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i < j + 1 && arr[i] > arr[j]) {
                    dem++;
                }
            }
        }

        return dem;
    }
}
