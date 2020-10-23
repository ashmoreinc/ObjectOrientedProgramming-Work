import org.junit.Test;
import static org.junit.Assert.*;

public class QueryStringTest {
    QueryString query = new QueryString("");

    @Test
    public void testGetParameter() {
        query = new QueryString("name=Alice&age=19&country=UK");

        // Test getting 3 existing and 1 non-existant parameters
        assertEquals("Al ice", query.getParameter("name"));
        assertEquals("19", query.getParameter("age"));
        assertEquals("UK", query.getParameter("country"));
        assertNull(query.getParameter("city"));
    }

    @Test
    public void testHasParameter() {
        query = new QueryString("name=Alice&age=19&country=UK");

        // Test whether it has all 3 existing params and 1 non-existent param
        assertTrue(query.hasParameter("name"));
        assertTrue(query.hasParameter("age"));
        assertTrue(query.hasParameter("country"));
        assertFalse(query.hasParameter("city"));
    }

    @Test
    public void testGetParameterOffset(){
        query = new QueryString("name=Alice&age=19&country=UK");

        // Test 3 existing, 1 non-existent params
        assertEquals(0, query.getParameterOffset("name"));
        assertEquals(11, query.getParameterOffset("age"));
        assertEquals(18, query.getParameterOffset("country"));
        assertEquals(-1, query.getParameterOffset("city"));
    }

    @Test
    public void testDecode(){
        assertEquals("Hello World!", QueryString.decode("message=Hello%2C+world%21"));
    }
}
