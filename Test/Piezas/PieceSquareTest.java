package Test.Piezas;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import Objetos.piezas.*;
public class PieceSquareTest {
    @Test
    public void Crear_PiezaSquare(){
       PieceSquare p=new PieceSquare();
       assertEquals( 1, p.getValor(0,0));
       assertEquals( 1, p.getValor(0,1));
       assertEquals( 1, p.getValor(1,1));
       assertEquals( 1, p.getValor(1,0)); 
    }
}