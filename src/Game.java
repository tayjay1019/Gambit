import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game extends Gambit{

    private Player player1 = new Player("R");
    private Player player2 = new Player("B");
    private List<Player> players = Arrays.asList(player1, player2);
    private Player currentPlayer = players.get(0);
    private int playerNumber = 1;
    Scanner keyboard = new Scanner(System.in);
    boolean gameEnd = false;

    public void start(){
        player1.atStart();
        player2.atStart();
        initialize();
        while(!gameEnd){
            takeTurn();
        }
    }

    public void switchPlayer(){
        currentPlayer = players.get(1-players.indexOf(currentPlayer));
        playerNumber = 2 - playerNumber + 1;
    }

    public void takeTurn(){
        boolean turnEnd = false;
        drawPhase();
        do{
            System.out.println("Player " + playerNumber);
            System.out.print("Your hand: ");
            currentPlayer.showHand();
            System.out.print("Select a card - type 'END' to end turn\n>");
            String cardSelect = keyboard.nextLine();
            if(cardSelect.equals("END")){
                turnEnd = true;
            }
            else{
                int num = Integer.parseInt(cardSelect) - 1;
                System.out.print("Select a space to place the card - type 'row'-'column ex: 7-1\n>");
                String placement = keyboard.nextLine();
                String[] place = placement.split("-");
                int index = (((Integer.parseInt(place[0]) * 7) - 7) + (Integer.parseInt(place[1]) - 1));
                if (Integer.parseInt(currentPlayer.getCard(num)) > Integer.parseInt(boardValue.get(index))){
                    boardValue.set(index, currentPlayer.getCard(num));
                    boardHolder.set(index, currentPlayer.getPlayerToken());
                    currentPlayer.discardCard(num);
                    printBoard();
                    if(currentPlayer.getHandSize() == 0){
                        turnEnd = true;
                    }
                }
                else{
                    System.out.println("Can not place card there");
                }
            }

        } while (!turnEnd);
        switchPlayer();
    }

    public void drawPhase(){
        int counter = 0;
        for (String s : boardHolder) {
            if (s.equals(currentPlayer.getPlayerToken())) {
                counter++;
            }
        }
            if(counter > currentPlayer.getDeckSize()){
                currentPlayer.drawCard(currentPlayer.getDeckSize());
            }
            currentPlayer.drawCard(counter);

    }


    public void endOfGameCheck(){

        if(currentPlayer.getHandSize() == 0 )

        if(currentPlayer.getDeckSize() == 0){

        }
    }

}
