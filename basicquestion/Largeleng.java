public class Largeleng {
    public static void main(String[] args) {
        // find the largest String in array
        String[] arr = { "apple", "apeeirowe", "aprilfoolling", "helrapoiahsd;foisajdoifa" };
        String max = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].length() > arr[j].length()) {
                    max = arr[i];

                } else if (arr[j].length() > arr[i].length()) {
                    max = arr[j];
                }
            }
        }
        System.out.println(max);
    }
}
