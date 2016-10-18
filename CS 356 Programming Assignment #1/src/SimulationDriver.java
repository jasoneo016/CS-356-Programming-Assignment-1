import java.util.Random;

public class SimulationDriver {
	
	
	public static void main(String[] args) {

		IVoteService ivs;		
		QuestionType randomQuestionType = QuestionType.getRandom();
		Question question = null;
		

		//5.3) Randomly generate a number of students and answers.
		Random rand = new Random();
		int numStudents = rand.nextInt(100) + 1;
		System.out.println(numStudents);
		Student[] students = new Student[numStudents];
		
		//5.1 & 5.2)		
		if (randomQuestionType == QuestionType.MULTIPLE) {
			question = new MultipleChoice();
			ivs = new IVoteService(question);
			System.out.println("Multiple Choice: ");

			for (int i = 0; i < 4; i++) {
				System.out.println(question.getResponses()[i] + ". ");
			}
		} else if (randomQuestionType == QuestionType.SINGLE) {
			question = new SingleChoice();
			ivs = new IVoteService(question);
			System.out.println("Single Choice: ");

			for (int i = 0; i < 2; i++) {
				System.out.println(question.getResponses()[i]);
			}
		}		
		

		for (int i = 0; i < numStudents; i++) {
			if (randomQuestionType == QuestionType.MULTIPLE) {
				rand = new Random();
				int index = rand.nextInt(question.choice().length);
				System.out.println();
				System.out.println(index);
				students[i].setAnswer(question.getResponses()[index]);
				
				System.out.println(question.getResponses()[index]);
			} else if (randomQuestionType == QuestionType.SINGLE) {
				rand = new Random();
				int index = rand.nextInt(question.getResponses().length);
				System.out.println();
				System.out.println(index);
				System.out.println(question.getResponses()[index]);
				students[i].setAnswer(question.getResponses()[index]);
				System.out.println(question.getResponses()[index]);
			}
		}
	}
}
