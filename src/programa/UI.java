package programa;

import hash.HashPiece;

public class UI {
    public static void printBoard(HashPiece[][]pieces){
        for(int i=0;i<pieces.length; i++){
            System.out.print((3-i)+" ");
            for(int j=0;j<pieces.length;j++){
                PrintPiece(pieces[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("  a b c ");
    }
    public static void PrintPiece(HashPiece Piece) {
        if(Piece==null){
            System.out.print("-"+" ");
        }else{
            System.out.print(Piece);
        }
    }
}
