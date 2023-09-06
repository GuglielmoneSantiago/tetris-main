package Test.Piezas;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import piezas.*;

public class PieceDogTest {
    @Test
    public void Crear_PiezaDog(){
       PieceDog p=new PieceDog();
       assertEquals( 1, p.getValor(1,0));
       assertEquals( 1, p.getValor(1,1));
       assertEquals( 1, p.getValor(2,1));
       assertEquals( 1, p.getValor(2,2)); 
    }
}
