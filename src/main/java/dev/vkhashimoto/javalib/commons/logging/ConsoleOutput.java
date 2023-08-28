package dev.vkhashimoto.javalib.commons.logging;

public class ConsoleOutput implements LoggerOutput {

	@Override
	public void write(String message) {
		System.out.println(message);
	}

}
