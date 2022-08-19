package equality;

public class TestMe {
  private int x;
  private int y;

  public TestMe(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public final boolean equals(Object obj) {
    // if obj instanceof, cast, then compare fields
    return obj instanceof TestMe other &&
        this.x == other.x &&
        this.y == other.y;
  }
}

class TestMeSpecial extends TestMe {
  private int z;
  public TestMeSpecial(int x, int y, int z) {
    super(x, y);
    this.z = z;
  }

//  @Override
//  public boolean equals(Object obj) {
//    // if obj instanceof, cast, then compare fields
//    return obj instanceof TestMeSpecial other &&
//        super.equals(obj)
//        && other.z == this.z;
//  }

  public static void main(String[] args) {
    TestMe first = new TestMe(1, 2);
    TestMe second = new TestMeSpecial(1, 2, 3);
    TestMe third = new TestMeSpecial(1, 2, 5);
    System.out.println(first.equals(second));
    System.out.println(second.equals(first)); // yikes
    System.out.println(second.equals(third)); // yikes
    // solution: first choice, NEVER USE extends! Implementation
    // inheritance is so 20th century
    // second choice, make your equals method final
    // third choice, don't test with instanceof, but test with
    // this.getClass() == other.getClass()
  }
}