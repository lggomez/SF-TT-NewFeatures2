package verify;

public class Verify {
  public static void main(String[] args) {
    Object obj = "Hello";
    System.out.println(switch(obj) {
      case String s && s.length() > 3 ->
          s + " Java 18 world!";
      default -> "Hmmm";
    });
  }
}
