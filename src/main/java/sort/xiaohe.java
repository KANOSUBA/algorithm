package sort;

public class xiaohe {
    public static void main(String[] args) {
        int[] arr ={1,3,4,2,5};
        int x = 6;
        int a = process(arr,0, arr.length-1);
        System.out.println(a);
    }

    public static int process(int[] arr,int L,int R){
        if (L==R){
            return 0;
        }
        int mid = L + ((R-L)>>1);
        return process(arr,L,mid) +
        process(arr,mid+1,R) +
        merge(arr,L,mid,R);
    }
    //help[i++] = arr[p1] <=arr[p2] ? arr[p1++]  : arr[p2++];
    public static int merge(int[] arr,int L,int M,int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;
        int res = 0;
        while (p1 <= M && p2 <= R) {
            if (arr[p1] < arr[p2]) {
                res = res + (R - p2 + 1) * arr[p1];
                help[i] = arr[p1];
                i++;
                p1++;
            } else if (arr[p1] >= arr[p2]) {
                res = res + 0;
                help[i] = arr[p2];
                i++;
                p2++;
            }
        }
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        for (int j = 0; j < help.length; j++) {
            arr[j + L] = help[j];
        }
        return res;
    }
}
