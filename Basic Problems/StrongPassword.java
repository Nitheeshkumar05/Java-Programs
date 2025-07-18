import java.util.*;
public class password {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int f1=0,f2=0,f3=0,f4=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i) >= '0' && s.charAt(i)<='9'){
            f1=1;
        }else if(s.charAt(i) >= 'a' && s.charAt(i)<='z'){
            f2=1;
        }else if(s.charAt(i) >= 'A' && s.charAt(i)<='Z'){
            f3=1;
        }else{
            f4=1;
        }
    }if(f1==1&&f2==1&&f3==1&&f4==1&&s.length()>=8){
        System.out.println("Strong Password");
    }else{
        System.out.println("Weak Password");

    }
    }

    
}
