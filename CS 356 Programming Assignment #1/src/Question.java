
public class Question implements Type {

	private enum Choice {MULTIPLE,SINGLE};
	private String[] answer = new String[4];
	private Choice questionChoice;
	
	public void type(Choice choice) {
		if (choice == Choice.MULTIPLE) {
			answer[0] = "A";
			answer[1] = "B";
			answer[2] = "C";
			answer[3] = "D";
		} else if (choice == Choice.SINGLE) {
			answer[0] = "1. Right";
			answer[1] = "2. Wrong";
		}
	}

	@Override
	public void type(Type.Choice choice) {
		
	}
}
