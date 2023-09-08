package Test.Piezas;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Objetos.piezas.*;
public class PieceLTest {
    @Test
    public void Crear_PiezaL(){
       PieceL p=new PieceL();
       assertEquals( 1, p.getValorMatriz(1,0));
       assertEquals( 1, p.getValorMatriz(1,1));
       assertEquals( 1, p.getValorMatriz(1,2));
       assertEquals( 1, p.getValorMatriz(2,2)); 
    }
}
