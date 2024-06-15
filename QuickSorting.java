public class QuickSorting {

    public static void main(String[] args) {
        int[] arr = {3,8,5,9,2,7,1,4,6};
        qucik_sort(arr, 0, 1, arr.length-1);
    }

    static void qucik_sort(int[] arr, int pivotIdx, int start, int end) {
//        if(start == end)
//            return;


        pivotIdx = pivot(arr, pivotIdx, start, end);
        qucik_sort(arr, start - 1 , start, pivotIdx - 1);
        qucik_sort(arr, pivotIdx + 1, pivotIdx + 2, end);




//        pivotIdx = pivot(arr, 0, start, end);
//
//        if(pivotIdx > 0 && 0 < pivotIdx-1) {
//            qucik_sort(arr, 0, 0, pivotIdx - 1);
//        } else {
//
//            return;
//        }

        if(pivotIdx+1 < arr.length-2) {
            qucik_sort(arr, pivotIdx+1, pivotIdx + 2, arr.length - 1);
        } else { return; }

    }

    static int pivot(int[] arr, int pivotIdx, int start, int end ) {
        /*
        right가 left보다 큰 동안
        left는 피벗보다 큰 수일 때, 멈춤
        right는 피벗보다 작은 수 일 때, 멈춤
        그리고 서로 둘다 멈춰있으면 자리를 바꾼다.
        left > right일 때, left와 right가 자리를 바꾸지 않고 피벗과 right의 자리를 바꾸고 종료.
        */
        int left=start;
        int right=end;
        int pivot = arr[pivotIdx];
        int resultIdx = 0;
//        while(left < right) {
        while(true) {

            for(int i=left;i<arr.length;i++){
                if(pivot < arr[i]){
                    break;
                }
                left++;
            }

            for(int j=right;j>=0;j-=1){
                if(pivot > arr[j])
                    break;
                right--;
            }


            if(left > right) {
                int tmp = arr[pivotIdx];
                arr[pivotIdx] = arr[right];
                arr[right] = tmp;
                resultIdx = right;
                break;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        return resultIdx;
    }

}
