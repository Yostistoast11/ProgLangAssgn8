package puzzle;

public class Board {

    public int board[];

    Board() {
        this.board = new int[15];
        for(int i = 0; i <15; i ++){
            this.board[i] = 1;
        }
        System.out.println("board ready");
    }
    void displayBoard(){
        for(int i = 0; i <15; i ++){
            System.out.print(this.board[i] + " ");

        }
        System.out.print("\n");
    }
    void setEmpty(int location){
        this.board[location] =0;
    }
    // array or list of filled up positions
}
