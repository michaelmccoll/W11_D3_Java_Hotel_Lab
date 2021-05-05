import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void setUp(){
        guest1 = new Guest("Michael");
    }

    @Test
    public void canGetName(){
        assertEquals("Michael",guest1.getName());
    }
}
