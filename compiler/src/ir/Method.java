package ir;

import java.util.ArrayList;

import utils.Log;

public class Method {

	private String classScope;
	private ArrayList<String> modifiers;
	private String result, name;

	public Method(String classScope, ArrayList<String> modifiers,
			String result, String name) {
		this.classScope = classScope;
		this.modifiers = modifiers;
		this.result = result;
		this.name = name;

		Log.info("New method created: " + toString());
	}

	public ArrayList<String> getModifiers() {
		return modifiers;
	}

	@Override
	public String toString() {
		return "Method [classScope=" + classScope + ", modifiers=" + modifiers
				+ ", result=" + result + ", name=" + name + "]";
	}

}
