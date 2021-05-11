package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(14, 1.2, 4);
        visitor2 = new Visitor(50, 2.5, 4000.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void cantRide(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }
    @Test
    public void canRide(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }
    @Test
    public void tallPersonPaysMore(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.01);
    }

    @Test
    public void shortPersonPaysNormal(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.01);
    }
}
