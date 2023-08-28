package dev.vkhashimoto.javalib.commons.logging;

public class DefaultLogger implements Logger {
	final LoggerOutput loggerOutput;

	public DefaultLogger(LoggerOutput loggerOutput) {
		this.loggerOutput = loggerOutput;
	}

	@Override
	public void info(Tag tag, String message) {
		loggerOutput.write(String.format("%s %s", tag.getTag(), message));
	}

}
