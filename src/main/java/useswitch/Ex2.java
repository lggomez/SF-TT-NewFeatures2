package useswitch;

public class Ex2 {
  public static void main(String[] args) {
    int x;
    if (Math.random() > 0.5) x = 10;
    else x = 11;

    // conditional operator (sometimes "ternary" operator)
    int y = Math.random() > 0.5 ? 10 : 11;

    int v = 10;

    var result = switch(v) {
      case 10 -> {
        System.out.println("I notice it's ten");
        yield "It's ten";
      }
      case 11 -> "It's eleven";
      default -> "It's something else";
    };

    System.out.println("result is " + result);

    // preview in Java 17 and 18 !!!!
    Object obj = "Hello";
    var res2 = switch(obj) {
      // take care to put the more specific conditions first!!
      case String s && s.length() > 3 -> "It's a longish greeting: " + s;
      case String s && s.length() < 5 -> "It's a shortish greeting: " + s;
      case String s -> "It's a greeting: " + s;

      case Integer i -> "It's a number " + i;
      default -> "It's something else";
    };

    System.out.println("res2 is " + res2);

    var res3 = switch(v) {
      case 10: yield "Hello, It's ten";
      default: yield "It's something else";
    };

    System.out.println("res3 is " + res3);
  }
}
