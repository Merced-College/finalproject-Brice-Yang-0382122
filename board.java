//arrayBoard itself

//Would I need to break down chessBoard into a chessCheck Class that contains data on itself like Position/Piece on it?
// - Probably not

//Should just be able to find position of the piece in it's class and not for chessBoard. In fact
//probably wouldn't need the chessBoard Class anyways...Perhaps? Not entirely sure.
// - Keep Class for ASCII Graphics in case I add them.

public class board{

//------------------------------------------------------

//console text coloring for the colors White, Black, Grey, and the default text color.
public static final String grey = "\u001B[37m";
public static final String black = "\u001B[30m";
public static final String white = "\u001B[61m";
public static final String reset = "\u001B[0m";

//------------------------------------------------------

//Creates the 'chessBoard' multidimensional array
    private String[][] chessBoard;

//------------------------------------------------------

//Constructor. Sets array 'board' to be an 8x8 tileset of '*'
    public board(){
        chessBoard = new String[8][8]; //size of the multi-array
        for (int i = 0; i < this.chessBoard.length; i++){ //iterates through rows
            for (int j = 0; j < this.chessBoard[i].length; j++){ //iterates through columns
                this.chessBoard[i][j] = "*"; //string stored
            }
        }
    }

//------------------------------------------------------

    //Used to draw, redraw, or update the visual ASCII board.
    public void drawBoard(){
        for (int i = 0; i < this.chessBoard.length; i++) { //iterates through rows
            for (int j = 0; j < this.chessBoard[i].length; j++) { //iterates through columns
                if (this.chessBoard[i][j].equals("*")) {
                    System.out.print( grey + this.chessBoard[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

//------------------------------------------------------

    //Updates the chessBoard array data set. A single piece at a time. Not a full board update.
    public void updateBoard(int x, int y, String piece){
        this.chessBoard[x][y] = piece;
    }

//------------------------------------------------------


}