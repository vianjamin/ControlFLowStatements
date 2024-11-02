public class WhileAndDoWhileLoops {
    public static void main(String[] args) {

      for (int i = 1; i <= 5; i++) {
          System.out.println(i);
      }
//    both these loops accomplish the same thing
      int j = 1; //variables have to be declared outside the loop and increments have to be declared inside the loop
      while (j <= 5) {
          j += 1;
      }
//    another way to write this loop is so
      int s = 1;
      while (true) {//endless loop will run forever but doesn't because
          if (s > 5) {
              break;//this breaks out of the while loop
          }
          System.out.println(s);
          s++;
      }
//    do while loop
      int m = 1;
      boolean isReady = false;
      do {
          if (m > 5) {
              break;
          }
          System.out.println(m);
          m++;
          isReady = (j > 0);
      } while (isReady);
    }
}
