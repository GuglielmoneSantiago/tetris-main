package Objetos.piezas;

public class PieceDogRight extends PieceBase {
    public PieceDogRight(){
        lado= (int)(Math.random()*3);
        lados();
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
            setValor1Matriz(0, 2);
            setValor1Matriz(1, 2);
            setValor1Matriz(1, 1);
            setValor1Matriz(2, 1);
            verAltura();
            break;
        case 1:
            setValor1Matriz(0, 0);
            setValor1Matriz(0, 1);
            setValor1Matriz(1, 1);
            setValor1Matriz(1, 2);
            verAltura();
            break;
        }
    }

    
}