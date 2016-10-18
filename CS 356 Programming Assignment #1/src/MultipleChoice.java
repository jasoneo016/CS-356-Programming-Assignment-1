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
	public void setResponse(String response, int index) {
		this.response[index] = response;
	}

	@Override
	public String getResponse(int index) {
		return response[index];
	}
}
