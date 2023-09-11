package Test.Piezas;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import Objetos.piezas.*;
public class BoardTest {
    @Test
    public void creacion_board_Test(){
        Board b=new Board();
        for(int y=0;y<20;y++){
            for(int x=0;x<10;x++){
                assertEquals(0,b.getValor(y,x));                
            }
        }
    }
    @Test
    public void funcion_generarFichaAleatoria_notNullTest(){
        Board b=new Board();
        b.generarFichaAleatoria();
        assertNotNull(b.piezaActiva);
    }
    @Test
    public void funcion_InsertarFicha_notNullTest(){
        Board b=new Board();
        Board p=new Board();
        b.generarFichaAleatoria();
        b.insertarPieza();
        assertNotEquals(b.matriz,p.matriz);
    }
    @Test
    public void funcion_bajarFicha(){
        Board board=new Board();
        PieceStick piece=new PieceStick();
        piece.setLado(1);
        board.piezaActiva=piece;
        piece.establecerPosicion(0, 0);
        for(int i=0;i<20;i++){
            board.bajarFicha();
        }
        assertEquals( 1, piece.getValorPosicion(16,1));
        assertEquals( 1, piece.getValorPosicion(17,1));
        assertEquals( 1, piece.getValorPosicion(18,1));
        assertEquals( 1, piece.getValorPosicion(19,1)); 
    }
}
