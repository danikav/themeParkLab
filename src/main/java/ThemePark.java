import attractions.Attraction;
import behaviours.IReviewed;
import com.sun.tools.javac.util.ArrayUtils;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> activities = new ArrayList<>();
        activities.addAll(this.attractions);
        activities.addAll(this.stalls);
        return activities;
    }

    public ArrayList<Attraction> getAttractions(){
        return this.attractions;
    }

    public ArrayList<Stall> getStalls(){
        return this.stalls;
    }
}
