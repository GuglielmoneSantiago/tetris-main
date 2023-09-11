package Test.Piezas;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Objetos.piezas.*;
public class PieceLTest {
    @Test
    public void Crear_PiezaL(){
        PieceL p=new PieceL();
        p.setLado(0);
        p.lados();
        assertEquals( 1, p.getValorMatriz(1,0));
        assertEquals( 1, p.getValorMatriz(1,1));
        assertEquals( 1, p.getValorMatriz(1,2));
        assertEquals( 1, p.getValorMatriz(2,2)); 
    }
    @Test
    public void insertar_FichaEnPosicion(){
        PieceL p=new PieceL();
        p.setLado(0);
        p.lados();
        p.establecerPosicion(0, 0);
        assertEquals( 1, p.getValorPosicion(1,0));
        assertEquals( 1, p.getValorPosicion(1,1));
        assertEquals( 1, p.getValorPosicion(1,2));
        assertEquals( 1, p.getValorPosicion(2,2));
    }
}
