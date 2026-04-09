interface Device {
    void turnOn();
    void turnOff();
}

class Fan implements Device {
    public void turnOn() {
        System.out.println("Fan is ON");
    }

    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}

class Light implements Device {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

public class Device_main{
    public static void main(String[] args) {
        Device d1 = new Fan();
        d1.turnOn();
        d1.turnOff();

        Device d2 = new Light();
        d2.turnOn();
        d2.turnOff();
    }
}