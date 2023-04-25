public class Main {
    public static void main(String[] args) {

        Vehicle [] vehicles = new Vehicle[] {
                new Bicycle("Merida Dakar", 2),
                new Car("Volvo XC70", 4),
                new Truck("Kamaz-45143-50", 4)
        };

        for (Vehicle element:vehicles) {
            element.service();
        }

    }
}