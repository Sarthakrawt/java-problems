public class Largeleng {
    public static void main(String[] args) {
        // find the largest String in array
        String[] arr = { "apple", "apeeirowe", "aprilfoolling", "helrapoiahsd;foisajdoifa" };
        String max = "";
       String max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > max.length()) {
                max = arr[i];
            }
        }
        System.out.println(max);
}
