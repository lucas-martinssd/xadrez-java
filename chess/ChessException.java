package chess;

public class ChessException extends RuntimeException{
    //Número serial padrão
    private static final long seralVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }
}
