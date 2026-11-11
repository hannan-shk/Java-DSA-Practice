public class ObjectAndClasses {

    static void main() {
        System.out.println("Classes, Objects and Constructors!");

        // Setting attributes values when using default constructor.
        // Student A = new Student();
        // A.id = 1;
        // A.age = 20;
        // A.name = "Hannan";
        // A.nos = 8;
        // System.out.println(A.name);
        // A.study();

        Student B = new Student(03, 22, "Hannan", 8, "Hayley");
        //
        // System.out.println(B.name);
        // System.out.println(B.age);
        // System.out.println(B.id);
        // System.out.println(B.nos);
        //
        // B.study();
        // B.sleep();

        Student C = new Student(B);

        System.out.println(C.name);
        System.out.println(C.age);
        System.out.println(C.id);
        System.out.println(C.nos);
        B.talk();

        C.study();

    }

}
