package piezas;

public class PieceStick extends PieceBase {
    public PieceStick(){
        posiciones();
    }
    private void posiciones(){
        setValor1(1, 0);
        setValor1(1, 1);
        setValor1(1, 2);
        setValor1(1, 3);
    }
    @Override
    public void rotateLeft(){
        lado= lado+1;
        if (lado>1){
            lado=0;
        }
        lados();
    }
    @Override
    public void rotateRight(){
        lado= lado-1;
        if (lado<0){
            lado=1;
        }
        lados();
    }
    @Override
    public void lados(){
    reset();
    switch(lado){
        case 0:
            setValor1(1, 0);
            setValor1(1, 1);
            setValor1(1, 2);
            setValor1(1, 3);
            break;
        case 1:
            setValor1(0, 1);
            setValor1(1, 1);
            setValor1(2, 1);
            setValor1(3, 1);
            break;
        }        
    }

}