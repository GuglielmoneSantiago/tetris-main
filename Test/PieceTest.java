package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Objetos.piezas.*;

public class PieceTest {
   @Test
   public void verificar_Reset(){
      PieceT p=new PieceT();
      p.reset();
      assertEquals( 0, p.getValorMatriz(0,0));
   }
}