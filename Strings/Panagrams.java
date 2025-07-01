
public class Panagrams {
     static boolean isPanagram(String s)
    {
        int n = s.length();
        
        if(n < 26)
            return false;
        
        boolean visited[] = new boolean[26];
        
        for(int i=0; i<n; i++)
        {
            char x = s.charAt(i);
            
            if(x >= 'a' && x <='z')
            {
                visited[x-'a'] = true;
            }
            
            if(x >= 'A' && x <='Z')
            {
                visited[x-'A'] = true;
            }
        }
        
        for(int i =0; i<26; i++)
        {
            if(visited[i] == false)
                return false;
        }
        
        return true;
    }
    
    public static void main(String args[])
    {
        String s = "The quick brown fox jumps over the lazy dog";
        
        System.out.println(isPanagram(s));
    }
}
    
//     Input: str = "abc xyz pqr"
// Output: false
// Explanation: This string does not contain all the characters from ‘a’ to ‘z’, as some letters are missing.


    

