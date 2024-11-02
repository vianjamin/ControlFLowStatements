import java.util.Scanner;

public class ParseStringsAndExceptions {
    public static void main(String[] args) {
    int currentYear = 2022;

        try {
            System.out.println(getInputFromConsole(currentYear));//if this returns an error it used the other method
        } catch (NullPointerException e) {//e is the variable any variable name can be used
            System.out.println(getInputFromScanner(currentYear));
        }

//    String userDateOfBirth = "1999";
//
//    int dateOfBirth = Integer.parseInt(userDateOfBirth);//wrapped class of int
//    //Integer is a class and has method parseInt, converts string to int.
//
//        System.out.println("Age " + (currentYear - dateOfBirth));
//
//        String userAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
//        System.out.println("The user says he's " + ageWithPartialYear);
//
//        int numberSeq = 23456;
//        String numberSeqInWords = String.valueOf(numberSeq);
//        System.out.println(numberSeqInWords);



    }
    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!" );
        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = (currentYear - Integer.parseInt(dateOfBirth));

        return "So you are " + age + " years old";
    }
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

//        String name = System.console().readLine("Hi, what's your name? ");

        System.out.println("Hi, What's your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!" );
//        String dateOfBirth = System.console().readLine("What year were you born? ");
        System.out.println("What year were you born? ");

        boolean validDob = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDob = age >= 0;//same as saying if age is greater than or equal to return true else return false
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!! Try again.");
            }
        } while (!validDob);

        return "So you are " + age + " years old ";
    }
    //try statement
    //try {
    //statement that might get errors
    //} catch (Exception e) {
    //code to handle the exception
    //}

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if (dob < minimumYear || dob > currentYear) {
            return -1;
        }
        return currentYear - dob;
    }


}
