// Q.3) Create a PalindromeChecker class with an attribute text. Add methods to:
//Check if the text is a palindrome.
//Display the result.

// Create a class PalindromeChecker

class PalindromeChecker{

//    Set attributes
        String text;

//        Create constructor
    PalindromeChecker(String text){
        this.text = text;
    }

//    Create method to check if text entered is palindrome or not
    boolean checkPalindromeOfText(){
        int left =0;
        int right =text.length()-1;
        while(left<right){

           if(text.charAt(left)!=text.charAt(right)){
               return  false;
           }
           left ++;
           right --;
        }
           return true;
    }
}

public class CheckPalindrome {
    public static void main(String[] args) {

//        Create object of PalindromeChecker class
        PalindromeChecker obj = new PalindromeChecker("wew");

//        Call method to check if text is palindrome
     boolean isBoolean = obj.checkPalindromeOfText();
        if (isBoolean){
            System.out.println("Text is Palindrome.");
        } else System.out.println("Not a palindrome text.");
    }
}
