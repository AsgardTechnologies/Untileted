package pm.asgard.submarine.objects;

/**
 * Created by Thor on 2018-01-09.
 */
public class Player extends AbstractMapObject {

    private String name;
    public Player(String name){
        this.name=name;
        this.value = 'U';
    }
}
