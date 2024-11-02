public class NewSwitchChallenge {
    public static void main(String[] args) {

        printDayOfTheWeek(4);
    }
    public static void printDayOfTheWeek(int day) {

        String dayOfTheWeek = switch (day) {
            case 0 -> ("Sunday");
            case 1 -> ("Monday");
            case 2 -> ("Tuesday");
            case 3 -> ("Wednesday");
            case 4 -> ("Thursday");
            case 5 -> ("Friday");
            case 6 -> ("Saturday");
            default -> ("Invalid number");

        };
        System.out.println(dayOfTheWeek);
    }
}
