
import javax.sound.sampled.LineUnavailableException;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;
import java.awt.GraphicsEnvironment;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
public class ArenaTest {


    FrameFixture window;

    @Before
    public void setUp() {
        if (!GraphicsEnvironment.isHeadless()) {
        Arena frame = GuiActionRunner.execute(() -> new Arena());
        window = new FrameFixture(String.valueOf(frame));
        window.show(); // shows the frame to t

    }}
    @Test
    public void shouldCopyTextInLabelWhenClickingButton() {
        if (!GraphicsEnvironment.isHeadless()) {
        comm : window.textBox("textToCopy").enterText("Some random text");
        window.button("copyButton").click();
        window.label("copiedText").requireText("Some random text");
        assertNotNull(window);
        window.comboBox().requireSelection("");
    }}
    @After
    public void tearDown() {
        if (!GraphicsEnvironment.isHeadless()) {
        window.cleanUp();
    }}

    

    /*

    @Test
    public void TestsetS() throws LineUnavailableException {
        Arena arena = new Arena();
        String params []= {"ghp"};
        arena.setS(params);
        assertArrayEquals(params,arena.getS());
    }*/


}
