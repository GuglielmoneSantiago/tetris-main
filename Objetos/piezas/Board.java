package Objetos.piezas;

public class Board {
    public int matriz[][]=new int [20][10];
    public PieceBase piezaActiva;
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
    public void printBoard() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                // Verificar si hay una pieza en la posición (i, j)
                if (matriz[i][j] != 0) {
                    // Si hay una pieza, imprimir un carácter que represente la pieza
                    System.out.print("1"); // Puedes usar otro carácter según tus preferencias
                } else {
                    // Si no hay una pieza, imprimir un espacio en blanco
                    System.out.print("0");
                }
            }
            // Salto de línea al final de cada fila del tablero
            System.out.println();
        }
    }

    
    public boolean puedeBajar(){
        boolean opcion=true;
        for(int y=0;y<20;y++){
            for(int x=0;x<10;x++){
                if(matriz[y][x]==piezaActiva.matriz[y][x]){
                    opcion=false;
                }
            }
        }
        if((piezaActiva.altura+16)==19){
            opcion=false;
        }
        return opcion;
    }

    public void bajarFicha(){
        piezaActiva.posicionY=piezaActiva.posicionY+1;
        piezaActiva.establecerPosicion((piezaActiva.posicionX),(piezaActiva.posicionY));
        if(puedeBajar()==false){
            piezaActiva.posicionY=piezaActiva.posicionY-1;
            piezaActiva.establecerPosicion((piezaActiva.posicionX),(piezaActiva.posicionY));
        }
    }
    public void generarFichaAleatoria(){
        int numero = (int)(Math.random()*5+1);
        switch(numero){
            case 1:
                PieceDogLeft piezaDog=new PieceDogLeft();
                piezaActiva=piezaDog;
                break;
            case 2:
                PieceL piezaL=new PieceL();
                piezaActiva=piezaL;
                break;
            case 3:
                PieceSquare piezaSquare=new PieceSquare();
                piezaActiva=piezaSquare;
                break;
            case 4:
                PieceStick piezaStick=new PieceStick();
                piezaActiva=piezaStick;
                break;
            case 5:
                PieceT piezaT=new PieceT();
                piezaActiva=piezaT;
                break;
        }
    }

    public void insertarPieza(){
        int numero = (int)(Math.random()*9);
        switch(numero){
            case 0:
                piezaActiva.establecerPosicion(numero,0);
                piezaActiva.posicionX=numero;
                piezaActiva.posicionY=0;
                piezaActiva.completarParedIzquierda();
                break;
            case 1:
                piezaActiva.establecerPosicion(numero,0);
                piezaActiva.posicionX=numero;
                piezaActiva.posicionY=0;
                break;
            case 2:
                piezaActiva.establecerPosicion(numero,0);
                piezaActiva.posicionX=numero;
                piezaActiva.posicionY=0;
                break;
            case 3:
                piezaActiva.establecerPosicion(numero,0);
                piezaActiva.posicionX=numero;
                piezaActiva.posicionY=0;
                break;
            case 4:
                piezaActiva.establecerPosicion(numero,0);
                piezaActiva.posicionX=numero;
                piezaActiva.posicionY=0;
                break;
            case 5:
                piezaActiva.establecerPosicion(numero,0);
                piezaActiva.posicionX=numero;
                piezaActiva.posicionY=0;
                break;
            case 6:
                piezaActiva.establecerPosicion(numero,0);
                piezaActiva.posicionX=numero;
                piezaActiva.posicionY=0;
                break;
            case 7:
                piezaActiva.establecerPosicion(numero,0);
                piezaActiva.posicionX=numero;
                piezaActiva.posicionY=0;
                break;
            case 8:
                piezaActiva.establecerPosicion(numero,0);
                piezaActiva.posicionX=numero;
                piezaActiva.posicionY=0;
                break;
            case 9:
                piezaActiva.establecerPosicion(numero,0);
                piezaActiva.posicionX=numero;
                piezaActiva.posicionY=0;
                piezaActiva.completarParedDerecha();
                break;
        }
    }

}
