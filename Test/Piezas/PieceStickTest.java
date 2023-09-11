package Test.Piezas;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Objetos.piezas.*;
public class PieceStickTest {
    @Test
    public void Crear_PiezaStick(){
       PieceStick p=new PieceStick();
       assertEquals( 1, p.getValorMatriz(0,1));
       assertEquals( 1, p.getValorMatriz(1,1));
       assertEquals( 1, p.getValorMatriz(2,1));
       assertEquals( 1, p.getValorMatriz(3,1)); 
    }
    @Test
    public void insertar_FichaEnPosicion(){
        PieceStick p=new PieceStick();
        p.setLado(0);
        p.lados();
        p.resetPosicion();
        p.establecerPosicion(0, 0);
        assertEquals( 1, p.getValorPosicion(0,1));
        assertEquals( 1, p.getValorPosicion(1,1));
        assertEquals( 1, p.getValorPosicion(2,1));
        assertEquals( 1, p.getValorPosicion(3,1)); 
    }
    @Test
    public void funcion_rotarDerecha(){
        PieceStick p=new PieceStick();
        p.setLado(0);
        p.rotateRight();
        assertEquals( 1, p.getValorMatriz(1,0));
        assertEquals( 1, p.getValorMatriz(1,1));
        assertEquals( 1, p.getValorMatriz(1,2));
        assertEquals( 1, p.getValorMatriz(1,3));
    }
 @Test
    public void funcion_rotarIzquierda(){
        PieceStick p=new PieceStick();
        p.setLado(0);
        p.rotateLeft();
        assertEquals( 1, p.getValorMatriz(1,0));
        assertEquals( 1, p.getValorMatriz(1,1));
        assertEquals( 1, p.getValorMatriz(1,2));
        assertEquals( 1, p.getValorMatriz(1,3));
    }






}
