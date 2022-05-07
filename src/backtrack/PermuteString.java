package backtrack;

public class PermuteString {

    public static void main(String[] args) {
        String s = "ABC";
        int r = s.length()-1;
        int l=0;
        solution(s,l,r);
    }

    public static void solution(String s ,int l,int r){
        if(l==r) System.out.println(s);
        else{
            for(int i=l;i<=r;i++){
                s=swap(s,l,i);
                solution(s,l+1,r);
                s=swap(s,l,i);
            }
        }

    }

    public static String swap(String s,int i,int j){
        char temp;
        char[] cArray = s.toCharArray();
        temp=cArray[i];
        cArray[i]=cArray[j];
        cArray[j]=temp;
        return String.valueOf(cArray);
    }

}
