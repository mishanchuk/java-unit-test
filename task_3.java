import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {
    
    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
            {17, false},  // несовершеннолетний
            {18, true},   // совершеннолетний
            {19, true},   // совершеннолетний
            {20, true},   // совершеннолетний
            {21, true},   // совершеннолетний
            {22, true}    // совершеннолетний
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Ошибка при проверке совершеннолетия для возраста " + age, result, isAdult);
    }
}
