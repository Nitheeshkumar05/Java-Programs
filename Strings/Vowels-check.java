public class vowelscheck {
    public static void main(String[] args){
        String ip = "programming";
        ip = ip.toLowerCase();
        int count = 0;
        for(char ch : ip.toCharArray()){
            
            if("aeiou".indexOf(ch) != -1){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
