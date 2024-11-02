import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int counter = 1;

        while (counter < 6) {

            System.out.println("Enter number #" + counter);
            try {
                double userNumber = Double.parseDouble(scanner.nextLine());//catch statement checks here for errors
                //if there is an error the code beneath userNumber will not occur instead Invalid number will be printed
                sum += userNumber;
                counter++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        }
        System.out.println("The sum of the five number are " + sum);

    }


}
