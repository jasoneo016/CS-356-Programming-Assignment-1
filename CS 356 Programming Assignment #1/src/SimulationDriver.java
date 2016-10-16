import java.util.Random;

public class SimulationDriver {
	
	public static void main(String[] args) {

		Random rand = new Random();

		Question randomQuestionType = Question.getRandom();
				
		if (randomQuestionType == Question.MULTIPLE) {
			MultipleChoice mc = new MultipleChoice();
			mc.choice();
			System.out.println("Multiple Choice: ");

			for (int i = 0; i < 4; i++) {
				System.out.println(mc.getResponses()[i] + ". ");
			}
		} else if (randomQuestionType == Question.SINGLE) {
			SingleChoice sc = new SingleChoice();
			sc.choice();
			System.out.println("Single Choice: ");

			for (int i = 0; i < 2; i++) {
				System.out.println(sc.getResponses()[i]);
			}
		}
		
		//3) Randomly generate a number of students and answers.
		int numStudents = rand.nextInt(100) + 1;
		Student[] students = generateStudents(numStudents);
		
		
		
		for (int i = 0; i < numStudents; i++) {
			students[i] = submit(mc.getResponses()[1]);
		}
	}
	
	public void runIVoteService() {
		IVoteService ivs = new IVoteService(null, null);
	}
	
	public static Student[] generateStudents(int numStudents) {
		Student[] students = new Student[numStudents];
		
		for (int i = 0; i< numStudents; i++) {
			students[i] = new Student();
		}
		return students;
	}
}
