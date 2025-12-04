//arrayBoard itself

//Would I need to break down chessBoard into a chessCheck Class that contains data on itself like Position/Piece on it?
// - Probably not

//Should just be able to find position of the piece in it's class and not for chessBoard. In fact
//probably wouldn't need the chessBoard Class anyways...Perhaps? Not entirely sure.
// - Keep Class for ASCII Graphics in case I add them.

public class boardChess {
    public static void Board(){ 
    int[][] chessPosition = {
        {0,1,2,3,4,5,6,7,8}, //0
        {0,1,2,3,4,5,6,7,8}, //1
        {0,1,2,3,4,5,6,7,8}, //2
        {0,1,2,3,4,5,6,7,8}, //3
        {0,1,2,3,4,5,6,7,8}, //4
        {0,1,2,3,4,5,6,7,8}, //5
        {0,1,2,3,4,5,6,7,8}, //6
        {0,1,2,3,4,5,6,7,8}, //7
    }; //from what I understand should be the same as 'int[][] chessPosition = new int[8][8]'
        // but with initalized values. Like chessPosition[0][3] = 3;
    
    //Would need getters and setters I believe?

    


    }
}
