package Test.Piezas;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import Objetos.piezas.*;
public class PieceLTest {
    @Test
    public void Crear_PiezaL(){
       PieceL p=new PieceL();
       assertEquals( 1, p.getValor(1,0));
       assertEquals( 1, p.getValor(1,1));
       assertEquals( 1, p.getValor(1,2));
       assertEquals( 1, p.getValor(2,2)); 
    }
}
