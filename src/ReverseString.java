public class ReverseString {

    static void printRev(String str,int idx){

        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        printRev(str,idx-1);
    }

    public static void main(String[]args){

         String name = "Raja";

         printRev(name,name.length()-1);

//        Our Method
//        char [] arr = name.toCharArray();
//
//        for(int i=arr.length-1;i>=0;i--){
//
//            System.out.print(arr[i]);
//        }

    }
}
