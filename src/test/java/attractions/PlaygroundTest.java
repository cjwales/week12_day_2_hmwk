package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor = new Visitor(15,170, 10);
        visitor2 = new Visitor(12, 120, 2);
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
    public void doesNotAllow15OrOver() {
        assertEquals(false, playground.isAllowedTo(visitor));
    }

    @Test
    public void allowsUnder15() {
        assertEquals(true, playground.isAllowedTo(visitor2));
    }
}
