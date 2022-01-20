package engineer.khavin.spring;

public class Airtel implements Sim {
    @Override
    public void call() {
        System.out.println("calling using Airtel");
    }
}
