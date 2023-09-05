package piezas;
public class PieceSquare extends PieceBase {
    public PieceSquare(){
        posiciones();
        }
    private void posiciones(){
        setValor1(0, 0);
        setValor1(0, 1);
        setValor1(1, 1);
        setValor1(1, 0);
        }
        @Override
        public void rotateLeft(){
            lados();
        }
        @Override
        public void rotateRight(){
            lados();
        }
        @Override
        public void lados(){
            reset();
            switch(lado){
                case 0:
                    setValor1(0, 0);
                    setValor1(0, 1);
                    setValor1(1, 1);
                    setValor1(1, 0);
                    break;
            }
        }

}



