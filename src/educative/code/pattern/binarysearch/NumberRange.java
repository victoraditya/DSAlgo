package educative.code.pattern.binarysearch;

public class NumberRange {

    public static void main(String[] args) {
        int[] result = new int[]{-1,-1};
       result  = NumberRange.findRange(new int[]{4,6,6,6,9},6);
        System.out.println(result[0]+" "+result[1]);
    }

    public static int[]  findRange(int[] arr,int target){
        int min = binarySearch(arr,target,false);
        if(min!=-1){
            int max=binarySearch(arr,target,true);
            return new int[]{min,max};
        }
        return new int[]{-1,-1};
    }

    public static int binarySearch(int[] arr,int target,boolean findMaxIndex){
        int start=0;
        int end= arr.length;
        int keyIndex=-1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                keyIndex=mid;
                if(findMaxIndex){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return keyIndex;

    }

}
