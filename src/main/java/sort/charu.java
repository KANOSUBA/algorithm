package sort;

public class charu {
    public static void main(String[] args) {
        int[] arr ={4,3,2,1};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j]<arr[j-1]){
                    swap1(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void swap2(int[] a,int i,int j){
        int tmp = a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
    public static void swap1(int[] a,int i,int j){
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
    }
}
