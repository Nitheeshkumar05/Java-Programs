// package Problems;

public class ToggleofCharacterOnly {
    public static void main(String[] args) {
        String s = "GeEks@gMail.CoM";
        String result = "";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                result = result + (char)(ch^32);
            }else{
                result += ch;
            }
        }
        System.out.println(result);
    }
    
}
