package utils;

public class Log {

	private static boolean loggingInfos = true;
	private static boolean loggingErrors = true;

	public static void info(String message) {
		if (loggingInfos)
			System.out.println("Info: " + message);
	}

	public static void error(String message) {
		if (loggingErrors)
			System.err.println("Error: " + message);
	}

}
