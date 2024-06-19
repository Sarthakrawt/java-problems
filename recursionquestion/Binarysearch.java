package recursionquestion;

public class Binarysearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        binaryrecu(0, arr.length - 1, arr, 4);
    }

    static void binaryrecu(int s, int e, int arr[], int target) {
        if (s > e) {
            return;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] > target) {
            binaryrecu(s, mid - 1, arr, target);
        } else if (arr[mid] < target) {
            binaryrecu(mid + 1, e, arr, target);
        } else {
            System.out.println(mid);
        }

    }
}
