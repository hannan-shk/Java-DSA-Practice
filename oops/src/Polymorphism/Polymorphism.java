package Polymorphism;

public class Polymorphism {

    static void main() {

        Calculator c = new Calculator();

        System.out.println(c.add(23, 56, 8, 3.878));
        System.out.println(c.add(23, 55, 77));
        System.out.println(c.add(55, 936));

        Circle c1 = new Circle();
        c1.draw();

        doDrawingStuff(c1);
//        doDrawingStuff(new Shape());

//        Down casting

//        Rect r = new Rect();
//        doDrawingStuff(r);


    }

//    Dynamic Method Dispatching/Upcasting;

    public static void doDrawingStuff(Shape s) {
        s.draw();
        Circle c = (Circle) s;
        c.draw();
    }


}
