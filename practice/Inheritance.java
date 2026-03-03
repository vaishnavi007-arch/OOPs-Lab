class Appliance {
    protected String name;
    protected boolean isOn;

    public Appliance(String name){
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " is ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is OFF");
    }

    public void status() {
        System.out.println(name + " status: "+(isOn ? "ON":"OFF"));
        System.out.println("==============================================");
    }
}

class Fan extends Appliance {
    private int speed;
    public Fan(String name){
        super(name);
        this.speed = 0;

    }

    public void setspeed(int speed){
        if(isOn){
            this.speed = speed;
            System.out.println(name + " speed set to "+speed);
        } else {
            System.out.println("Cannot set speed"+name+"is OFF");
        }
    }

    public void status() {
        super.status();
        if (isOn){
            System.out.println(name + " is ruuning at speed"+speed);
        }
    }
}

class Bulb extends Appliance {
    private int bright;
    public Bulb(String name){
        super(name);
        this.bright= 0;
    }
    public void setbright(int bright){
        if (isOn){
            this.bright = bright;
            System.out.println(name + " set brightness"+bright);
        } else {
            System.out.println("Cannot set brightness");
        }
    }


public void status() {
    super.status();
    if (isOn){
        System.out.println(name + " is glowing "+bright);
    }
}
}

public class Inheritance {
    public static void main(String[] args) {
        Fan roomfan = new Fan("Living room fan");
        Bulb roombulb = new Bulb("Living room bulb");

        roomfan.turnOn();
        roomfan.setspeed(3);
        roomfan.status();

        roombulb.turnOn();
        roombulb.setbright(75);
        roombulb.status();


        roomfan.turnOff();
        roombulb.turnOff();
    }
}