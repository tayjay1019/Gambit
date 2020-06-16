import java.util.ArrayList;

public class Gambit {

    public static ArrayList<String> boardValue = new ArrayList<>();
    public static ArrayList<String> boardHolder = new ArrayList<>();



    public void initialize(){
        displayRules();
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

    public void displayRules(){
        System.out.println("----------Dragons Gambit--------");
        System.out.println("The game is about playing cards to control territory on the board.");
        System.out.println("Each part of the board is outlined with a Row and Column number ex: 2-7 row 2 column 7");
        System.out.println("Below that is the current value of the space and who controls it");
        System.out.println("N = neutral C = center R = red or player-1 B = blue or player-2");
        System.out.println("On a players turn, they may play one or all of the cards in their hand on");
        System.out.println("territory they don't already control, provided that the number of the card is higher");
        System.out.println("than what is displayed, including other players territory.");
        System.out.println("At the start of the players next turn, they will draw cards equal to the number");
        System.out.println("of spaces on the board they control.  If the player has lost all territory and");
        System.out.println("can draw no cards, the game is over and the opponent is the winner.");
        System.out.println("When a player has no more cards to draw from their deck, the game will end");
        System.out.println("after that players turn and points will be calculated.");
        System.out.println("A player gets 1 point for each space on the board they control, plus the");
        System.out.println("point value each card is worth.");
        System.out.println("The player with the most spaces around the center space will gain control of");
        System.out.println("the space and its value will be added to their final score.");
        System.out.println("The player with the most points is the winner.");
        System.out.println("\n\n");

    }

}
