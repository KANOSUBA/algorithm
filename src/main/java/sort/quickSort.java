package sort;

public class quickSort {

    public static void main(String[] args) {
        int[] arr ={4,3,2,1};
        int L = 0;
        int R = arr.length - 1;
        quick(arr, L , R);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void quick(int[] arr,int L,int R){
        if (L < R){
            swap(arr, L + (int)(Math.random()*(R - L + 1)) , R);
            int[] p = partition(arr, L, R);
            quick(arr, L, p[0] - 1);
            quick(arr, p[1]+1, R);
        }
    }

    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int[] partition(int[] arr,int L,int R){
        int less = L - 1;
        int more = R;
        while(L < more){
            if (arr[L] < arr[R]){
                swap(arr, ++less , L++);
            } else if (arr[L] > arr[R]) {
                swap(arr,--more,L);
            } else {
                L++;
            }
        }

        swap(arr,more,R);
        return new int[] { less + 1,more};
    }
}
