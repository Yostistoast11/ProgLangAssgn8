package puzzle;

class Solver extends Object {
    public Board gameBoard;

     public int[][] listOfMoves ={
        {0, 1, 3},
        {0, 2, 5},
        {1, 3, 6},
        {1, 4, 8},
        {2, 4, 7},
        {2, 5, 9},
        {3, 6, 10},
        {3, 7, 12},
        {4, 7, 11},
        {4, 8, 13},
        {5, 8, 12},
        {5, 9, 14},
        {3, 4, 5},
        {6, 7, 8},
        {7, 8, 9},
        {10, 11, 12},
        {11, 12, 13},
        {12, 13, 14}
    };

    Solver(int start) {
        this.gameBoard =new Board();
        gameBoard.displayBoard();
        this.start=start;
        System.out.println("starting solver: "+ start);
    }

    int start;

    void run() {

        System.out.println("running solver");


    }
}
