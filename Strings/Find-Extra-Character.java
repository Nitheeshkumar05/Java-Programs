
import java.util.Arrays;

// package Problems;

public class FindExtraCharacter {
    public static void main(String[] args) {
        String s1 = "abcd";
    String s2 = "cbdae";
    System.out.println("Extra character : " + findextra(s1,s2));
        
    }
    public static char findextra(String s1,String s2){
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        int n = s1.length();
        for(int i=0;i<s1.length();i++){
            if(ch1[i] != ch2[i]){
                return ch2[i];
            }
        }

        return ch2[n];
    } 
    
}
