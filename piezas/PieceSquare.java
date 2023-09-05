package piezas;
public class PieceSquare extends Piece {
    public PieceSquare(){
        posiciones();
        }
    private void posiciones(){
        setValor1(0, 0);
        setValor1(0, 1);
        setValor1(1, 1);
        setValor1(1, 0);
        }
    

}



