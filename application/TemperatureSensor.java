package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isOn = false;

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public void setOff() {
        isOn = false;
    }

    @Override
    public int read() {
        if (!isOn) {
            throw new IllegalStateException("Sensor is off");
        }
        return new Random().nextInt(61) - 30;  // Get a random number between -30 and 30.
    }
}
