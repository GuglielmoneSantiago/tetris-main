package Objetos.piezas;

public class main {
    public static void main(String[] args) {
    Board board=new Board();
    
    for(int y=0;y<5;y++){
        PieceSquare p=new PieceSquare();
        board.piezaActiva=p;
        board.piezaActiva.establecerPosicion(y*2,0);
        for(int i=0;i<20;i++){
            board.bajarFicha();
        }
    }
    // Inicializa y muestra la primera pieza
    System.out.print("  piezaActiva1 \n");
    board.piezaActiva.printBoard();
    System.out.print("  tablero1 \n");
    board.printBoard();
    
    }
    
}
