package challenge7;

import com.icarros.challenge7.MarsRover;
import com.icarros.challenge7.Plateau;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MarsRoverTest {



    private MarsRover marsRover1, marsRover2;
    @Before
    public void init(){
        marsRover1 = new MarsRover(1,2, "N");
        marsRover2 = new MarsRover(3,3, "E");
    }


    @Test
    public void shouldPosition(){
        String[] instructions1 = new String[]{"L","M","L","M","L","M","L","M","M"};
        String[] instructions2 = new String[]{"M","M","R","M","M","R","M","R","R","M"};

        int plateauX = 5;
        int plateauY = 5;

        Plateau plateau = new Plateau(plateauX, plateauY);

        plateau.addRover(marsRover1);
        plateau.addRover(marsRover2);
        marsRover1.processInstructions( marsRover1, instructions1);
        marsRover2.processInstructions(marsRover2, instructions2);

        Assert.assertEquals("1 3 N", marsRover1.getPosition());
        Assert.assertEquals("5 1 E", marsRover2.getPosition());
    }
}
