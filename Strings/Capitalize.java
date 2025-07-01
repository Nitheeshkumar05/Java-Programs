class Solution {
    public static void changeCase(String s) {
        System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase());

    }
    public static void main(String[] args) {
        String s="hello";
        changeCase(s);
    }
}
