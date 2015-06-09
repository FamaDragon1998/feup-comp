package ir;

import java.util.ArrayList;
import java.util.HashMap;

import compiler.Translator;

import utils.Log;

public class IntermediateRepresentation {

	final Translator translator;

	// map(field, fieldInfo)
	public HashMap<String, Field> fields;

	// map(field, methods)
	public HashMap<String, Method> methods;

	public IntermediateRepresentation(final Translator translator) {
		this.translator = translator;

		fields = new HashMap<String, Field>();
		methods = new HashMap<String, Method>();
	}

	public void addField(String classScope, ArrayList<String> modifiers,
			String type, String name) {
		fields.put(name, new Field(classScope, modifiers, type, name));
	}

	public void addMethod(String classScope, ArrayList<String> modifiers,
			String result, String name) {
		methods.put(name, new Method(classScope, modifiers, result, name));
	}

	// assertions

	public void assertField(String variable) {
		if (!fields.containsKey(variable))
			Log.error("'" + variable
					+ "' cannot be resolved to a variable (line "
					+ translator.currentLine + ").");
	}

	public void assertVisibleField(String field) {
		if (fields.get(field) != null)
			if (!fields.get(field).getClassScope()
					.equals(translator.currentClass))
				if (fields.get(field).getModifiers().contains("private"))
					Log.error("The field '" + field + "' is not visible (line "
							+ translator.currentLine + ").");
	}

	public void assertMethod(String fieldOrMethod) {
		if (!methods.containsKey(fieldOrMethod))
			Log.error("The method '" + fieldOrMethod + "' is undefined (line "
					+ translator.currentLine + ").");
	}

	public void assertVisibleMethod(String attribute) {
		if (methods.get(attribute) != null)
			if (methods.get(attribute).getModifiers().contains("private"))
				Log.error("The method '" + attribute
						+ "' is not visible (line " + translator.currentLine
						+ ").");
	}

}
