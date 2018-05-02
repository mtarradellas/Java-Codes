public class Palindromo {
    public static void main(String[] args){
        StringBuilder s = new StringBuilder();
        for(String w : args){
            s.append(w.toLowerCase());
        }
        boolean is_palin = checkPalindrome(s.toString());
        if (is_palin){
            System.out.println(":)");
        }
        else System.out.println(":(");
    }
    private static boolean checkPalindrome(String s){
        int length = s.length()-1;
        for(int i=0; i<length/2; i++){
            if( s.charAt(i)!=s.charAt(length-i) )
                return false;
        }
        return true;
    }
}
