package sort;

public class guibin {
    public static void main(String[] args) {
        int[] arr ={1,4,6,45,3,2,2,4,6,7,8,9,45,3,2,5,6,7,8,3};
        process(arr,0, arr.length-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void process(int[] arr,int L,int R){
       if (L==R){
           return;
       }
       int mid = L + ((R-L)>>1);
       process(arr,L,mid);
       process(arr,mid+1,R);

       merge(arr,L,mid,R);
    }
    //help[i++] = arr[p1] <=arr[p2] ? arr[p1++]  : arr[p2++];
    public static void merge(int[] arr,int L,int M,int R){
        int[] help = new int[R-L+1];
        int i=0;
        int p1 = L;
        int p2 = M+1;
        while (p1 <= M && p2 <= R){
            if (arr[p1]<=arr[p2]){
                help[i] = arr[p1];
                i++;
                p1++;
            }
            else if (arr[p1]>arr[p2]){
                help[i] = arr[p2];
                i++;
                p2++;
            }
        }
        while(p1 <= M){
            help[i++] = arr[p1++];
        }
        while(p2 <= R){
            help[i++] = arr[p2++];
        }
        for (int j=0;j< help.length;j++){
            arr[j+L] = help[j];
        }
    }

}
