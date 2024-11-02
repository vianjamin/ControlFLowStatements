public class IsOdd {
    public static void main(String[] args) {

        System.out.println("Sum is = " + sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        if (number > 0 && (number % 2 == 1)) {
            return true;
        } else return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((end < start) || (end < 1) || (start < 1)) {
            return -1;
        }
        for (int range = start; range <= end; range++) {
            if (isOdd(range)) {
                sum += range;
            }
        }
        return sum;

    }
}
