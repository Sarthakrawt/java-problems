import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // System.out.println(primecheck(num));
        primecheck(num);
    }

    static void primecheck(int num) {
        // if (num <= 1) {
        // return false;
        // }
        // int count = 2;
        // while (count * count <= num) {
        // if (num % count == 0) {
        // return false;
        // }
        // count++;
        // }
        // return count * count > num;
        if (num <= 1) {
            System.out.println("prime false");
        }
        for (int i = 2; i < num; i++) {
            if (num % num == 0 && num % i == 0) {
                System.out.println("prime false");
                break;
            } else if (num % num == 0 && num % i != 0) {
                System.out.println("prime true");
                break;
            }
        }

    }
}
