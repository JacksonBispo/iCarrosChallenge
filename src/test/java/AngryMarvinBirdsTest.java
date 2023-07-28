import com.icarros.AngryMarvinBirds;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

@RunWith(JUnit4.class)
public class AngryMarvinBirdsTest {

    private AngryMarvinBirds angryMarvinBirds;

    @Before
    public void init(){
         angryMarvinBirds  = new AngryMarvinBirds();
    }


    @Test
    public void shouldShowTreeStars(){
       var showStars =   angryMarvinBirds.showStars(3);

        String[] result = {"*","*","*"};
        Assert.assertEquals(Arrays.stream(result).toList(), Arrays.stream(showStars).toList());
    }

    @Test
    public void shouldShowTwoStars(){
        var showStars = angryMarvinBirds.showStars(2);

        String[] result = {"*","*","_"};
        Assert.assertEquals(Arrays.stream(result).toList(), Arrays.stream(showStars).toList());
    }

    @Test
    public void shouldShowOneStars(){
        var showStars = angryMarvinBirds.showStars(1);

        String[] result = {"*","_","_"};
        Assert.assertEquals(Arrays.stream(result).toList(), Arrays.stream(showStars).toList());
    }

}
