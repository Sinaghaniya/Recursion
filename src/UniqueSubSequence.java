import java.util.HashSet;

public class UniqueSubSequence {
    static void SubSequences(String str,int idx,String newString,HashSet<String> set){

        if(idx==str.length()){

            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);

        //want to add

        SubSequences(str,idx+1,newString+currChar,set);

        //or not want to add

        SubSequences(str,idx+1,newString,set);
    }
    public static void main(String[]args) {

        String name = "aaa";

        HashSet<String> set = new HashSet<>();

        SubSequences(name, 0, " ",set);
    }
}
