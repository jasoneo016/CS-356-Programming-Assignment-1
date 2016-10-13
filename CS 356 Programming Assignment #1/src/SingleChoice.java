
public class SingleChoice implements Answer {

	private String[] response = new String[2];
	
	@Override
	public void choice() {
		response[0] = "1. Right";
		response[1] = "2. Wrong";
	}
}
