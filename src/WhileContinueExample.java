public class WhileContinueExample {
    public static void main(String[] args) {
        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 10 == 0) {
                continue;//this cause the loop to start again and skips the print statement
                //thus removing any numbers divisible by 25 from the print statement
                //it skips anything occurring after continue
            }
            System.out.print(number + "_");
        }
    }
}
