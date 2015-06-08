package ir;

import java.util.ArrayList;

import utils.Log;

public class Field {

	private ArrayList<String> modifiers;
	private String type, name;

	public Field(ArrayList<String> modifiers, String type, String name) {
		this.modifiers = modifiers;
		this.type = type;
		this.name = name;

		Log.info("New field created: " + toString());
	}

	@Override
	public String toString() {
		return "Field [modifiers=" + modifiers + ", type=" + type + ", name="
				+ name + "]";
	}

	public ArrayList<String> getModifiers() {
		return modifiers;
	}

}
