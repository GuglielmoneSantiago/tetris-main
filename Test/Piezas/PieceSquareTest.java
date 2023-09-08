package Test.Piezas;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Objetos.piezas.*;
public class PieceSquareTest {
    @Test
    public void Crear_PiezaSquare(){
       PieceSquare p=new PieceSquare();
       assertEquals( 1, p.getValorMatriz(0,0));
       assertEquals( 1, p.getValorMatriz(0,1));
       assertEquals( 1, p.getValorMatriz(1,1));
       assertEquals( 1, p.getValorMatriz(1,0)); 
    }
}