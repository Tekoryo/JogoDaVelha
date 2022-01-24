package hash;

import board.Board;

public class HashMatch{
    public Board board;

    public HashMatch(){
        board=new Board(3,3);
    }
    public HashPiece[][] getPieces(){
        HashPiece[][] mat =new HashPiece[board.getRows()][board.getColumns()];
        for(int i=0;i<board.getRows();i++){
            for(int j=0;j<board.getColumns();j++){
                mat[i][j]=(HashPiece) board.piece(i,j);
            }
        }
        return mat;
    }
}