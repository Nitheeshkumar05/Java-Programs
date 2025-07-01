public class wordCountInString {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0; // no words in empty or only-space string
        }

        // Trim leading/trailing spaces and split by one or more spaces
        String[] words = str.trim().split("\\s+");

        // Return number of words
        return words.length;
    }
    public static void main(String[] args){
        String s = "Geeks for geeks";
        System.out.println(countWords(s));
    }
    
}
