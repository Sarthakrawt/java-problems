package recursionquestion;

public class fibonacci {
    public static void main(String[] args) {
        int a = 5;
        // System.out.println(fiboseries(a));
        System.out.println(fibo(a));
    }

    // static int fiboseries(int a) {
    // if (a < 2) {
    // return a;
    // }
    // return fiboseries(a - 1) + fiboseries(a - 2);
    // }

    // both printing fibo number
    // for readablity you can do this also
    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        int a = fibo(n - 1);
        int b = fibo(n - 2);
        int sum = a + b;
        return sum;
    }
}
