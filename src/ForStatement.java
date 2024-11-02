public class ForStatement {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter); //print counter each time loop runs
        } //counter variable initialized (declared and set to = 1)
        // expression is counter <= 5 (if counter variable is ever greater than 5 the loop will stop)
        // increment = counter++(increases value otherwise counter will always remain one and loop won't stop)

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10000 at " + rate + "% interest = " + interestAmount);
        } //double interestAmount has local scope which means it only exists within for loop

        for (double interestRate = 7.5; interestRate <= 10.0; interestRate += 0.25 ) {
            double interestAmount = calculateInterest(100, interestRate);
            if (interestAmount > 8.5) {
                break; //this is used to break out of the loop, end the loop early based on the if condition
            }
            System.out.println("100 at " + interestRate + "% interest = " + interestAmount);
        }
    }
    //for (init; expression; increment) {
    // }
    // init = (initialization declares or sets state, declaring or initializing loop variable)
    // expression = (once it becomes false will end loop processing/loop will run as long as expression true)
    // increment = (is executed after the expression is tested, loop variable is incremented)
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
