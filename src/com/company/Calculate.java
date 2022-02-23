package com.company;

public class Calculate {

    public double calculateDistance(Point3D sun, Point3D earth )
    {
        return Math.sqrt(
                Math.pow(sun.pozX - earth.pozX, 2) + Math.pow(sun.pozY - earth.pozY, 2) + Math.pow(sun.pozZ - earth.pozZ, 2)
        );
    }
}
