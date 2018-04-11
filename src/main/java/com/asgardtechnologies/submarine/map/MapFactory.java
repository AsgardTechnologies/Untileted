package com.asgardtechnologies.submarine.map;

import com.asgardtechnologies.submarine.objects.Goal;
import com.asgardtechnologies.submarine.objects.Player;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Thor on 2018-01-09.
 */
public class MapFactory {

    int size = 3;
    ArrayList<Integer[]> objectCords = new ArrayList<>();

    public MapFactory() {
    }

    public MapFactory(int size) {
        this.size = size;
    }

    private Map generateEmptyMap() {
        Map map = new Map(new MapCell[size][size]);
        return map;
    }


    private void placePlayer(Map map) {
        Random rand = new Random();
        Coordinates playerCords = new Coordinates(rand.nextInt(size), rand.nextInt(size));
        Player player = new Player("one");
        map.placeObject(player, playerCords);
        //return map;
    }

    private void placeGoal(Map map) {
        Random rand = new Random();
        Coordinates goalCords = new Coordinates(rand.nextInt(size), rand.nextInt(size));
        map.placeObject(new Goal(), goalCords);
        //return map;
    }


    public Map getMap() {
        Map map = generateEmptyMap();
        placePlayer(map);
        placeGoal(map);
        return map;
    }

}
