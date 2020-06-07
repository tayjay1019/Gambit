import java.util.ArrayList;

public class Gambit {

    private static ArrayList<String> boardValue = new ArrayList<>();
    private static ArrayList<String> boardHolder = new ArrayList<>();



    public void initialize(){
        setBoardValue();
        printBoard();
    }

    public void printBoard(){
        System.out.println("\n -------------Game Board-----------------");
        System.out.println("[1-1] [1-2] [1-3] [1-4] [1-5] [1-6] [1-7]");
        rowValues(0);
        System.out.println("[2-1] [2-2] [2-3] [2-4] [2-5] [2-6] [2-7]");
        rowValues(7);
        System.out.println("[3-1] [3-2] [3-3] [3-4] [3-5] [3-6] [3-7]");
        rowValues(14);
        System.out.println("[4-1] [4-2] [4-3] [4-4] [4-5] [4-6] [4-7]");
        rowValues(21);
        System.out.println("[5-1] [5-2] [5-3] [5-4] [5-5] [5-6] [5-7]");
        rowValues(28);
        System.out.println("[6-1] [6-2] [6-3] [6-4] [6-5] [6-6] [6-7]");
        rowValues(35);
        System.out.println("[7-1] [7-2] [7-3] [7-4] [7-5] [7-6] [7-7]");
        rowValues(42);
        System.out.println("\n");
    }



    public void setBoardValue(){
        for (int i = 0; i < 49; i++){
            boardValue.add("0");
            boardHolder.add("N");
        }
        boardValue.set(24, "7");
        boardHolder.set(24, "C");
    }

    public void rowValues(int row){

        for (int i = 0; i < 7; i++){
            System.out.print(" " + boardHolder.get(row + i) + "-" + boardValue.get(row + i) + "  ");
        }
        System.out.println();
    }
}
