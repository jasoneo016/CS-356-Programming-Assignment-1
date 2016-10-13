public enum Question {MULTIPLE, SINGLE;

public static Question getRandom() {
	return Question.values()[(int) (Math.random() * Question.values().length)];
}};

