package Transport;

public class Vehicle {

    public String name;
    public String model;
    public int noOfTyres;

//    Vehicle() {
//        this.name = "";
//        this.model = "";
//        this.noOfTyres = -1;
//    }

    public Vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    public void startEngine() {
        int number = 55;

        System.out.printf("Engine is starting of %s: %s\n", name, model);
    }

    public void stopEngine() {
        System.out.printf("Engine is stopping of %s: %s\n", name, model);
    }

}
