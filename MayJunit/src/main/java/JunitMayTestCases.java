import org.junit.*;

public class JunitMayTestCases {


        @Test
        public void firstTestCase(){
            System.out.println("First Test Case--> Hello Its Started");
            Assert.assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});//false..both array diifferent
        }
        @Test
        public void secondTestCase(){
            System.out.println("2nd Test Case --> Hello its 2nd ");
            Assert.assertEquals(2,2);

        }
        @Before
        public void beforeTestCase(){
            System.out.println("@Before --> It will execute before each test cases..");
        }
        @BeforeClass
        public static void beforeClassTestCase(){
            System.out.println("@BeforeClass --> It will execute before all Test cases..");
            System.out.println();
        }
        @After
        public void afterTestCase(){
            System.out.println("@After --> It will execute after each Test case..");
        }
        @AfterClass
        public static void afterClassTestCase(){
            System.out.println();
            System.out.println("@AfterClass --> It will execute after All Test case..");
        }
        @Test
        public void assertNotNullTest(){
            System.out.println("String is null or not..");
            String  nullString="ABC";
            String notNullString="ABC";
            Assert.assertNotNull(nullString);
        }


    }


