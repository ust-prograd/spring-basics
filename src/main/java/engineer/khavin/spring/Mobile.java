package engineer.khavin.spring;

/*
IOC container (Bean Factory & Application Context)
 - air (Airtel)
 - jio (Jio)

 */

//ioc
// bean created
//    init (start)
//     .
//   destroy (stop)
// bean destroyed


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    private Sim sim1;
    private Sim sim2;

    public void start() {
        System.out.println("I'm a init lifecycle method");
    }

    Mobile() {
        System.out.println("I'm the constructor of Mobile");
    }


    public void setSim1(Sim sim1) {
        this.sim1 = sim1;
    }

    public void setSim2(Sim sim2) {
        this.sim2 = sim2;
    }

    public void printSims() {
        System.out.println(sim1); // memory address
        System.out.println(sim2); // memory address
    }

    public void call() {
        sim1.call();
    }
}
