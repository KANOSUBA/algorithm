package sort;

public class erfen {
    public static void main(String[] args) {

        //找3
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;
        int tmp = arr[mid];
        int x = 7;


        while(true){
            System.out.println(tmp);
            if (tmp<x){
                low = mid+1;
                mid = (low+high)/2;
                tmp = arr[mid];

            }
            else if (tmp>x){
                high = mid -1;
                mid = (low+high)/2;
                tmp = arr[mid];

            }
            else if(tmp == x){
                System.out.println(tmp);
                break;
            }
        }
    }
}
