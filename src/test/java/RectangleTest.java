import org.junit.*;
import static org.junit.Assert.*;

public class RectangleTest {

  @Test
  public void newRectangle_instanciatesCorrectly() {
    Rectangle testRectangle = new Rectangle(2, 2);
    assertEquals(true, testRectangle instanceof Rectangle);
  }

  @Test
  public void isSquare_whenNotASquare_false(){
    Rectangle testRectangle = new Rectangle(2, 4);
    assertEquals(false, testRectangle.isSquare());
  }

  @Test
  public void isSquare_whenIsASquare_true(){
    Rectangle testRectangle = new Rectangle(4, 4);
    assertEquals(true, testRectangle.isSquare());
  }
}