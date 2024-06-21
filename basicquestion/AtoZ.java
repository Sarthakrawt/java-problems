import java.util.Arrays;

public class AtoZ {
    public static void main(String[] args) {
        String b = new String();
        StringBuilder a = new StringBuilder();
        char[] arr = new char[26];
        for (int i = 0; i < 26; i++) {
            a.append((char) ('a' + i));
            arr[i] = (char) ('a' + i);

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(b.toCharArray()));
        for (char num : arr) {
            System.out.println(num);
        }
    }

}
