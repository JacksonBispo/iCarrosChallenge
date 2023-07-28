import com.icarros.AngryMarvinBirds;
import com.icarros.CreepyHours;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CreepyHourTest {

    private CreepyHours creepyHour;

    @Before
    public void init(){
        creepyHour  = new CreepyHours();
    }
    @Test
    public void ShouldFourCreepHours(){
        String [] hourFixes = {"10:10", "11:00", "10:01", "10:10"};
        var count = creepyHour.countMoments(hourFixes);

        Assert.assertEquals(4, count);
    }

    @Test
    public void ShouldThreeCreepHours(){
        String [] hourFixes = {"10:10", "11:00", "10:43", "10:10"};
        var count = creepyHour.countMoments(hourFixes);

        Assert.assertEquals(3, count);
    }
}
