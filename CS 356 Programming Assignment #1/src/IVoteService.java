
public class IVoteService implements Service {

	Question q;
	Answer a;
	MultipleChoice mc;
	Student student;
	
	public IVoteService(Question type, Answer candidateAnswers) {
		q = type;
		a = candidateAnswers;
	}
	
	@Override
	public void acceptSubmissions() {
		while (true) {
		}
	}

	@Override
	public void display() {
		if (q == Question.MULTIPLE) {
			mc.choice();
			System.out.println();
		}
		System.out.println();
	}

}
