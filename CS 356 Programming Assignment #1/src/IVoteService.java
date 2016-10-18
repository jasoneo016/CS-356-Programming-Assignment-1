
public class IVoteService implements Service {
	
	private int[] numAnswers;
	
	public IVoteService(Question q) {
		q.choice();
		numAnswers = new int[q.choice().length];
	}
	
	@Override
	public void acceptSubmissions(Student student) {
		while (true) {
			student.getAnswer();
		}
	}

	@Override
	public void display(Question q) {
		for (int i = 0; i < q.choice().length; i++) {
			System.out.println(q.choice()[i] + ": "  );
		}
	}

}
