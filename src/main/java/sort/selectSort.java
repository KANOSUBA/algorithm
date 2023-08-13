package sort;

public class selectSort {
    public static void main(String[] args) {
        int[] arr ={9,8,7,67,5,4,3,34,2};

        for (int i = 0;i< arr.length-1;i++)
        {
            int min = i;

            for (int j = i+1;j< arr.length;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }

            swap2(arr,i,min);
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
