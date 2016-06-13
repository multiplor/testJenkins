package jenkinstest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyMathTest {
    
    public MyMathTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMyAdd() {
        System.out.println("myAdd");
        int x = 1;
        int y = 1;
        int expResult = 2;
        int result = MyMath.myAdd(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testMySub() {
        System.out.println("mySub");
        int x = 1;
        int y = 1;
        int expResult = 0;
        int result = MyMath.mySub(x, y);
        assertEquals(expResult, result);
    }
    
}
