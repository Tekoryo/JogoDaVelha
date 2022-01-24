package programa;

import hash.HashMatch;

public class App {
    public static void main(String[] args) throws Exception {
        HashMatch hashMatch=new HashMatch();
        UI.printBoard(hashMatch.getPieces());
    }
}
