public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        System.out.println();
        System.out.println("Обслуживаем " + getModelName());
        this.checkWheels();
        this.checkEngine();
    }
}
