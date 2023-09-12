package Objetos.piezas;

public class main {
    public static void main(String[] args) {
    Board board=new Board();
    
    
    PieceStick p=new PieceStick();
    board.piezaActiva=p;
    board.piezaActiva.setLado(1);
    board.piezaActiva.lados();
    board.insertarPieza();
    board.bajarFicha();
    board.rotateLeft();
    
    
    // Inicializa y muestra la primera pieza
    System.out.print("  piezaActiva1 \n");
    board.piezaActiva.printBoard();
    System.out.print("  tablero1 \n");
    board.printBoard();
    }
    
}
