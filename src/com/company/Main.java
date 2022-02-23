package com.company;

public class Main {
    public static void main(String[] args) {
        Point3D earth = new Point3D(20.3, 100.3, 109);
        Point3D sun = new Point3D(0,0,0);

        Calculate result = new Calculate();
        System.out.println(result.calculateDistance(earth,sun));
    }
}
