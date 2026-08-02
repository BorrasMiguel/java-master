public class methodOverLoading {

    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("Ana", 100));
        System.out.println("New score is " + calculateScore(200));


        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore (int score) {
        System.out.println("Anonymous " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {

        System.out.println("No player name, no player score");
        return 0;
    }

}


