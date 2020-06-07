public class Driver {
    public static void main(String[] args) {
        Gambit test = new Gambit();
        Player tester = new Player("R");
        Player tester2 = new Player("B");

        test.initialize();
        tester.atStart();
        tester2.atStart();
    }
}
