import java.util.Scanner;
//This program allows you to input as many numbers as you like and returns both the sum and average
//if you wish to see the result of your inputs, just input any letter when asked to input integer
public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int counter = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter integer");
                sum += Integer.parseInt(sc.nextLine());
                counter++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        double average = (double) sum / counter;
        long round = Math.round(average);
        System.out.println("SUM = " + sum + " AVG = " + round);
    }

}
