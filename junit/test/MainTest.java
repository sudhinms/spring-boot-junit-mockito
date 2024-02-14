import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class MainTest {

    private Main main=new Main();

    @BeforeEach
    public void before(){
        System.out.println("BeforeEach");
    }
    @AfterEach
    public void After(){
        System.out.println("AfterEach");
    }

    @BeforeAll
    public void beforeAll(){
        System.out.println("BeforeAll");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("AfterAll");
    }

    @Test
    void test(){
        assertEquals(100
                ,main.arraySum(new int[]{10,20,30,40}),"Not a valid output");
    }
    @Test
    void test1(){
        assertEquals(10,20/2);
    }

}
