import org.junit.*;
import static org.junit.Assert.*;

public class CubeTest {

  @Test
  public void Volume_determinesTheVolumeOfTheCube_27000() {
    Rectangle testRectangle = new Rectangle(30, 30);
    Cube testCube = new Cube(testRectangle);
    assertEquals(27000, testCube.volume());
  }
}
