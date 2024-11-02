import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double minNumber = 0;
        double maxNumber = 0;
        int loopCount = 0;
        while (true) {
            System.out.println("Please enter a number.");
            try {
                double value = Double.parseDouble(sc.nextLine());
                loopCount++;
                if (loopCount ==1) {
                    minNumber = value;
                    maxNumber = value;
                } else if (maxNumber < value) {
                    maxNumber = value;

                } else if (value < minNumber) {
                    minNumber = value;
                }
            } catch (NumberFormatException errors) {
                break;
            }
        }
        System.out.println("Min number = " + minNumber + " Max number = " + maxNumber);

    }
}
