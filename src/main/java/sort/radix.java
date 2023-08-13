package sort;

//基数排序
public class radix {
    public static void main(String[] args) {
        int[] arr ={17,13,25,100,72};
        int d = count(arr);
        radixSort(arr,d,0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    //计算数组中最高的位数
    public static int count(int[] arr){
        int res = 0;
        int max = Integer.MIN_VALUE;
        for (int i =0; i< arr.length; i++) {
            max = Math.max(max,arr[i]);
        }
        while(max>0){
            max = max / 10;
            res++;
        }
        return res;
    }

    public static void radixSort(int[] arr,int digit,int L,int R) {
        //十进制基数
        final int radix = 10;
        int[] help = new int[R - L + 1];
        int i = 0;
        int j = 0;

        for (int d = 1 ; d<=digit ; d++) {
            int[] count = new int[radix];

            for (i = L ; i <= R ;i++) {
                j = getDigit(arr[i],d);
                count[j]++;
            }

            for (i = 1;i < radix ;i++) {
                count[i] = count[i] + count[i-1];
            }

            for (i = R ; i >=L;i--) {
                j = getDigit(arr[i], d );
                help[count[j] - 1] = arr[i];
                count[j]--;
            }

            for (i = L, j = 0;i <= R; i++,j++){
                arr[i] = help[j];
            }

        }

    }
    //获取数第d位上的数字
    public static int getDigit(int arr,int d){
        return ((arr/((int)Math.pow(10,d-1)))%10);
    }
}
