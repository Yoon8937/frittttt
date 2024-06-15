import java.util.Arrays;

public class HeapSorting {

    public static void main(String[] args) {
//        int[] arr = {60, 20, 30, 10, 70};

//        int[] arr = {3, 8, 5, 7, 2, 9, 1, 4, 6};
        int[] arr = {60, 20, 70, 10, 80, 30, 50, 40};
//		  80 70 60 40 20 30 50 10

        for(int i=0;i<arr.length;i++){//책 코드
            int par = i/2-1;
            while(par >= 0 && arr[par] < arr[i]) {
                int tmp = arr[par];
                arr[par] = arr[i];
                arr[i] = tmp;
            }
        }


//        내가 짠 초기힙 구현 코드, 기존의 코드가 제대로 동작이 되지 않는 것 같아서 내가 수정. 거의 내가 짰음.  동작이 잘 되는 것 같아 기쁨
//        for(int i=1;i<arr.length;i++) {
//
//            int child = i;
//
//            while(child > 0 ) {
//                int parent = (int)Math.round(child/2f) - 1;
//                if(arr[parent] < arr[child]) {
//                    int tmp = arr[parent];
//                    arr[parent] = arr[child];
//                    arr[child] = tmp;
////                    i = (int)Math.round(i/2f) - 1;
//                    child = parent;
//
//                } else {
//                    break;
//                }
//
//            }
//
//        }

        System.out.println(Arrays.toString(arr));

    }

}
