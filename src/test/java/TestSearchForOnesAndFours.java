import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestSearchForOnesAndFours { //тут тест для второго задания

    private boolean result;
    private int[] arr;
    private WorkingWithArrays workingWithArrays;

    @Before
    public void createObject() {
        workingWithArrays = new WorkingWithArrays();
    }

    public TestSearchForOnesAndFours(int[] arr, boolean result) {
        this.arr = arr;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 3, 4}, false},
                {new int[]{1, 1, 1, 1, 1}, false},
                {new int[]{4, 4, 4}, false},
                {new int[]{1, 4, 4, 1}, true}
        });
    }

    @Test
    public void testSearchForOnesAndFours() {
        Assert.assertEquals(workingWithArrays.searchForOnesAndFours(arr), result);
    }
}
