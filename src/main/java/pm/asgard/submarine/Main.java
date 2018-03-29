package pm.asgard.submarine;

import pm.asgard.submarine.map.MapFactory;
import pm.asgard.submarine.map.Map;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        MapFactory mapFactory = new MapFactory();
        Map m = mapFactory.getMap();
        m.displayMap();
    }
}
