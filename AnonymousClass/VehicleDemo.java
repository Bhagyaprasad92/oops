package AnonymousClass;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Car started.");
            }

            @Override
            public void stop() {
                System.out.println("Car stopped.");
            }
        };
        vehicle.start();
        vehicle.stop();
        vehicle = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Bike started.");
            }

            @Override
            public void stop() {
                System.out.println("Bike stopped.");
            }
        };
        vehicle.start();
        vehicle.stop();
    }
}
