package com.asgardtechnologies.submarine;

import com.asgardtechnologies.submarine.map.MapFactory;
import com.asgardtechnologies.submarine.map.Map;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        MapFactory mapFactory = new MapFactory();
        Map m = mapFactory.getMap();
        m.displayMap();
    }
}
