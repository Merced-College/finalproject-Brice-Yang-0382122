//Pieces will need to be done as a class.
//Name/Move/Position
/* 
*
*
*
REDUNDANT CODE. EVERY PIECE NEED THEIR OWN CLASS
pawn.java and piece.java are not really needed I think?
*
*
*
*/
public class piece {
    String rank;
    private int xPosition;
    private int yPosition;
    private String[][] chessBoard = {
        {"[]","[]","[]","[]","[]","[]","[]","[]"},
        {"[]","[]","[]","[]","[]","[]","[]","[]"},
        {"[]","[]","[]","[]","[]","[]","[]","[]"},
        {"[]","[]","[]","[]","[]","[]","[]","[]"},
        {"[]","[]","[]","[]","[]","[]","[]","[]"},
        {"[]","[]","[]","[]","[]","[]","[]","[]"},
        {"[]","[]","[]","[]","[]","[]","[]","[]"},
        {"[]","[]","[]","[]","[]","[]","[]","[]"}
        };

//--------------------------------------------------------------

    public piece(){
        this.rank = "Pawn";
        this.xPosition = 0;
        this.yPosition = 0;
        this.chessBoard[1][1] = "doggy";
    }

    
    public void setRank(String rank){
        this.rank = rank;
    }

    public void xSetPosition(int x){
        this.xPosition = x;
    }

    public void ySetPosition(int y){
        this.yPosition = y;
    }

//--------------------------------------------------------------

    public String getRank(){
        System.out.println(rank);
        return this.rank;
    }

    public int xGetPosition(){
        return this.xPosition;
    }

    public int yGetPosition(){
        return this.yPosition;
    }

//--------------------------------------------------------------

}
