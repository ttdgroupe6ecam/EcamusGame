import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;
import static org.mockito.Mockito.*;
import java.io.*;

public class AreneTest {

public Arene arene=new Arene();
@RunWith(MockitoJUnitRunner.class)
@Test
    public void generateCharacter() throws Exception {
        
        AskString asker = mock(AskString.class);
        when(asker.askInt("1 -> informaticien 2 -> Electronicien, 9->quit")).thenReturn(1,1);
        when(asker.askInt("Tapez: 1 -> souris " + " 2 -> clé à molette")).thenReturn(2,1);
        when(asker.askInt("Joueur 1 : 1 -> attaquer , 2-> parer ")).thenReturn(1);
        when(asker.askInt("Joueur 2 : 1 -> attaquer , 2-> parer ")).thenReturn(1);
        when(asker.askInt("1: rejouer , sinon arreter le programme")).thenReturn(3);
        
        arene.buildFight(asker);
        assertTrue(asker.askPrint().contains("Le Vainqueur est : Joueur"));
    }


}
