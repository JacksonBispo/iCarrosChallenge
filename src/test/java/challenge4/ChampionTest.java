package challenge4;

import com.icarros.challenge4.Champion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ChampionTest {

    private Champion champion;

    @Before
    public void init() {
        champion = new Champion();
    }

    @Test
    public void showScoreTest() {

        int[] wins = {1, 0, 3};
        int[] ties = {2, 2, 0};
        var result = champion.returnScorePoint(wins, ties);

        Assert.assertEquals(result[0], 9);
        Assert.assertEquals(result[1], 2);
    }
}
