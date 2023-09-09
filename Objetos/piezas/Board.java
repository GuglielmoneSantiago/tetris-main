package Objetos.piezas;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int matriz[][]=new int [20][10];
    public List<PieceBase> listaPiezas = new ArrayList<>();
    public Board(){
        cargarMatriz_0();
    }
    public int getValor(int posy,int posx){
        return matriz[posy][posx];
    }
    protected void setValor1(int posy,int posx){
        matriz[posy][posx]=1;
    }
    public void cargarMatriz_0(){
        for(int y=0;y<20;y++){
            for(int x=0;x<10;x++){
                matriz[y][x]=0;
            }
        }
    }
    public void generarFichaAleatoria(){
        int numero = (int)(Math.random()*10+1);
        switch(numero){
            case 1:
                PieceDogLeft piezaDog=new PieceDogLeft();
                listaPiezas.add(piezaDog);
                break;
            case 2:
                PieceL piezaL=new PieceL();
                listaPiezas.add(piezaL);
                break;
            case 3:
                PieceSquare piezaSquare=new PieceSquare();
                listaPiezas.add(piezaSquare);
                break;
            case 4:
                PieceStick piezaStick=new PieceStick();
                listaPiezas.add(piezaStick);
                break;
            case 5:
                PieceT piezaT=new PieceT();
                listaPiezas.add(piezaT);
                break;
        }
    }

    public void insertarPieza(){
        int numero = (int)(Math.random()*9);
        switch(numero){
            case 0:
                generarFichaAleatoria();
                
        }
    }

}
