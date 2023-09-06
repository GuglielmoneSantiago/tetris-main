package Objetos.piezas;

public class Board {
    private int matriz[][]=new int [20][10];
    
    public Board(){
        cargarMatriz_0();
    }
    public int getValor(int pos1,int pos2){
        return matriz[pos1][pos2];
    }
    protected void setValor1(int posy,int posx){
        matriz[posy][posx]=1;
    }
    public void cargarMatriz_0(){
        for(int y=0;y<=10;y++){
            for(int x=0;x<=10;x++){
                matriz[y][x]=0;
            }
        }
    }
    

}
