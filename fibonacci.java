public class fibonacci {
    // print the nth fibonacci number
    // given a = 0 and b = 1;
    public static void main(String[] args) {
        int a = 0;// first fibonacci number
        int b = 1;// second fibonacci number
        int n = 3;

        // start from 2 because we have already two numbers
        for (int i = 2; i <= n; i++) {

            // this is swapping temp a and b with new values where b > a
            int temp = b;
            b = a + b;
            a = temp;

        }
        System.out.println(b);
    }
}
