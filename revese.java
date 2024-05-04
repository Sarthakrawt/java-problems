public class revese {
    public static void main(String[] args) {
        int num = 2345;
        // you have to reverse this number
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            rev = (rev * 10) + rem;
        }
        System.out.println(rev);
    }
}
