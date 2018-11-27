/*

import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class ScreenTest {
     FrameFixture window;

    @Before
    public void setUp() {
        Screen frame = GuiActionRunner.execute(() -> new Screen());
        window = new FrameFixture(String.valueOf(frame));
        window.show(); // shows the frame to t

    }
    @Test
    public void shouldCopyTextInLabelWhenClickingButton() {
        comm : window.textBox("textToCopy").enterText("Some random text");
        window.button("copyButton").click();
        window.label("copiedText").requireText("Some random text"); comm
        assertThat(window).hasNoNullFieldsOrProperties();
        window.showPopupMenu();
    }
    @After
    public void tearDown() {
        window.cleanUp();
    }


}*/
