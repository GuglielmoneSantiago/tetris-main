package Objetos.Tetris;

import Objetos.piezas.Board;

public class Tetris {
    Board b=new Board();
    Clock c=new Clock();
    public void start(){
        b.generarFichaAleatoria();
    }
    public void rotateLeft(){
        if(b.piezaActiva!=null){
            b.piezaActiva.rotateLeft();
        }
    }
    public void rotateRight(){
        if(b.piezaActiva!=null){
            b.piezaActiva.rotateRight();
        }
    }
    public void state(){
        
    }
    public void tick(){
        c.tick();
        b.bajarFicha();
    }
}
