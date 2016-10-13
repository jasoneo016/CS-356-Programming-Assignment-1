
public class Student {

	private String ID;
	private String answer;
	
	public void submit() {
		MultipleChoice mc = new MultipleChoice();
		String answer = mc.getResponses()[1];
	}
}
