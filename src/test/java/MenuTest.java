
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;
import java.awt.GraphicsEnvironment;

import java.nio.file.Paths;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import static org.junit.Assert.*;

public class MenuTest {
  
   @Test
    public void TestGetPAth() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
      if (GraphicsEnvironment.isHeadless()) {
        Menu s = new Menu();
        String path = "./";
        s.setPath(path);
        assertEquals(path, s.getPath());
    }}
}
