import junit.framework.TestCase;
import org.junit.Test;

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:dbhs-spring.xml"})*/
public class BaseTest extends TestCase {

    @Test
    public void test() {
        assertEquals(true, true);
    }

}
