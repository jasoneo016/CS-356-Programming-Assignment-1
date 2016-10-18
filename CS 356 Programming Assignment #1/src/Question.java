
public interface Question {

	public enum QuestionType{MULTIPLE, SINGLE};
	
	public String[] choice();
	
	public void setResponses(String[] response);
	
	public String[] getResponses();
	
}
