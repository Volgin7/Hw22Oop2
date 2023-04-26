public class Bicycle extends Vehicle{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void service() {
        System.out.println();
        System.out.println("Обслуживаем " + getModelName());
        this.checkWheels();
        // for (int i = 0; i < this.getWheelsCount(); i++) {
        //    updateTyre();
        // }
    }
}
