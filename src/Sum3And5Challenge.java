public class Sum3And5Challenge {
    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 1000; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                counter += 1;
                sum += i;
                System.out.println(i);
            }

            if (counter == 5) {
                break;
            }

        }

        System.out.println("sum of the numbers that met the conditions is = " + sum);

    }

}
