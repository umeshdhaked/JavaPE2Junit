package math.classes;

public class palindrome {

    public static boolean palindrome(String args){
        if(args==null)
            return false;
        String reversed = "";
        for(int i=args.length();i>0;i--)
         reversed = reversed+args.charAt(i-1);
            return reversed.equals(args);
    }
}
