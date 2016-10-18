public class SingleChoice implements Question {

	private String[] response = new String[2];
	
	@Override
	public String[] choice() {
		response[0] = "1. Right";
		response[1] = "2. Wrong";
		return response;
	}
	
	@Override
	public void setResponse(String response, int index) {
		this.response[index] = response;
	}

	@Override
	public String getResponse(int index) {
		return response[index];
	}
}
