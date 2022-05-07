public class Test1111 {

    public static void main(String[] args) {
        String s = "a#y&ue*d";
        //d#e&uy*a
        System.out.println(reverse(s));

    }

    public static String reverse(String s){
        StringBuilder ans= new StringBuilder();
        int j = s.length()-1;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){

                while(!Character.isLetter(s.charAt(j)))
                    j--;

                ans.append(s.charAt(j--));

            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }





}
