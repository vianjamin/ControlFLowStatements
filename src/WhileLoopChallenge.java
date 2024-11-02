public class WhileLoopChallenge {
    public static void main(String[] args) {

        int num = 4;
        int evenCounter = 0;
        int oddCounter = 0;
        while (num <= 20) {
            num+=1;
            if (!isEvenNumber(num)) {//isEvenNumber == true
                oddCounter ++;
                continue;
            }
            evenCounter ++;
            System.out.println(num + " ");
            if (evenCounter == 5) {
                break;
            }

        }
        System.out.println("total odd numbers found = " + oddCounter +
                " total even numbers found = " + evenCounter );

    }
    public static boolean isEvenNumber(int num) {//return true if num is even
        return (num % 2 ==0);

    }
}
