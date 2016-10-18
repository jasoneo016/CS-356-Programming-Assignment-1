import java.util.Random;

public class SimulationDriver {
	
	
	public static void main(String[] args) {

		IVoteService ivs = null;
		Question question = null;
		QuestionType randomQuestionType = QuestionType.getRandom();
		
		//5.3) Randomly generate a number of students and answers.
		Random rand = new Random();
		int numStudents = rand.nextInt(100) + 1;
		Student[] students = new Student[numStudents];
		
		//5.1 & 5.2)		
		if (randomQuestionType == QuestionType.MULTIPLE) {
			question = new MultipleChoice();
			ivs = new IVoteService(question);
			System.out.println("Multiple Choice: ");

			for (int i = 0; i < 4; i++) {
				System.out.println(question.getResponse(i) + ". ");
			}
		} else if (randomQuestionType == QuestionType.SINGLE) {
			question = new SingleChoice();
			ivs = new IVoteService(question);
			System.out.println("Single Choice: ");

			for (int i = 0; i < 2; i++) {
				System.out.println(question.getResponse(i));
			}
		}		
		
		System.out.println();
		System.out.println("# of Students: " + numStudents);
		System.out.println();

		for (int i = 0; i < numStudents; i++) {
			
			students[i] = new Student(Integer.toString(i));
			
			if (randomQuestionType == QuestionType.MULTIPLE) {
				int index = rand.nextInt(question.choice().length);
				students[i].setAnswer(question.getResponse(index));
				ivs.acceptSubmission(randomQuestionType, index);
			} else if (randomQuestionType == QuestionType.SINGLE) {
				int index = rand.nextInt(question.choice().length);
				students[i].setAnswer(question.getResponse(index));
				ivs.acceptSubmission(randomQuestionType, index);
			}
		}
		
		
		ivs.display(randomQuestionType);
	}
}
