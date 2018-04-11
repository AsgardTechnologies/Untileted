package com.asgardtechnologies.submarine.map;

/**
 * Created by Thor on 2018-01-10.
 */
public class Coordinates {
    public int x;
    public int y;

    public Coordinates(int[] cords) {
        x = cords[0];
        y = cords[1];
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Coordinates coordinates) {
        return (this.x == coordinates.x && this.y == coordinates.y);
    }

    public String toString() {
        return "x:" + x + "\n" + " y:" + y;
    }
}
