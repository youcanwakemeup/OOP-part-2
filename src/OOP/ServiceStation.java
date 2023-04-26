package OOP;

public class ServiceStation  {

    public static void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        }
    }
    public static void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }
    public static void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }
    public static void check(Car[] cars) {
        for (Car car : cars) {
            if (car != null) {
                check(car);
            }
        }
    }
    public static void check(Bicycle[] bicycles) {
        for (Bicycle bicycle : bicycles) {
            if (bicycle != null) {
                check(bicycle);
            }
        }
    }
    public static void check(Truck[] trucks) {
        for (Truck truck : trucks) {
            if (truck != null) {
                check(truck);
            }
        }
    }
}

