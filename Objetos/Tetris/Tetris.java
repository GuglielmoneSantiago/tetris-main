package Objetos.Tetris;

import Objetos.piezas.Board;

public class Tetris {
    Board boardT=new Board();
    Clock clock=new Clock();
    public void start(){
        boardT.generarFichaAleatoria();
    }
    public void rotateLeft(){
        if(boardT.piezaActiva!=null){
            boardT.piezaActiva.rotateLeft();
        }
    }
    public void rotateRight(){
        if(boardT.piezaActiva!=null){
            boardT.piezaActiva.rotateRight();
        }
    }
    public void state(){
        
    }
    public void tick(){
        clock.board=boardT;
        clock.tick();
        boardT.bajarFicha();
    }
}
