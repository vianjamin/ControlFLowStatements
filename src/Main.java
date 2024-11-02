public class Main {
    public static void main(String[] args) {

//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
        int switchValue = 1; //switch only works for int, short, byte, char
        //doesn't work on long, float, double and boolean
        switch (switchValue) { //switch used when you want to compare one variable to multiple conditions/values
            case 1:
                System.out.println("Value was 1");
                break;
            //without break the code will run the other cases as well until it finds a break
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("It was actually " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }

    }


}
