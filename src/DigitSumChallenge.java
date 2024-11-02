public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1000));
        System.out.println(newSumDigits(1687452 ));

    }

    public static int sumDigits(int num) {
        if (num < 0) return -1;
        int mod = 10;
        int divide = 1;
        int sum = 0;
        while (divide <= num) {
            sum += (num % mod) / divide;
            mod *= 10;
            divide *= 10;

        }
        return sum;
    }
    //another way to write this method
    public static int newSumDigits( int number ) {
        int sum = 0;
        if (number < 0) return -1;
        while (number > 9) {
            sum += number % 10;
            number /= 10;
        }
        sum += number;
        return sum;
    }
}
