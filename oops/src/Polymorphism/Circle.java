package Polymorphism;

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle drawing...");
    }

    void personel() {
        System.out.println("Personal method of Circle...");
    }

}
