
public class IVoteService {
	
	private int[] numAnswers;
	
	public IVoteService(Question question) {
		question.choice();
		numAnswers = new int[question.choice().length];
	}
	
	public void acceptSubmissions(QuestionType qt, String submission) {
		if (submission == "A") {
			
		}
	}

	public void display() {
		System.out.println();
	}

}
