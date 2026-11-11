public class Person {

    private String name;
    private int age;
    private int yoe;
    private String gf;
    private int id;

    public Person(int age, int id, String name, int yoe, String gf) {
        System.out.println("Person Constructor!");

        this.id = id;
        this.age = age;
        this.name = name;
        this.yoe = yoe;
        this.gf = gf;
    }

    public Person(Person obj) {
        System.out.println("Copy!!");
        this.name = obj.name;
        this.id = obj.id;
        this.yoe = obj.yoe;
        this.age = obj.age;
        this.gf = obj.gf;
    }

    public void talk() {
        System.out.println(name + " is Talking to " + gf);
    }

    private void no() {
        System.out.println(name + " have id " + id);
    }

    public void getPriv() {
        no();
    }

    public void setPriv(String gf) {
        this.gf = gf;
    }


}
