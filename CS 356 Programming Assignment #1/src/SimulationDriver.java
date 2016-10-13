public class SimulationDriver {

	public static void main(String[] args) {

		Question randomQuestionType = Question.getRandom();
		
		if (randomQuestionType == Question.MULTIPLE) {
			System.out.println();
		}
	}
}
