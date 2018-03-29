package se.asgardtechnologies.submarine.main;

import se.asgardtechnologies.submarine.map.Map;
import se.asgardtechnologies.submarine.map.MapFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MapFactory mapFactory = new MapFactory();
        Map m = mapFactory.getMap();
        m.displayMap();
    }
}
