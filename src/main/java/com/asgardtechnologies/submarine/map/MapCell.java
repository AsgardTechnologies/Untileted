package com.asgardtechnologies.submarine.map;

/**
 * Created by Thor on 2018-01-09.
 */

import com.asgardtechnologies.submarine.objects.AbstractMapObject;
import com.asgardtechnologies.submarine.objects.ClearTerrain;

/**
 * A cell in the map represents one square with a value
 */
public class MapCell {

    private AbstractMapObject cellType;

    public MapCell() {
        cellType = new ClearTerrain();
    }

    public void setCellType(AbstractMapObject cellType) {
        this.cellType = cellType;
    }


    public String toString() {
        return Character.toString(cellType.toCharModel());
    }
}
