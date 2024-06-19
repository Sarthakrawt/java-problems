package recursionquestion;

public class sumofdig {
    public static void main(String[] args) {
        int n = 143;

        System.out.println(sumOfdigit(n, 0));

    }

    static int sumOfdigit(int n, int sum) {
        int rem = n % 10;
        if (n == 0) {
            return sum;
        }
        return sumOfdigit(n / 10, rem + sum);
    }
}
