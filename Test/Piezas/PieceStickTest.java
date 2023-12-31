package Test.Piezas;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Objetos.piezas.*;
public class PieceStickTest {
    @Test
    public void Crear_PiezaStick_pos0(){
        PieceStick p=new PieceStick();
        p.setLado(0);
        p.lados();
        assertEquals( 1, p.getValorMatriz(1,0));
        assertEquals( 1, p.getValorMatriz(1,1));
        assertEquals( 1, p.getValorMatriz(1,2));
        assertEquals( 1, p.getValorMatriz(1,3)); 
      
    }
    @Test
    public void Crear_PiezaStick_pos1(){
        PieceStick p=new PieceStick();
        p.setLado(1);
        p.lados();
        assertEquals( 1, p.getValorMatriz(0,1));
        assertEquals( 1, p.getValorMatriz(1,1));
        assertEquals( 1, p.getValorMatriz(2,1));
        assertEquals( 1, p.getValorMatriz(3,1)); 
      
    }
    @Test
    public void insertar_FichaEnPosicion(){
        PieceStick p=new PieceStick();
        p.setLado(1);
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
        assertEquals( 1, p.getValorMatriz(0,1));
        assertEquals( 1, p.getValorMatriz(1,1));
        assertEquals( 1, p.getValorMatriz(2,1));
        assertEquals( 1, p.getValorMatriz(3,1));
    }
    @Test
    public void funcion_CompletarParedIzquierda(){
        PieceStick p=new PieceStick();
        p.setLado(1);
        p.lados();
        p.completarParedIzquierda();
        assertEquals( 2, p.getValorMatriz(0,0));
        assertEquals( 2, p.getValorMatriz(1,0));
        assertEquals( 2, p.getValorMatriz(2,0));
        assertEquals( 2, p.getValorMatriz(3,0));
    }
    @Test
    public void funcion_completarParedDerecha(){
        PieceStick p=new PieceStick();
        p.setLado(1);
        p.lados();
        p.completarParedDerecha();
        assertEquals( 2, p.getValorMatriz(0,2));
        assertEquals( 2, p.getValorMatriz(1,2));
        assertEquals( 2, p.getValorMatriz(2,2));
        assertEquals( 2, p.getValorMatriz(3,2));
    }
    @Test
    public void funcion_rotarIzquierda(){
        PieceStick p=new PieceStick();
        p.setLado(0);
        p.rotateLeft();
        assertEquals( 1, p.getValorMatriz(0,1));
        assertEquals( 1, p.getValorMatriz(1,1));
        assertEquals( 1, p.getValorMatriz(2,1));
        assertEquals( 1, p.getValorMatriz(3,1));
    }
    @Test
    public void entrar_piezaDerecha(){
        PieceStick p= new PieceStick();
        Board b=new Board();
        b.piezaActiva=p;
        b.insertarPieza();
        b.piezaActiva.completarParedDerecha();
        b.actualizarBoard0();
        b.piezaActiva.establecerPosicion(0, 0);
        b.actualizarBoard1();
        b.piezaActiva.establecerPosicion(9,0);  
        //rARRIIIII por q le saque
    }

        @Test
    public void entrar_piezaIzquierda(){
        PieceStick p= new PieceStick();
        Board b=new Board();
        b.piezaActiva=p;
        b.insertarPieza();
        b.piezaActiva.setLado(0);
        b.piezaActiva.completarParedIzquierda();
        b.actualizarBoard0();
        b.piezaActiva.establecerPosicion(0, 0);
        b.actualizarBoard1();
        /*  assertEquals(1,b.getValor(1,0));
        assertEquals(1,b.getValor(1,1));
        assertEquals(1,b.getValor(1,2));
        assertEquals(1,b.getValor(1,3));   */
    

    }



}
