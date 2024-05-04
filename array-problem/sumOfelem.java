public class sumOfelem {
    // Given an array of integers nums and an integer target, return index of the
    // two numbers such that they add up to target.

    public static void main(String[] args) {
        int array[] = { 2, 3, 4, 5 };
        int target = 7;// target sum

        for (int i = 0; i < array.length; i++) {
            // first loop run for each element
            for (int j = 1 + i; j < array.length; j++) {
                // second loops run form every element except array[i]element
                if (array[j] + array[i] == target) {
                    // it will print the index of that element whose sum = the target
                    System.out.println("founded at index" + i + " " + j);
                }

            }
        }
    }
}
