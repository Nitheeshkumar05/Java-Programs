public class printalphabets {
    public static void alphabets(char c1, char c2) {
        for (char ch = c1; ch <= c2; ch++) {
            System.out.print(ch + " ");
        }
      
        // code here
        
    }
    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'z';
        alphabets(ch1,ch2);
    }
    
}
