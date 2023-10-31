import org.junit.Test;

import static org.example.Main.searchSumOfMinValues;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void MainTest(){
        int[][] array = {{3,5,1}, {2,4,6}, {7,8,9}};
        assertEquals(3, searchSumOfMinValues(array));
    }
}
