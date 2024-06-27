package chess;

import boardgame.BoardException;

public class ChessException extends BoardException{
    //Número serial padrão
    private static final long seralVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }
}
