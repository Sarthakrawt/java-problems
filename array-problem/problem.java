public class lenofarrelm {
    // prints elements which are of even length from an array
    public static void main(String args[]) {
        int[] arr = { 23, 344, 54 };
        for (int a : arr) {
            int count = String.valueOf(a).length();
            if (count % 2 == 0) {
                System.out.println(a);// {23,54}
            }
        }
    }
}
