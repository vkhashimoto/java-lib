package dev.vkhashimoto.javalib.commons.logging;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

import dev.vkhashimoto.javalib.commons.logging.DefaultLogger;
import dev.vkhashimoto.javalib.commons.logging.DefaultTag;
import dev.vkhashimoto.javalib.commons.logging.Logger;
import dev.vkhashimoto.javalib.commons.logging.LoggerOutput;

class TestLogger implements LoggerOutput {

	final Consumer<String> consumer;

	public TestLogger(Consumer<String> consumer) {
		this.consumer = consumer;
	}

	@Override
	public void write(String message) {
		consumer.accept(message);
	}

}

class LogTest {

	@Test
	void validateLoggerOutputReceivesTheFormattedMessage() {
		Logger logger = new DefaultLogger(new TestLogger(message -> assertEquals(message, "[entityId-1] mensagem")));
		logger.info(new DefaultTag("entityId-1"), "mensagem");
	}

}
