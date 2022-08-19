package sealedstuff;

sealed interface Transport permits Car, Motorcycle, Boat {
}

// must be final, sealed, or non-sealed
sealed class Car implements Transport permits Sports, Family {}
final class Motorcycle implements Transport {}
non-sealed class Boat implements Transport {}

final class Sports extends Car {}
final class Family extends Car {}

public class Ex1 {
  public static void main(String[] args) {
    Transport t = new Car();
    switch (t) {
      case Car c -> System.out.println("It's a car");
      case Motorcycle m -> System.out.println("It's a Motorcycle");
      case Boat b -> System.out.println("It's a boat");
//      case Transport tr -> System.out.println("It's a general transport");
    }
  }
}
