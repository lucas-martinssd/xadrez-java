package boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();
    
    //É possivel mover para aquela posição
    public boolean possibleMove(Position positon){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    //Verifica se a peça pode ir para aquela posição
    public boolean isThereAndPossibleMove(){
        boolean [][] mat = possibleMoves();
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
