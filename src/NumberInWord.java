public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(4);

    }
    public static void printNumberInWord(int number) {
        String wordOfNumber = switch (number) {
          case 1 -> "One";
          case 2 -> "Two";
          case 3 -> "Three";
          case 4 -> "Four";
          case 5 -> "Five";
          case 6 -> "Six";
          case 7 -> "Seven";
          case 8 -> "Eight";
          case 9 -> "Nine";
          case 0 -> "Zero";
          default -> "Other";

        };
        System.out.println(number + " is " + wordOfNumber);
    }
}
