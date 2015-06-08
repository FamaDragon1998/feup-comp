package ir;

import java.util.ArrayList;
import java.util.HashMap;

import utils.Log;

public class IntermediateRepresentation {

	// map(field, fieldInfo)
	public HashMap<String, Field> fields;

	public IntermediateRepresentation() {
		fields = new HashMap<String, Field>();
	}

	public void addField(ArrayList<String> modifiers, String type, String name) {
		fields.put(name, new Field(modifiers, type, name));
	}

	// assertions

	public void assertExisting(String variable, int currentLine) {
		if (!fields.containsKey(variable))
			Log.error("Unknown attribute '" + variable + "' (line "
					+ currentLine + ").");
	}

	public void assertVisible(String attribute, int currentLine) {
		if (fields.get(attribute) != null)
			if (fields.get(attribute).getModifiers().contains("private"))
				Log.error("Attribute '" + attribute + "' is private (line "
						+ currentLine + ").");
	}

}
