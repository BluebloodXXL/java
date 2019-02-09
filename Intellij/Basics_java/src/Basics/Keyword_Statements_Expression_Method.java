class Keyword_Statements_Expression_Method {

	public static void main(String[] args) {

		int poss = (calculateHighScorePosition(1500));
		displayHighScorePosition("Gablu", poss);

		poss = (calculateHighScorePosition(500));
		displayHighScorePosition("Joglu", poss);

		poss = (calculateHighScorePosition(100));
		displayHighScorePosition("Lablu", poss);

		poss = (calculateHighScorePosition(50));
		displayHighScorePosition("Dellu", poss);

	}

	public static int calculatescore(boolean gameover, int score, int levelCompleted, int bonus) {

		if (gameover) {
			int finalscore = score + (levelCompleted * bonus);
			finalscore += 1000;
			return finalscore;
		} else
			return -1;

	}

	public static void displayHighScorePosition(String name, int possition) {

		System.out.println(name + " managed to get into possition " + possition + " on the high score table");

	}

	public static int calculateHighScorePosition(int score) {

		if (score >= 1000)
			return 1;
		if (score < 1000 && score >= 500)
			return 2;
		if (score >= 100 && score < 500)
			return 3;
		else
			return 4;

	}
}
