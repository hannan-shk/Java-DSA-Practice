import Transport.Car;
import Transport.MotorCycle;

public class Inheritence {

    static void main() {

        main("Hannan");

    }

    public static void main(String name) {
        System.out.println(name);

//        Car c1 = new Car("Honda", "Civic", 4, 4, "Automatic");
//
//        c1.startEngine();
//        System.out.println(c1.noOfDoors);
//        System.out.println(c1.noOfTyres);

        MotorCycle m1 = new MotorCycle("Yamaha", "YBR125G", 2, "Normal", "Trail");

        m1.startEngine();
        m1.stopEngine();
        m1.wheelie();


        System.out.println(m1.handleBarStyle);

    }

}
