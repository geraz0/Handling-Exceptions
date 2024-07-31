package application;

public class StandardSensor implements Sensor {
    private int temperature;

    public StandardSensor(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean isOn() {
        return true;  // This sensor is always on.
    }

    @Override
    public void setOn() {
        // This does nothing because the sensor is always on.
    }

    @Override
    public void setOff() {
        // This does nothing because the sensor is always on.
    }

    @Override
    public int read() {
        return temperature;
    }
}
