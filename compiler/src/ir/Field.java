package ir;

import java.util.ArrayList;

import utils.Log;

public class Field {

	private String classScope;
	private ArrayList<String> modifiers;
	public String type, name;

	public Field(String classScope, ArrayList<String> modifiers, String type,
			String name) {
		this.classScope = classScope;
		this.modifiers = modifiers;
		this.type = type;
		this.name = name;

		Log.info("New field created: " + toString());
	}

	public String getClassScope() {
		return classScope;
	}

	public ArrayList<String> getModifiers() {
		return modifiers;
	}

	@Override
	public String toString() {
		return "Field [classScope=" + classScope + ", modifiers=" + modifiers
				+ ", type=" + type + ", name=" + name + "]";
	}

}
