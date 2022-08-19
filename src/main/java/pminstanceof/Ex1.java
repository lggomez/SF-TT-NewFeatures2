package pminstanceof;

public class Ex1 {
  public static void main(String[] args) {
    Object obj = "Hello";
    if (obj instanceof String) {
      String s = (String)obj;
      System.out.println("it's a string: " + s + " with length " + s.length());
    } else {
      System.out.println("It's not a String!");
    }

    if (obj instanceof String s) {
      System.out.println("it's a string: " + s + " with length " + s.length());
    } else {
      // s is out of scope here
      System.out.println("It's not a String!"/* + s*/);
    }
    // s is out of scope here too
//    System.out.println(s);

    if (!(obj instanceof String s && s.length() > 3)) {
      // s is out of scope here
      System.out.println("It's not a String!" /*+ s*/);
    } else {
      System.out.println("it's a string: " + s + " with length " + s.length());
    }

  }
}
