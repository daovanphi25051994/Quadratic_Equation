package quadratic_equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(this.getDiscriminant())) / 2 * this.a;
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant())) / 2 * this.a;
    }
}
