package com.asgardtechnologies.submarine.objects;

/**
 * Created by Thor on 2018-01-09.
 */
public class Player extends AbstractMapObject {

    private String name;

    public Player(String name){
        this.name=name;
        this.charModel = 'U';
    }

    public String getName() {
        return name;
    }
}
