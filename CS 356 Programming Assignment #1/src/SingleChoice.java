import java.util.Arrays;


public class SingleChoice implements Question {

	private String[] response = new String[2];
	
	@Override
	public String[] choice() {
		response[0] = "1. Right";
		response[1] = "2. Wrong";
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
