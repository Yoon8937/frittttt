import java.util.Arrays;

public class QuickSorting2Try {
    //Quick Sorting
    /*
        특정 데이터(피벗)을 기준으로 주어진 배열을 2개 부분배열로 분활,
        각 부분배열에 대해서 순환적으로 퀵정렬을 순환적으로 적용하는 방식
    * */
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 7, 2, 9, 1, 4, 6};
        quick_sort(arr, 0,1, arr.length-1);

    }

    static void quick_sort(int[] arr, int pivot, int start, int end){
//        if(end - start <= 2)
//            return;
        pivot = partition(arr, pivot, start, end);
        quick_sort(arr, pivot-1, start, pivot - 1); //아 피벗을 어떻게 넣어줘야 되냐
        quick_sort(arr, pivot, pivot+1 , end);
    }

    static int partition(int[] arr, int pivot, int start, int end){ //피벗 인덱스 반환

        int pivotIdx = pivot;
        int left = start;
        int right = end;
        int resultIdx = 0;

        while(left <= right) {
            while(left <= end && arr[left] < arr[pivotIdx]){
                left++;
            }
            while( right >= start && arr[right] > arr[pivotIdx]){
                right--;
            }
            int tmp;
            if(left > right ) {
                tmp = arr[pivotIdx];
                arr[pivotIdx] = arr[right];
                arr[right] = tmp;
                resultIdx = right;
            } else {
                tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
            }
        }
        return resultIdx;
    }

}
