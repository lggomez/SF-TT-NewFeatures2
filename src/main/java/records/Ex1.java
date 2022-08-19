package records;

// final type, with the field (final)
// getter type method (no setter)
// constructor
// equals, hashcode, toString
// intended to be immutable!!! -- this is implicitly final
record Car(int seats, String color/*, StringBuilder sb*/) {
//  int z; // NOPE, do it above;

  // this code *precedes* execution of the canonical constructor
  public Car {
    if (seats < 1) throw new IllegalArgumentException("no seats!?");
    if (seats > 10) seats = 4; // modifies the actual parameter NOT the field
//    this.seats = 5; // NOPE, can't write to the fields here.
    // runs off the end, into the canonical constructor
  }

  // Can, but usually don't, replace the "canonical constructor"
//  public Car(int seats, String color) {
//    this.seats = seats;
//    this.color = color;
//  }

  public Car() {
    this(4, "Black");
  }

  public String describeMyself() {
    return "I'm a " + color + " car with " + seats + " seats";
  }
  @Override // I CAN replace core behaviors
  public String toString() {
    return "I'm a " + color + " car with " + seats + " seats";
  }
}
record Truck(int payload) {}

public class Ex1 {
  public static void main(String[] args) {
    Object t = new Car(5, "Red");
    Object t2 = new Truck(4_000);

    int packageWeight = 800;

    switch (t2) {
      case Car c && (c.seats() - 1) * 170 > packageWeight ->
          System.out.println("Car " + c + " is good!");
      case Truck tr && tr.payload() > packageWeight ->
          System.out.println("Truck " + t + " is good");
      default -> System.out.println("Hmm, don't know how to transport package with that");
    }
  }
}
