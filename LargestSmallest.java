class LargestSmallest {
    public static void main(String[] args) {
        int arr[] = {5, 9, 2, 7, 1};
        int max = arr[0], min = arr[0];

        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        System.out.println("Largest = " + max);
        System.out.println("Smallest = " + min);
    }
}
