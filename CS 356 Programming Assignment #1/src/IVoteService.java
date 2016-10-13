
public class IVoteService implements Service {

	Question q;
	Answer a;
	MultipleChoice mc;
	
	
	
	public IVoteService(Question type, Answer candidate) {
		q = type;
		a = candidate;
	}
	
	@Override
	public void acceptSubmissions() {
		while (true) {
			Answer a = new MultipleChoice();
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
