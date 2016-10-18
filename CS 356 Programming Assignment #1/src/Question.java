
public interface Question {

	public enum QuestionType{MULTIPLE, SINGLE};
	
	public String[] choice();
	
	public void setResponse(String response, int index);
	
	public String getResponse(int index);
	
}
