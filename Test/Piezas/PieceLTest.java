package Test.Piezas;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Objetos.piezas.*;
public class PieceLTest {
    @Test
    public void Crear_PiezaL(){
        PieceL p=new PieceL();
        assertEquals( 1, p.getValorMatriz(0,1));
        assertEquals( 1, p.getValorMatriz(1,1));
        assertEquals( 1, p.getValorMatriz(2,1));
        assertEquals( 1, p.getValorMatriz(2,2)); 
     }
     @Test
     public void insertar_FichaEnPosicion(){
         PieceL p = new PieceL();
         p.setLado(0);
         p.lados();
         p.resetPosicion();
         p.establecerPosicion(0, 0);
         assertEquals( 1, p.getValorPosicion(1,1));
         assertEquals( 1, p.getValorPosicion(1,1));
         assertEquals( 1, p.getValorPosicion(2,1));
         assertEquals( 1, p.getValorPosicion(2,2)); 
     }
 
     @Test
     public void funcion_completarParedDerecha(){
         PieceL p=new PieceL();
         p.setLado(0);
         p.completarParedDerecha();
         assertEquals( 2, p.getValorMatriz(0,3));
         assertEquals( 2, p.getValorMatriz(1,3));
         assertEquals( 2, p.getValorMatriz(2,3));
         assertEquals( 2, p.getValorMatriz(3,3));
     }
 
     @Test
     public void funcion_rotarDerecha(){  //funcion rotar derececha case 1
         PieceL p=new PieceL();
         p.setLado(0);
         p.rotateRight();
         assertEquals( 1, p.getValorMatriz(1,0));
         assertEquals( 1, p.getValorMatriz(1,1));
         assertEquals( 1, p.getValorMatriz(1,2));
         assertEquals( 1, p.getValorMatriz(0,2));   
    }
   @Test
     public void funcion_rotarIzquierda(){   //funcion rotar izquierda case 3
         PieceL p=new PieceL();
         p.setLado(0);
         p.rotateLeft();
         assertEquals( 1, p.getValorMatriz(1,0));
         assertEquals( 1, p.getValorMatriz(2,0));
         assertEquals( 1, p.getValorMatriz(1,1));
         assertEquals( 1, p.getValorMatriz(1,2));   
    }


 }
