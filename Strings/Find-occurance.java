// package Problems;

public class findoccurance {
    public static void main(String[] args) {
        String s1 = "geeks for geeks";
        String s2 = "geek";
        occurance(s1,s2);
    }
    public static void occurance(String s1,String s2){
        int pos = s1.indexOf(s2);
        while(pos >= 0){
            System.out.print(pos + " ");
            pos = s1.indexOf(s2,pos+1);
        }
    }
    
}
