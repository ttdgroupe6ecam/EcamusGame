


import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

import java.nio.file.Paths;

import static org.junit.Assert.*;

public class ScreenTest {
  
   @Test
    public void TestGetPAth(){
      if (GraphicsEnvironment.isHeadless()) {
        Screen s=new Screen();
        String path = "./";
        s.setPath(path);
        assertEquals(path, s.getPath());
    }}
}
