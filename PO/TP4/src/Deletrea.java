public class Deletrea {
    public static void main(String[] args){
        for(String s : args)
            deletrear(s);
    }

    private static void deletrear(String s){
        int length = s.length();
        for(int i=0; i<length; i++){
            System.out.print(s.charAt(i));
            if( i+1 != length )
                System.out.print("-");
        }
        System.out.println();
    }
}
//eloo aas dasdv d