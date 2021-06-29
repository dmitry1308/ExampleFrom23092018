package ru.schepin.examples.enums.planets;

public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    Earth(5.3, 3.1);

    private final double mass;
    private final double radius;
    private final static double G = 6.673E-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getGravity() {
        return G * mass / (radius * radius);
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public static double getG() {
        return G;
    }
}
