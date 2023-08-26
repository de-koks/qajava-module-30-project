import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class PersonTest {
    @Test(dataProvider = "isTeenagerProvider")
    public void testIsTeenagerAge(int age, boolean expected){
        boolean result = Person.isTeenager(age);
        assertEquals(result, expected);
    }

    @DataProvider(name = "isTeenagerProvider")
    Object[][] dataProvider(){
        return new Object[][]{
                {10, false},
                {12, false},
                {13, true},
                {16, true},
                {19, true},
                {20, false},
                {25, false}
        };
    }
}

