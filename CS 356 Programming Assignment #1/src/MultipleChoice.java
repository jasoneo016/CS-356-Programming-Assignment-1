
public class MultipleChoice implements Answer {

	private String[] response = new String[4];
	
	@Override
	public void choice() {
		response[0] = "A";
		response[1] = "B";
		response[2] = "C";
		response[3] = "D";
	}

}
