import java.util.Arrays;

public class Coconut {

    public static void main(String[] args) {
//        int[] arr = {7,3,8,1,9,4,6,2,5};
//        int[] arr = {7,3,8,1,9,4,6,2,5};
        int[] arr = {2,5,3,1,9,4,6,7,8};

            for (int i = 0; i < arr.length; i++) {
                int par = (i / 2) - 1;
                while (par >= 0 && arr[par] < arr[i]) {
                    int tmp = arr[par];
                    arr[par] = arr[i];
                    arr[i] = tmp;
                    i = par;
                    par = (i - 1) / 2;
                }
            }

            for (int i = arr.length - 1; i > 0; i--) {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                int cur = 0, lch = 1, rch = 2;
                do {
                    if (rch < i && arr[lch] < arr[rch])
                        lch = rch;
                    if (arr[lch] > arr[cur]) {
                        int tmp = arr[cur];
                        arr[cur] = arr[lch];
                        arr[lch] = tmp;
                        cur = lch;
                        lch = cur * 2 + 1;
                        rch = cur * 2 + 2;
                    } else {
                        lch = i;
                    }

                } while (lch < i);

            }

        System.out.println(Arrays.toString(arr));

    }

}
