package Objetos.piezas;

public abstract class PieceBase implements iRotator{
    protected int lado=0;
    protected int matriz [][] = new int [4][4];
    protected int posicion[][]=new int [20][10];
    public PieceBase(){
    }
    public int getValorMatriz(int posy,int posx){
        return matriz[posy][posx];
    }
    public int getValorPosicion(int posy,int posx){
        return posicion[posy][posx];
    }
    protected void setValor1Posicion(int posy,int posx){
        posicion[posy][posx]=1;
    }
    protected void setValor1Matriz(int posy,int posx){
        matriz[posy][posx]=1;
    }
    protected void setValor2Matriz(int posy,int posx){
        matriz[posy][posx]=2;
    }
    public void reset(){
        for (int y=0; y<4;y++){
            for (int x=0;x<4;x++){
                matriz[y][x]=0;
            }
        }
    }
    public void resetPosicion(){
        for (int y=0; y<20;y++){
            for (int x=0;x<10;x++){
                posicion[y][x]=0;
            }
        }
    }
    public void establecerPosicion(int posx,int posy){
        for (int y=0; y<4;y++){
            for (int x=0;x<4;x++){
                if(getValorMatriz(y,x)==1){
                    int xx=posx+x;
                    int yy=posy+y;
                    setValor1Posicion(yy, xx);
                }
            }
        }
    }
    public void completarParedIzquierda(){
        for(int x=0;x>3;x++){
            int marcador=0;
            for(int y=0;y<3;y++){
                if(matriz[y][x]==1){
                    marcador=1;
                }
            }
            if(marcador==0){
                for(int y=0;y<3;y++){
                    setValor2Matriz(y, x);
                }
            }
        }
    }
    public void completarParedDerecha(){
        for(int x=3;x>0;x--){
            int marcador=0;
            for(int y=0;y<4;y++){
                if(matriz[y][x]==1){
                    marcador=1;
                }
            }
            if(marcador==0){
                for(int y=0;y<4;y++){
                    setValor2Matriz(y, x);
                } 
            }
        }
    }
}