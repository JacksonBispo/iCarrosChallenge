package challenge2;

import com.icarros.challenge2.AngryMarvinBirds;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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

        var result = "* * *";
        Assert.assertEquals((result), showStars);
    }

    @Test
    public void shouldShowTwoStars(){
        var showStars = angryMarvinBirds.showStars(2);

        var result = "* * _";
        Assert.assertEquals((result), showStars);
    }

    @Test
    public void shouldShowOneStars(){
        var showStars = angryMarvinBirds.showStars(1);

        var result = "* _ _";
        Assert.assertEquals(result, showStars);
    }

}
