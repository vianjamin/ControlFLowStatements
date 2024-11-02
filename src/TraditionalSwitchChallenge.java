public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        char natoVariable = 'C';

        switch (natoVariable) {
            case 'A':
                System.out.println(natoVariable + " in NATO is = ABLE" );
                break;
            case 'B':
                System.out.println(natoVariable + " in NATO is = BAKER" );
                break;
            case 'C':
                System.out.println(natoVariable + " in NATO is = CHARLIE" );
                break;
            case 'D':
                System.out.println(natoVariable + " in NATO is = DOG" );
                break;
            case 'E':
                System.out.println(natoVariable + " in NATO is = EASY" );
                break;
            default :
                System.out.println(natoVariable + " not found");

        }
    }
}
