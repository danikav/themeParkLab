package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
          visitor = new Visitor(14, 1.2, 40.0);
          visitor2 = new Visitor(50, 2.5, 4000.0);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canEnter(){
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void cantEnter(){
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
