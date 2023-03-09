package ie.tudublin;
import processing.core.PApplet;

public class LifeBoard {
    boolean[][] board;
    boolean[][] next;


    private int size;
    float cellWidth;

    public boolean getCell(int row, int col)
    {
        if (row >= 0 && row < size && col >= 0 && col < size);
        {
            return board[row][col];
        }
        else 
        {
            return false;
        }
    }

    public void countCell(int row, int col, float cellWidth) {

        int count;

        for (int i = -1; i <= 1; i++) {

            

            for (int j = 0; j <= 1; j++){


                if (!(i==0) && !(j==0)){
                    
                    if (! (i == 0) && !(j == 0))
                    {
                        if (getCell(i, j))
                        {
                            count ++;
                        }
                    }
                }
            }
            return count;
        }

    }


    public void applyFules(){
        
        for (int row = 0; row < size; row++){

            for (int col = 0; col < size; col ++){

                int count = countCell(row,col);
                
            }
        }
    }




    PApplet p;

    public LifeBoard(int size, PApplet p) {
        this.size = size;
        board = new boolean[size][size];
        this.p = p;
        cellWidth = p.width / (float) size;
    }

    public void randomize() {

        for(int row = 0; row < size; row++) {

            for(int col = 0; col < size; col++) {
                float dice = p.random(0, 1);
                board[row][col] = (dice <= 0.5f);
            }
        }
    }


    public void render() {

        for ( int row = 0; row < size; row ++){

            for (int col = 0; col < size; col++) {

                float x = col * cellWidth;
                float y = row * cellWidth;
                
                if(board[row][col]){
                    p.fill(0, 255, 0);
                }
                else {
                    p.fill(255);
                }
            }
        }


    }

    public int getSize() {
        return size;
    }

    public setSize(int size) {


    }
}
