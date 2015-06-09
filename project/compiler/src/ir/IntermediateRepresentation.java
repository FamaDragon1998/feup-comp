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

	public void assertVariable(String variable, int line) {
		if (!fields.containsKey(variable))
			Log.error("'" + variable
					+ "' cannot be resolved to a variable (line " + line + ").");
	}

	public void assertMethod(String fieldOrMethod, int line) {
		if (!fields.containsKey(fieldOrMethod))
			Log.error("The method '" + fieldOrMethod + "' is undefined (line "
					+ line + ").");
	}

	public void assertVisible(String attribute, int currentLine) {
		if (fields.get(attribute) != null)
			if (fields.get(attribute).getModifiers().contains("private"))
				Log.error("The field '" + attribute + "' is not visible (line "
						+ currentLine + ").");
	}

}
