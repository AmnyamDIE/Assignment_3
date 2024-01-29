interface SmartDevice {
    void turnOn();
    void turnOff();
    void connectToInternet();
}

abstract class Gadget implements SmartDevice {
    public abstract void receiveNotification(String message);
    public abstract void batteryStatus();

    @Override
    public void turnOn() {
        System.out.println("Device is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Device is turned off.");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Device is connected to the internet.");
    }
}

class SmartPhone extends Gadget {
    @Override
    public void receiveNotification(String message) {
        System.out.println("SmartPhone received notification: " + message);
    }

    @Override
    public void batteryStatus() {
        System.out.println("SmartPhone battery is at 80%.");
    }

    public void makeCall(String number) {
        System.out.println("Making a call to " + number);
    }

    public void sendSMS(String message) {
        System.out.println("Sending SMS: " + message);
    }

    public void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("SmartPhone is connecting to another device.");
    }
}

class SmartWatch extends Gadget {
    @Override
    public void receiveNotification(String message) {
        System.out.println("SmartWatch received notification: " + message);
    }

    @Override
    public void batteryStatus() {
        System.out.println("SmartWatch battery is at 90%.");
    }

    public void trackHeartRate() {
        System.out.println("Tracking heart rate.");
    }

    public void showTime() {
        System.out.println("Displaying current time on SmartWatch.");
    }

    public void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("SmartWatch is connecting to another device.");
    }
}

class SmartTV extends Gadget {
    @Override
    public void receiveNotification(String message) {
        System.out.println("SmartTV received notification: " + message);
    }

    @Override
    public void batteryStatus() {
        System.out.println("SmartTV does not have a battery.");
    }

    public void streamVideo(String url) {
        System.out.println("Streaming video from " + url);
    }

    public void changeChannel(int channel) {
        System.out.println("Changing TV channel to " + channel);
    }

    public void connectToDevice(SmartDevice anotherDevice) {
        System.out.println("SmartTV is connecting to another device.");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        SmartWatch watch = new SmartWatch();
        SmartTV tv = new SmartTV();

        phone.turnOn();
        phone.makeCall("123456789");
        phone.sendSMS("Hello!");
        phone.connectToDevice(tv);

        watch.turnOn();
        watch.trackHeartRate();
        watch.showTime();
        watch.connectToDevice(phone);

        tv.turnOn();
        tv.streamVideo("https://example.com/video");
        tv.changeChannel(5);
        tv.connectToDevice(watch);
    }
}