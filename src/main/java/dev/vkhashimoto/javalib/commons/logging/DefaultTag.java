package dev.vkhashimoto.javalib.commons.logging;

public final class DefaultTag implements Tag {
	private String tag;

	public DefaultTag(String tag) {
		this.tag = tag;
	}

	@Override
	public String getTag() {
		return String.format("[%s]", tag);
	}

}
