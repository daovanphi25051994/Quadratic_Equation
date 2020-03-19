package quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a = ");
        double a = scanner.nextDouble();
        System.out.println("Enter b = ");
        double b = scanner.nextDouble();
        System.out.println("Enter c = ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            double root1 = quadraticEquation.getRoot1();
            double root2 = quadraticEquation.getRoot2();
            System.out.printf("The quadratic has two roots : %.2f and %.2f", root1, root2);
        } else if (delta == 0) {
            double root1 = quadraticEquation.getRoot1();
            System.out.printf("The quadratic has one root : %.2f", root1);
        } else {
            System.out.println("The quadratic has no real roots !!");
        }
    }
}
