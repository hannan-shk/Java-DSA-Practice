public class Encapsulation {

    static void main() {

        System.out.println("Encapsulation in Java!");

        Person p1 = new Person(25, 03, "Hannan", 16, "Salma Hayek");

//        System.out.println(p1.age);

        Person p2 = new Person(p1);
//        p2.name = "Talha";
//        System.out.println(p2.age);
//        System.out.println();
        p2.talk();
        p1.setPriv("Selena Gomez");
        p2.getPriv();
        p2.talk();

    }

}
