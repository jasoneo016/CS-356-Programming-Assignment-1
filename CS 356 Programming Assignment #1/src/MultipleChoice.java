import java.util.Arrays;

public class MultipleChoice implements Answer {

	private String[] response = new String[4];
	
	@Override
	public void choice() {
		response[0] = "A";
		response[1] = "B";
		response[2] = "C";
		response[3] = "D";
	}
	
	public void setResponses(String[] response) {
		this.response = Arrays.copyOf(response, response.length);
	}

	public String[] getResponses() {
		return Arrays.copyOf(response, response.length);
	}
}
