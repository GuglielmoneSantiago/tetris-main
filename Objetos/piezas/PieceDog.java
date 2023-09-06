package Objetos.piezas;

public class PieceDog extends PieceBase {
    public PieceDog(){
        posiciones();
    }
    
    
    private void posiciones(){
        setValor1(1, 0);
        setValor1(1, 1);
        setValor1(2, 1);
        setValor1(2, 2);
    }

    @Override
    public void rotateLeft(){
        lado= lado-1;
        if (lado<0){
            lado=1;
        }
        lados();
    }

    @Override
    public void rotateRight(){
        lado= lado+1;
        if (lado>1){
            lado=0;
        }
        lados();
    }
    
    @Override
    public void lados(){
        reset();
        switch(lado){
            case 0:
                setValor1(0, 1);
                setValor1(1, 1);
                setValor1(1, 0);
                setValor1(2, 0);
                break;
            case 1:
                setValor1(0, 1);
                setValor1(1, 1);
                setValor1(1, 0);
                setValor1(2, 0);
                break;
        }
    }

    
}
