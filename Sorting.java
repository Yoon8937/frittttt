import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 7, 2, 9, 1, 4, 6};

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int left = start + 1;
        int right = end;

        while (true) {
            while (left <= right && arr[left] <= pivot) {
                left++;
            }

            while (left <= right && arr[right] >= pivot) {
                right--;
            }

            if (left > right) {
                break;
            }

            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        // Swap arr[start] (pivot) with arr[right]
        arr[start] = arr[right];
        arr[right] = pivot;

        return right;
    }
}
