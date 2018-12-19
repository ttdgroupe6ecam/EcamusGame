


import org.junit.Test;

import java.nio.file.Paths;

import static org.junit.Assert.*;

public class ScreenTest {
  

    @Test
    public void TestGetPAth(){
        Screen s=new Screen();
        String path = "./";
        s.setPath(path);
        assertEquals(path, s.getPath());
    }
}
