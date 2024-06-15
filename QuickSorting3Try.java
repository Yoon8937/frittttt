import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class QuickSorting3Try {
    //Quick Sorting
    /* 피벗을 인자로 받을지 말지 정도만 참고하여 내가 푼 퀵정렬
        특정 데이터(피벗)을 기준으로 주어진 배열을 2개 부분배열로 분활,
        각 부분배열에 대해서 순환적으로 퀵정렬을 순환적으로 적용하는 방식
    * */
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 7, 2, 9, 1, 4, 6};  // --> [2, 1, 3, 7, 5, 9, 8, 4, 6] 여기서 2와1일 때는 정렬이 안되는데 어떡하냐
        quick_sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void quick_sort(int[] arr, int start, int end){
        if(start > end || start == end) // -> 이 코드는 결국 start < end 일 때의 조건과 같은 말. 다음에 실수하지를 않기를
            return;
        int pivot = partition(arr, start, end); //피벗 값을 인자로 넣어줘야 되는 줄 알아, 계속 헤멧다
        quick_sort(arr, start, pivot - 1 );
        quick_sort(arr, pivot + 1, end);
    }

    static int partition(int[] arr, int start, int end){ //피벗 인덱스 반환
        int pivotIdx = start;
        int left = start + 1;
        int right = end;
        int resultIdx = 0;

        while(true) {
            while(arr[left] < arr[pivotIdx] && left <= right) { //left < right가 맞는 듯 하지만 이렇게 하면 정렬이 되지 않는다
                left++;
            }

            while (arr[right] > arr[pivotIdx] &&  right >= 0){
                right--;
            }

            int tmp;
            if(left > right) {
                tmp = arr[right];
                arr[right] = arr[pivotIdx];
                arr[pivotIdx] = tmp;
                resultIdx = right;
                break;
            } else {
                tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
            }

        }

        return resultIdx;
    }

}
