package Polymorphism;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(int a, int b, int c, double d) {
        double sum = a + b + c + d;
        return sum;
    }

}
