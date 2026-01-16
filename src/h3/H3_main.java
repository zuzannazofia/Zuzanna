package h3;

import java.util.Arrays;
public class H3_main {

	public static void main(String[] args) {
		
		int[] a = {7, 3, 9, 1, 5, 2, 8, 6, 4};
        int[] b = {42};
        int[] c = {5, -1, 5, 0, 12, 3};

        System.out.println(Arrays.toString(mergeSort(a)));
        System.out.println(Arrays.toString(mergeSort(b)));
        System.out.println(Arrays.toString(mergeSort(c)));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr == null) return null;
        if (arr.length <= 1) return Arrays.copyOf(arr, arr.length);

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                res[k++] = left[i++];
            } else {
                res[k++] = right[j++];
            }
        }

        while (i < left.length) res[k++] = left[i++];
        while (j < right.length) res[k++] = right[j++];

        return res;
    }
}

	


