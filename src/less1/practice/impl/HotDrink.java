package less1.practice.impl;

import less1.practice.Product;

public class HotDrink extends Product {

    private float volume;
    private int temperature;

    public HotDrink(String name, float volume, int temperature) {
        super(name);
        this.volume = volume;
        this.temperature = temperature;
    }

    public float getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                "volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
}
