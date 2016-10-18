
public class IVoteService {
	
	private int[] MCAnswers;
	private int[] SCAnswers;
	
	public IVoteService(Question question) {
		question.choice();
		MCAnswers = new int[4];
		SCAnswers = new int[4];
	}
	
	public void acceptSubmission(QuestionType qt, int index) {
		if (qt == QuestionType.MULTIPLE) {
			MCAnswers[index]++;
		} else if (qt == QuestionType.SINGLE) {
			SCAnswers[index]++;
		}
	}

	public void display(QuestionType qt) {
		if (qt == QuestionType.MULTIPLE) {
			System.out.println("A: " + MCAnswers[0]  + ", B: " + MCAnswers[1] + ", C: " + MCAnswers[2] + ", D: " + MCAnswers[3]);
		} else if (qt == QuestionType.SINGLE) {
			System.out.println("1. Right: " + SCAnswers[0]  + ", 2. Wrong: " + SCAnswers[1]);
		}	}

}
