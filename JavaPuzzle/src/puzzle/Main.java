package puzzle;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Solver solver = new Solver(0);
        Display disp = new Display();
        solver.run();
        disp.show();


    }
}
