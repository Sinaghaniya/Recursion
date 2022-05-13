public class SubSequences {

    static void SubSequences(String str,int idx,String newString){

        if(idx==str.length()){

            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        //want to add

        SubSequences(str,idx+1,newString+currChar);

        //or not want to add

        SubSequences(str,idx+1,newString);
    }
    public static void main(String[]args){


        String name = "abc";

        SubSequences(name,0," ");

    }
}
