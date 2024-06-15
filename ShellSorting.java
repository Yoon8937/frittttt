import java.util.Arrays;

public class ShellSorting {

    public static void main(String[] args) {
        //셸정렬   6/3
        int[] arr = {3,8,5,9,2,7,1,4,6};

        shell_sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void shell_sort(int[] arr, int n) {

        n /= 2;

        for(int i=n;i>0;i/=2) { // 실수 : i>=0으로 해서 무한반복문에 빠졌다.

            for(int j=0;j<i;j++) {//j<n으로 했다...n으로 할 필요가 없음.
                insert_shell(arr,i,j);
            }
        }
        return;
    }

    static void insert_shell(int[] arr, int gap, int startIdx) {

        for(int i=startIdx+gap;i<arr.length;i+=gap) {

            int target = arr[i];
            int j;

            for(j=i; j>=gap && target<arr[j-gap] ; j-=gap) { //일단 내가 실수했던 것, i>=0으로 함. i>=gap으로 하지 않았다. gap으로 하는 이유는 arr[j-gap]이 있기 때문에. 그래서 계속 마이너스 인덱스가 나와 강제 종료돔.
                arr[j] = arr[j-gap];
            }
            arr[j] = target;
        }
//        처음에 풀었던 코드
//        for(int i=startIdx+gap;i<arr.length; i+= gap) {
//
//            int target = arr[i];
//            int j;
//
////            for(j=i;j>=1&&arr[j-gap]>target;j-=gap) {
//            for(j=i;j>=1;j-=gap) {
//                arr[j] = arr[j-gap];
//            }
//            arr[j] = target;
//        }
//        return;
    }

}