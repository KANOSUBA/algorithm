package sort;

public class heap {
    public static void main(String[] args) {
        int[] arr ={1,4,6,45,3,2,2,4,6,7,8,9,45,3,2,5,6,7,8,3};
        heapSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void heapSort(int[] arr){
        for (int i=0;i< arr.length;i++){
            heapInsert(arr,i);
        }
        int heapsize = arr.length;
        swap(arr,0,--heapsize);
        while(heapsize > 0) {
            heapify(arr,heapsize,0);
            swap(arr,0,--heapsize);
        }

    }
    //某个数出现在index位置上，向上继续移动
    public static void heapInsert(int[] arr,int index){
        while(arr[index]>arr[(index-1)/2]){
            swap(arr,index,(index-1)/2);
            index = (index-1)/2;
        }
    }
    //某个数在index位置，能否往下移动
    public static void heapify(int[] arr,int heapsize,int index){
        int left = index * 2 + 1;
        while (left < heapsize){
            int largest = left + 1 < heapsize && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index){
                break;
            }
            swap(arr,largest,index);
            index = largest;
            left = index * 2 + 1;
        }
    }
    public static void swap(int[] a,int i,int j){
        int tmp = a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
}
