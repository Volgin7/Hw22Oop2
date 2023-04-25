public class Truck extends Car {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        System.out.println();
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
        this.checkEngine();
        this.checkTrailer();
    }
}
