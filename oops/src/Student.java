import java.lang.reflect.Array;
import java.util.Arrays;

public class Student {

    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

//    Default Constructor!. Default constructors are those that didn't get any parameters like below one.
//    public Student() {
//        System.out.println("Student Default Constructor Called!");
//    }

    //    Parameterized Constructor
    public Student(int id, int age, String name, int nos, String gf) {
        System.out.println("Student constructor!");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;

    }

//    Copy Constructor

    public Student(Student srcobj) {
        System.out.println("Student copy constructor!");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;

    }

    public void study() {
        System.out.println(name + " is Studying");
    }

    public void talk(){
        System.out.println(name+" is Talking with "+gf);
    }

    public void sleep() {
        System.out.println(name + " is Sleeping");
    }

    public void bunk() {
        System.out.println(name + " is Bunking");
    }

    private void gfChatting() {
        System.out.println(name + " is gfChatting");
    }

}
