import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestWorkingWithArrays { //тут тесты для первого задания

    private WorkingWithArrays workingWithArrays;

    @Before
    public void createObject() {
        workingWithArrays = new WorkingWithArrays();
    }

    @Test
    public void oneFourFound() {
        Assert.assertArrayEquals(new int[]{5, 6}, workingWithArrays.arrayTransformation(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void manyFoursFound() {
        Assert.assertArrayEquals(new int[]{6}, workingWithArrays.arrayTransformation(new int[]{1, 4, 2, 3, 5, 4, 6}));
    }

    @Test (expected = RuntimeException.class) //ждет ошибку
    public void fourNotFound() {
        Assert.assertArrayEquals(new int[]{}, workingWithArrays.arrayTransformation(new int[]{1, 2, 3, 5, 6}));
    }

}
