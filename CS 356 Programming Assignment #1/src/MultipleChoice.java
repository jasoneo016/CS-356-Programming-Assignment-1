import java.util.Arrays;

public class MultipleChoice implements Question {

	private String[] response = new String[4];
	
	@Override
	public String[] choice() {
		response[0] = "A";
		response[1] = "B";
		response[2] = "C";
		response[3] = "D";
		return response;
	}
	
	@Override
	public void setResponses(String[] response) {
		this.response = Arrays.copyOf(response, response.length);
	}

	@Override
	public String[] getResponses() {
		return Arrays.copyOf(response, response.length);
	}
}
