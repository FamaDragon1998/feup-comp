package ir;

import utils.Log;

public class LocalVariable {

	public String type, name;

	public LocalVariable(String type, String name) {
		this.type = type;
		this.name = name;

		Log.info("New local variable created: " + toString());
	}

	@Override
	public String toString() {
		return "LocalVariable [type=" + type + ", name=" + name + "]";
	}

}
