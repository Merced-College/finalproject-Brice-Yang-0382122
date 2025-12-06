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
    String[][] chessBoard;

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
                    System.out.print(this.chessBoard[i][j] + " ");
                }
                else{
                    System.out.print( this.chessBoard[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

//------------------------------------------------------

public void startingBoard(){

    for (int i = 0; i < this.chessBoard.length; i++){
        updateBoard(i,6,"P");
        updateBoard(i,1,"p");
    }
            updateBoard(0,7,"R");
            updateBoard(1,7,"N");
            updateBoard(2,7,"B");
            updateBoard(3,7,"Q");
            updateBoard(4,7,"K");
            updateBoard(5,7,"B");
            updateBoard(6,7,"N");
            updateBoard(7,7,"R");

            updateBoard(0,0,"r");
            updateBoard(1,0,"n");
            updateBoard(2,0,"b");
            updateBoard(3,0,"q");
            updateBoard(4,0,"k");
            updateBoard(5,0,"b");
            updateBoard(6,0,"n");
            updateBoard(7,0,"r");
}


//------------------------------------------------------

    //Updates the chessBoard array data set. A single piece a a time. Not a full board update. This is only a visual console change.
    public void updateBoard(int x, int y, String rank){
        this.chessBoard[y][x] = rank;
    }

//------------------------------------------------------


}