import java.util.Arrays;
import java.util.Scanner;

public class Blueberry {

    public static void main(String[] args) {
//        힙 구현하기
//        int[] arr = {7,3,8,1,9,4,6,2,5};
        int[] arr = {7,3,8,9,5,4,6,2,1};
        System.out.println(1/2);

        for(int i=0;i<arr.length;i++){
            int parent = arr[i];
            int child1;
            int child2;

            child1 = i*2+1;
            child2 = i*2+2;
            if(child1 > arr.length-1) {
                continue;
            } else {
                if(parent < arr[child1]){
                    int tmp = arr[i];
                    arr[i] = arr[child1];
                    arr[child1] = tmp;
                    check(arr,i, 1);
                }


            }

            if(child2 > arr.length-1){
                continue;
            } else {
                if(parent < arr[child2]){
                    int tmp = arr[i];
                    arr[i] = arr[child2];
                    arr[child2] = tmp;
//                    check(arr,i, 2);

                }

            }


        }

        System.out.println(Arrays.toString(arr));

    }

    static void check(int[] arr,int i, int fors){
        if(i==0 || arr[(int)(i-fors)/2] >= arr[i]){
            return;
        } else {
            int tmp = (int)(i-fors)/2;
            while(arr[tmp] < arr[i]) {
                int temp = arr[tmp];
                arr[tmp] = arr[i];
                arr[i] = temp;
                tmp = (tmp-fors)/2;
            }
            System.out.println(Arrays.toString(arr));

        }

    }

}
