package pm.asgard.submarine.objects;

import java.security.InvalidParameterException;

/**
 * Created by Thor on 2018-01-09.
 */
public abstract class AbstractMapObject {

    //The visible character that represents this object
    protected char value;

    private int occupiedSpace = 3;


    /**
     *                      ~ ~ ~ ~ ~
     *                      ~ ~ ~ ~ ~
     *          ~ ~ ~       ~ ~ O ~ ~
     *          ~ O ~       ~ ~ ~ ~ ~
     *  O       ~ ~ ~       ~ ~ ~ ~ ~
     *  1         3             5
     *  The space around this object which other objects may not be placed in must be an odd number.
     *  3 is default.
     */
    public void setOccupiedSpace(int occupiedSpace) {
        if(occupiedSpace%2 == 1) this.occupiedSpace = occupiedSpace;
        else throw new InvalidParameterException();
    }

    public int getOccupiedSpace() {
        return occupiedSpace;
    }

    public char toChar(){
        return value;
    }


}
