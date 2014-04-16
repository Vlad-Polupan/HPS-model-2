package exceptions;

public class Exceptions {
	
	private Exceptions() {}
	
	public static class InvalidInput extends Exception {
		private static final long serialVersionUID = 1L;
		public InvalidInput(String message) {
			super(message);
		}
	}
	
	public static class NotGenotype extends InvalidInput {
		private static final long serialVersionUID = 1L;
		public NotGenotype(String wrongString) {
			super(String.format("The string \"%s\" is not a presentation of a genotype", wrongString));
		}
	}
	
	public static class Negative extends InvalidInput {
		private static final long serialVersionUID = 1L;
		public Negative(String paramName, int value) {
			super(String.format("The \"%s\" cann't be negative, but actuale value is %d",
								paramName, value));
		}
		public Negative(String paramName, double value) {
			super(String.format("The \"%s\" cann't be negative, but actuale value is %f",
								paramName, value));
		}
	}
	
	public static class NotInRange extends InvalidInput {
		private static final long serialVersionUID = 1L;
		public NotInRange(String paramName, int min, int max, int value) {
			super(String.format("The \"%s\" cann't be <%d and >%d, but actuale value is %d",
								paramName, min, max, value));
		}
		public NotInRange(String paramName, double min, double max, double value) {
			super(String.format("The \"%s\" cann't be <%f and >%f, but actuale value is %f",
								paramName, min, max, value));
		}
	}

}