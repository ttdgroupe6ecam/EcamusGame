import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;
import static org.mockito.Mockito.*;

public class AreneTest {

private Arene arene=new Arene();
private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
private final PrintStream originalOut = System.out;
@Before
public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
}
@Test(timeout=200)
    public void generateCharacter() throws Exception {

        AskString asker = mock(AskString.class);
        when(asker.askInt("1 -> informaticien 2 -> Electronicien, 9->quit")).thenReturn(1);
        when(asker.askInt("Tapez: 1 -> souris " + " 2 -> clé à molette")).thenReturn(2);
        when(asker.askInt("Joueur 1 : 1 -> attaquer , 2-> parer ")).thenReturn(1);
        when(asker.askInt("Joueur 2 : 1 -> attaquer , 2-> parer ")).thenReturn(1);
        when(asker.askInt("1: rejouer , sinon arreter le programme")).thenReturn(3);
        arene.buildFight(asker);
        assertTrue(outContent.toString().contains("Le Vainqueur est : Joueur");
    }
@After
public void restoreStreams() {
    System.setOut(originalOut);
}

}
