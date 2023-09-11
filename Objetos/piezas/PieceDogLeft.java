package Objetos.piezas;

public class PieceDogLeft extends PieceBase {
    public PieceDogLeft(){
        lado= (int)(Math.random()*3);
        lados();
    }
    @Override
    public void rotateLeft(){
        if(getValorMatriz(0, 2)!=2){
            lado= lado-1;
            if (lado<0){
                lado=1;
            }
            lados();
        }
    }

    @Override
    public void rotateRight(){
        if(getValorMatriz(0, 2)!=2){
            lado= lado+1;
            if (lado>1){
                lado=0;
            }
            lados();
        }
    }
    
    @Override
    public void lados(){
        reset();
        switch(lado){
            case 0:
                setValor1Matriz(1, 0);
                setValor1Matriz(1, 1);
                setValor1Matriz(2, 1);
                setValor1Matriz(2, 2);
                verAltura();
                break;
            case 1:
                setValor1Matriz(0, 1);
                setValor1Matriz(1, 1);
                setValor1Matriz(1, 0);
                setValor1Matriz(2, 0);
                verAltura();
                break;
        }
    }

    
}
