
import javax.sound.sampled.LineUnavailableException;
import static org.junit.Assert.*;

import org.junit.Test;

public class ArenaTest {

/*
    FrameFixture window;

    @Before
    public void setUp() {
        Arena frame = GuiActionRunner.execute(() -> new Arena());
        window = new FrameFixture(String.valueOf(frame));
        window.show(); // shows the frame to t

    }
    @Test
    public void shouldCopyTextInLabelWhenClickingButton() {
        comm : window.textBox("textToCopy").enterText("Some random text");
        window.button("copyButton").click();
        window.label("copiedText").requireText("Some random text"); 
        assertThat(window).hasNoNullFieldsOrProperties();
        window.comboBox().requireSelection("");
    }
    @After
    public void tearDown() {
        window.cleanUp();
    }*/
    
    @Test
    public void TestArena() throws LineUnavailableException {
        Arena arena = new Arena();
        assertNotNull(arena);
    }
    
    /*
    
    @Test
    public void TestsetS() throws LineUnavailableException {
        Arena arena = new Arena();
        String params []= {"ghp"};
        arena.setS(params);
        assertArrayEquals(params,arena.getS());
    }*/
    

}
