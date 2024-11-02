public class DaysInMonth {
    public static void main(String[] args) {
        int year = 2000;
        int months = 1;
        System.out.println(isLeapYear(year));
        System.out.println(getDaysInMonths(year, months));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
           }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else return true;
        } else return false;

    }
    public static int getDaysInMonths(int year, int months) {
        boolean isLeapYear = isLeapYear(year);
        if ((months < 1 || months > 12) || (year < 1 || year > 9999)) return -1;
        if (isLeapYear && months == 2) return 29;

        return switch (months) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> -1;
        };
    }


//    public static int getDaysInMonths(int months, int year) {
//
//        int daysInMonths;
//        switch (months) {
//            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                daysInMonths = 31;
//                break;
//            case 4: case 6: case 9: case 11:
//                daysInMonths = 30;
//                break;
//            case 2:
//                if (isLeapYear(year)) {
//                    daysInMonths = 29;
//                } else daysInMonths = 28;
//                break;
//            default:
//                daysInMonths = -1;
//                break;
//        }
//
//        return daysInMonths;
//
//
//        //november april june september = 30 days february = 28 days, rest = 31
//        //(4 6 9 11) = 30,  (2) = 28,  (1 3 5 7 8 10 12) = 31
//        //jan 1 feb 2 mar 3 apr 4 may 5 jun 6 jul 7 aug 8 sept 9 oct 10 nov 11 dec 12}
//    }

}


