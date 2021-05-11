import attractions.Attraction;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.Stall;

import java.util.ArrayList;

public class ThemeParkTest {

    ThemePark themePark;
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    Attraction attraction;
    Attraction attraction2;
    Stall stall;
    Stall stall2;

    @Before
    public void setUp(){
        themePark = new ThemePark(attractions, stalls);
        attraction = new RollerCoaster("Smiley", 5);
        attraction2 = new Playground("LavalLand", 10);
        stall = new CandyflossStall("CandyShop", "50cent", ParkingSpot.A2);
        stall2 = new IceCreamStall("Italian", "Giuseppe", ParkingSpot.B2);
        themePark.getAttractions().add(attraction);
        themePark.getAttractions().add(attraction2);
        themePark.getStalls().add(stall);
        themePark.getStalls().add(stall2);
    }

    public void canGetAllReviewed(){
        themePark.getAllReviewed();
    }
}
