package Test.Piezas;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Objetos.piezas.*;

public class PieceDogTest {
    @Test
    public void Crear_PiezaDog(){
       PieceDog p=new PieceDog();
       assertEquals( 1, p.getValorMatriz(1,0));
       assertEquals( 1, p.getValorMatriz(1,1));
       assertEquals( 1, p.getValorMatriz(2,1));
       assertEquals( 1, p.getValorMatriz(2,2)); 
    }
    @Test
    public void insertar_FichaEnPosicion(){
        PieceDog p=new PieceDog();
        p.resetPosicion();
        p.establecerPosicion(0, 0);
        assertEquals( 1, p.getValorPosicion(1,0));
        assertEquals( 1, p.getValorPosicion(1,1));
        assertEquals( 1, p.getValorPosicion(2,1));
        assertEquals( 1, p.getValorPosicion(2,2)); 
    }
}
