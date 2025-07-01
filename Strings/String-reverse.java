// package Problems;

public class StringReverse {
    public static void main(String[] args) {
        String s = "hseehtin";
        String res ="";
        
        int ch = s.length()-1;
        while(ch >=0){
            res += s.charAt(ch);
            ch--;
        }
        System.out.println(res);
    }

    
}
