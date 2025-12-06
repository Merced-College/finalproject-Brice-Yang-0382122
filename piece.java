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

//--------------------------------------------------------------

    public piece(){
        this.rank = "Pawn";
        this.xPosition = 0;
        this.yPosition = 0;
    }

    
    public void setRank(String rank){
        this.rank = rank;
    }

    public void SetPosition(int x, int y){
        this.xPosition = x;
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
