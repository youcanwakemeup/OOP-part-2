package OOP;

public class Main {
    public static void main(String[] args) {
        Car[] cars = { new Car("car1", 4),
                       new Car("car2", 4)};
        Truck[] trucks = {new Truck("truck1", 6),
                          new Truck("truck2", 8)};
        Bicycle[] bicycles = {new Bicycle("bicycle1", 2),
                              new Bicycle("bicycle2", 2)};

        ServiceStation.check(cars);
        ServiceStation.check(trucks);
        ServiceStation.check(bicycles);


    }
}