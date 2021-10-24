package exceptions;

@SuppressWarnings("serial")
public class VoteEligebilityException extends Exception{

	public VoteEligebilityException(String message) {
		super("ineligible to vote this year");
	}
}
