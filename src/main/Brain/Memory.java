package main.Brain;

import main.Mapping.Direction;

/**
 * Created by Irindul on 05/01/2017.
 */
public interface Memory {

    void keepTrack(Direction d);
    Direction rollBack();
    public void setKeeptrack(boolean keeptrack);
}
