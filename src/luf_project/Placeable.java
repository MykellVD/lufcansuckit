package luf_project;

import java.util.ArrayList;

public abstract class Placeable {
    public Object placeable;
    ArrayList<Object> placeables = new ArrayList();
    public Placeable() {
        this.placeable = getClass();
        placeables.add(this.placeable);
        System.out.println(placeables);
    }

    public ArrayList<Object> getPlaceables() {

        return placeables;
    }
}
