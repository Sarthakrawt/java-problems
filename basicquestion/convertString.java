public class convertString {
    public static void main(String[] args) {
        // in this you have to just print the sum of the char ascii value where you have
        // given a string ;
        String s = "ab";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            max = max + (int) (ch);
        }
        System.out.println(max);
    }
}
