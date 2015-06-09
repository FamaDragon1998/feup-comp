package utils;

public class Log {

	private static boolean LOGGING_INFOS = true;
	private static boolean LOGGING_ERRORS = true;

	private static int numWarnings;
	private static int numErrors;

	public Log() {
		numErrors = 0;
		numWarnings = 0;
	}

	public static void printStats() {
		System.out.println("Errors: " + numErrors + "\tWarnings: "
				+ numWarnings);
	}

	public static void info(String message) {
		if (LOGGING_INFOS)
			System.out.println("Info: " + message);
	}

	public static void error(String message) {
		if (LOGGING_ERRORS) {
			numErrors++;
			System.err.println("Error: " + message);
		}
	}

}
