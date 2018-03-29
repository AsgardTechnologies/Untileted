package se.asgardtechnologies.submarine.map;

/**
 * Created by Thor on 2018-01-09.
 */

import se.asgardtechnologies.submarine.objects.AbstractMapObject;
import se.asgardtechnologies.submarine.objects.ClearTerrain;

/**
 * A cell in the map represents one square with a value
 */
public class MapCell {
    AbstractMapObject cellType;

    public MapCell(){
        cellType = new ClearTerrain();
    }

    public void setCellType(AbstractMapObject cellType){
        this.cellType = cellType;
    }


    public String toString(){
        return Character.toString(cellType.toChar());
    }
}
