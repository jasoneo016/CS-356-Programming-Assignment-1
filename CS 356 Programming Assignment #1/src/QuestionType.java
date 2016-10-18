
public enum QuestionType {MULTIPLE, SINGLE;

public static QuestionType getRandom() {
	return QuestionType.values()[(int) (Math.random() * QuestionType.values().length)];
}};
