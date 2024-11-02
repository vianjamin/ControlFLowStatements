public class ForStatementChallenge {
    public static void main(String[] args) {

        int numberOfPrimes = 0;

        for (int number = 10; number <= 60; number++ ) {//when number greater than 5 loop ends

            if (isPrime(number)) {
                System.out.println(number + " is a prime number");
                numberOfPrimes += 1;
            }

            if (numberOfPrimes == 3) {
                break;
            }

        }

        System.out.println("There were " + numberOfPrimes + " prime numbers");

    }
    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 1) return false;
        //when divisor is greater than whole number loop ends.
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor ++) {

            if (wholeNumber % divisor == 0) {
                return false;
            }

        }

        return true;

    }

}
