// package Problems;

public class palindrome {
    public static void main(String[] args) {
        String s = "maDam";
        boolean res = true;
        
        int start = 0;
        int end = s.length()-1;
        s.toLowerCase();
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                res = false;
                break;
            }
            start++;
            end--;

        }
        System.out.println(res);
    }
    
}
