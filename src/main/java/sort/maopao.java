package sort;

public class maopao {
    public static void main(String[] args) {
        int[] arr ={9,8,7,67,5,4,3,34,2,33,4,4,3,3};
        for (int i = 0 ;i<arr.length - 1 ; i++) {
            for (int j = 0; j< arr.length-1-i; j++ ) {
                if (arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void swap(int[] a,int i,int j){
        int tmp = a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
}
