public sealed class Beverage implements Consumable permits Coffee, Tea {
    private double temperature;

    public void consume() {
        System.out.println("Consume beverage.");
    }

    public double getTemperature() {
        return this.temperature;
    }

    public void headUp() {
        this.temperature = 200.5;
    }
}
