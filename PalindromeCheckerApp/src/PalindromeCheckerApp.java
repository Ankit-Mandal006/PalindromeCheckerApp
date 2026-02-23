/*
This class will print the details of the App.
* @author Ankit Mandal
* @Version 1.0
*
* */

public class PalindromeCheckerApp {
    public static void main(String[] args) {
       String wrd="madam",temp = "";
       for(int i=0;i<wrd.length();i++)
            temp=wrd.charAt(i)+temp;
       if(temp.equals(wrd))
           System.out.println("Palindrome");
       else
           System.out.println("Not Palindrome");
    }
}