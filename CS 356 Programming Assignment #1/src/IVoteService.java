
public class IVoteService implements Service {

	Question q;
	MultipleChoice mc;
	
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
