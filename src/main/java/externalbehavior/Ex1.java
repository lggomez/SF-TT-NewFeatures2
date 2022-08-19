package externalbehavior;

final class Car {
  private int seats;

  public Car(int seats) {
    this.seats = seats;
  }

  public int getSeats() {
    return seats;
  }

  @Override
  public String toString() {
    return "Car{" +
        "seats=" + seats +
        '}';
  }
}

class Truck {
  private int payload;

  public Truck(int payload) {
    this.payload = payload;
  }

  public int getPayload() {
    return payload;
  }

  @Override
  public String toString() {
    return "Truck{" +
        "payload=" + payload +
        '}';
  }
}
public class Ex1 {
  public static void main(String[] args) {
    Object t = new Car(5);
    Object t2 = new Truck(4_000);

    int packageWeight = 800;

    switch(t) {
      case Car c && (c.getSeats() - 1) * 170 > packageWeight ->
          System.out.println("Car is good!");
      case Truck tr && tr.getPayload() > packageWeight ->
          System.out.println("Truck is good");
      default -> System.out.println(
          "Hmm, don't know how to transport package with that");
    }


  }
}
