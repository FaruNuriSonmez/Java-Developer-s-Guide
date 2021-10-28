public class Main {

    public static void main(String[] args) {
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        womenGameCalculator.calculated();
        womenGameCalculator.gameover();

        GameCalculator gameCalculators = new KidsGameCalculator();
        gameCalculators.calculated();
    }
}
