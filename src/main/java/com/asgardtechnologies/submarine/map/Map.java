package com.asgardtechnologies.submarine.map;

import com.asgardtechnologies.submarine.objects.AbstractMapObject;

import java.util.ArrayList;

/**
 * Created by Thor on 2018-01-09.
 */
public class Map {
    private MapCell[][] map;
    private int size;
    private ArrayList<Coordinates> occupiedSpaces = new ArrayList<>();

    public Map(MapCell[][] map) {
        this.map = map;
        System.out.print("Generating map.\n");
        size = map.length;

        System.out.print("Generating terrain.\n");
        initEmptyMap();
    }

    private void initEmptyMap() {
        for (int row = 0; row < map.length; row++) {

            for (int col = 0; col < map[row].length; col++) {
                // assign a ClearTerrain MapObject to each cell in the Map
                map[row][col] = new MapCell();
            }
        }
    }

    /**
     * Attempts to place an object in the given area.
     *
     * @param object
     * @param cords
     * @return 1 on success, 0 on fail
     */
    public int placeObject(AbstractMapObject object, Coordinates cords){
        if (!isSpaceOccupied(cords)) {
            map[cords.x][cords.y].setCellType(object);
            occupiedSpaces.addAll(calculateOccupiedSpaces(object, cords));
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Checks in the square can be occupied by an object.
     * @param cords
     * @return
     */
    private boolean isSpaceOccupied(Coordinates cords){
        for(Coordinates occupiedCoordinates: occupiedSpaces){
            if(occupiedCoordinates.equals(cords)) return true;
        }
        return false;
    }

    private ArrayList<Coordinates> calculateOccupiedSpaces(AbstractMapObject object, Coordinates cords) {
        int occupancyRadius = object.getOccupiedSpace()/2;
        ArrayList<Coordinates> occupiedSpacesArray = new ArrayList<>();
        for(int row= 0-occupancyRadius; row<=occupancyRadius; row++){
            for (int col = 0-occupancyRadius; col<=occupancyRadius; col++){
                occupiedSpacesArray.add(new Coordinates(cords.x+row, cords.y+col));
            }
        }
        System.out.println(object.getClass().toString()+"  " + Integer.toString(cords.x)+"  " + Integer.toString(cords.y));

        for(Coordinates ocSpace : occupiedSpacesArray){
            System.out.println(object.getClass().toString()+"  " + ocSpace.toString());
        }
        return occupiedSpacesArray;
    }

    public MapCell[][] getMap() {
        return map;
    }

    public void displayMap(){
        for (int i = map.length-1; i >=0; i--){
        MapCell[] row = map[i];
            //for each number in the row

            for (MapCell object : row) {
                System.out.print(object + " ");
            }
            System.out.print("\n");
        }
    }
}
