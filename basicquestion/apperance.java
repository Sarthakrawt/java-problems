public class apperance {
    public static void main(String[] args) {
        int n = 12323331;
        int ap = 3;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == ap) {
                count++;

            }
            n = n / 10;

        }
        System.out.println(count);
    }

}
