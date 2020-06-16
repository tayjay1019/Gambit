public class Driver {
    public static void main(String[] args) {

      /*  System.out.println("Testing various player functions");
        Player test = new Player("b");
        test.atStart();
        test.showHand();
        System.out.println("getting card 2:");
        System.out.println(test.getCard(1));
        System.out.println("removing card 3:");
        test.discardCard(2);
        test.showHand();
        System.out.println("drawing 3 cards");
        test.drawCard(3);
        test.showHand();*/

      Game game = new Game();
      game.start();
    }
}
