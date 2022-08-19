package useswitch;

public class Ex1 {
  public static void main(String[] args) {
    int x = 99;
    // - alternation are listed with commas, we do NOT "fall through"
    //   when using arrow form
    // - on the right side of the arrow is a single statement or expression
    switch(x) {
      case 99, 100 -> {
        System.out.println("it's ninetynine or one hundred");
        System.out.println("we have a block here");
      }
      // Nope not legal, this is a declaration, not a statement/expression
//      case 200 -> int p = 200;
      default ->
        System.out.println("it's something else");
    }
//    switch(x) {
//      case 99:
//      case 100:
//        int y = 200;
//        System.out.println("it's ninetynine or");
//        System.out.println("it's one hundred");
//      default:
//        y = 300;
//        System.out.println("it's something else");
//        System.out.println("y is " + y);
//    }
  }
}
