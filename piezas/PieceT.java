package piezas;
public class PieceT extends Piece {
    public PieceT(){
        posiciones();
        }
    private void posiciones(){
        setValor1(1, 0);
        setValor1(1, 1);
        setValor1(1, 2);
        setValor1(0, 1);
    }

    public void move(int lado){
        switch (lado){
            case 0:
                setValor1(0, 0);
                setValor1(1, 0);
                setValor1(2, 0);
                setValor1(1, 1);
        }
    }
    


 }
        

