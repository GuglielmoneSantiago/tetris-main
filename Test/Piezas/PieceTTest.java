package Test.Piezas;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Objetos.piezas.*;
public class PieceTTest {
    @Test
    public void Crear_PiezaT(){
       PieceT p=new PieceT();
       assertEquals( 1, p.getValorMatriz(1,0));
       assertEquals( 1, p.getValorMatriz(1,1));
       assertEquals( 1, p.getValorMatriz(1,2));
       assertEquals( 1, p.getValorMatriz(0,1)); 
    }
}
