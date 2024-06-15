import org.xml.sax.helpers.AttributesImpl;

public class Search {

    public static void main(String[] args) {
//        이진탐색
        int[] arr = {3,8,11, 14, 19, 25,30, 33, 42,44, 49, 53, 57, 66, 73, 84, 90, 95, 97};
        int target = 3;
        System.out.println(arr.length);
//        int[] arr = {1,2,3};
//        int target = 3;

        int index = binary_search(arr, target,0,arr.length-1);

        System.out.println("answer idx : " + index);
    }

    static int binary_search(int[] arr, int target,int left, int right) {
        int tmpIdx = (int)(left + right) / 2;
        if(arr[tmpIdx] == target) {
            return tmpIdx;
        } else if(arr[tmpIdx] > target){
            right = tmpIdx - 1;
        } else if(arr[tmpIdx] < target) {
            left = tmpIdx + 1;
        }

        return binary_search(arr, target, left, right);
    }

}
