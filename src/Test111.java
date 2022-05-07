public class Test111 {

  //

    public static void main(String[] args) {
        int[] arr = {2,5,8,12,16,23,38 ,56 ,72 ,91 };
        int n = arr.length;
        int target = 23;
        int count=0;
        System.out.println(binarySearch(arr,0,n,target,count));
    }

    public static int  binarySearch (int [] arr,int l, int r,int x,int count){

        if(r>=l){
            count++;
            int mid = (l+r)/2;

            if(arr[mid] == x) return count;

            if(arr[mid]>x) return binarySearch(arr,l,mid-1,x,count);

            if(arr[mid]<x) return binarySearch(arr,mid+1,r,x,count);
        }

        return count;




    }



}
