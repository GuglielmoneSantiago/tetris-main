package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import piezas.*;
import Tetris;

public class PieceTest {
   
   @Test
   public void Crear_PiezaL(){
      PieceL p=new PieceL();
      assertEquals( 1, p.getValor(0,0));
      assertEquals( 1, p.getValor(1,0));
      assertEquals( 1, p.getValor(2,0));
      assertEquals( 1, p.getValor(0,1));
   }
   @Test
   public void Crear_PiezaSquare(){
      PieceSquare p=new PieceSquare();

      assertEquals( 1, p.getValor(0,0));
      assertEquals( 1, p.getValor(1,1));
      assertEquals( 1, p.getValor(1,1));
      assertEquals( 1, p.getValor(1,0));

   }
   @Test
   public void Crear_PiezaDog(){
      PieceDog p=new PieceDog();

      assertEquals( 1, p.getValor(1,0));
      assertEquals( 1, p.getValor(2,0));
      assertEquals( 1, p.getValor(1,1));
      assertEquals( 1, p.getValor(0,1));

   }
   @Test
   public void Crear_PiezaStick(){
      PieceStick p=new PieceStick();

      assertEquals( 1, p.getValor(0,0));
      assertEquals( 1, p.getValor(0,1));
      assertEquals( 1, p.getValor(0,2));
      assertEquals( 1, p.getValor(0,3));

   }  

   @Test
   public void Crear_PiezaT(){
      PieceT p=new PieceT();

      assertEquals( 1, p.getValor(0,0));
      assertEquals( 1, p.getValor(1,0));
      assertEquals( 1, p.getValor(2,0));
      assertEquals( 1, p.getValor(1,1));

   }

   @Test
   public void verificar_Reset(){
      PieceT p=new PieceT();
      p.reset();
      assertEquals( 0, p.getValor(0,0));
   }

}