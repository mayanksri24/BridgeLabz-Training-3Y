
package com.bridgelabz.oops.levelone;

public class CircleInfo {
    double r;

    CircleInfo(double r) {
        this.r = r;
    }

    double computeArea() {
        return Math.PI * r * r;
    }

    double computeCircumference() {
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {
        CircleInfo c = new CircleInfo(3.2);
        System.out.printf("Area = %.2f\n", c.computeArea());
        System.out.printf("Circumference = %.2f\n", c.computeCircumference());
    }
}
