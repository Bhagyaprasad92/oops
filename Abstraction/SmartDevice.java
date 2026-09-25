package Abstraction;

abstract class SmartDevice {
    protected String name;
    SmartDevice() {
        name = "Undefined.";
    }
    SmartDevice(String name) {
        this.name = name;
    }
    abstract void turnOn();
    public void turnOff() {
        System.out.println(name + " is now turned off.");
    }
}

class SmartLight extends SmartDevice {
    SmartLight(String name) {
        super.name = name;
    }
    @Override
    void turnOn() {
        System.out.println(super.name + " is turned ON. Setting brightness to 80%.");
    }
}

class SmartSpeaker extends SmartDevice {
    SmartSpeaker(String name) {
        super.name = name;
    }
    @Override
    void turnOn() {
        System.out.println(super.name + " is turned ON. Streaming low-fi beats.");
    }
}

class SmartDeviceMain {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight("Living Room Light");
        SmartDevice speaker = new SmartSpeaker("Echo Speaker");
        light.turnOn();
        speaker.turnOn();
    }
}