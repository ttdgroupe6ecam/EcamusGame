import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;
import static org.mockito.Mockito.*;
import java.io.*;

public class AreneTest {

public Arene arene=new Arene();
@Test
@Ignore
    public void generateCharacter() throws Exception {
        
        AskString asker = mock(AskString.class);
        when(asker.ask("1 -> informaticien 2 -> Electronicien, 9->quit")).thenReturn("i","i");
        when(asker.ask("Tapez: 1 -> souris " + " 2 -> clé à molette")).thenReturn("c","s");
        when(asker.askInt("Joueur 1 : 1 -> attaquer , 2-> parer ")).thenReturn(1);
        when(asker.askInt("Joueur 2 : 1 -> attaquer , 2-> parer ")).thenReturn(1);
        when(asker.askInt("1: rejouer , sinon arreter le programme")).thenReturn(3);
        
        arene.buildFight(asker);
        assertTrue(asker.askPrint().contains("Le Vainqueur est : Joueur"));
    }


}
