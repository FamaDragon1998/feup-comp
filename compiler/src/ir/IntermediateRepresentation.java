package ir;

import java.util.ArrayList;
import java.util.HashMap;

import compiler.Translator;
import utils.Log;

public class IntermediateRepresentation {

	final Translator translator;

	// map(field, field)
	public HashMap<String, Field> fields;

	// map(field, method)
	public HashMap<String, Method> methods;

	// map(field, local variable)
	public HashMap<String, LocalVariable> locals;

	public IntermediateRepresentation(final Translator translator) {
		this.translator = translator;

		fields = new HashMap<String, Field>();
		methods = new HashMap<String, Method>();
		locals = new HashMap<String, LocalVariable>();
	}

	public void addField(String classScope, ArrayList<String> modifiers,
			String type, String name) {
		fields.put(name, new Field(classScope, modifiers, type, name));
	}

	public void addMethod(String classScope, ArrayList<String> modifiers,
			String result, String name) {
		methods.put(name, new Method(classScope, modifiers, result, name));
	}

	public void addLocalVariable(String type, String name) {
		locals.put(name, new LocalVariable(type, name));
	}

	// assertions

	public void assertField(String variable) {
		if (!fields.containsKey(variable) && !locals.containsKey(variable))
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

	public void assertSameType(String out, String in) {
		String outType = "", inType = "";

		if (locals.containsKey(out))
			outType = locals.get(out).type;
		else if (fields.containsKey(out))
			outType = fields.get(out).type;
		else {
			Log.error("Unexpected error while asserting same type of variables");
			return;
		}

		if (locals.containsKey(in))
			inType = locals.get(in).type;
		else if (fields.containsKey(in))
			inType = fields.get(in).type;
		else {
			Log.error("Unexpected error while asserting same type of variables");
			return;
		}

		if (!outType.equals(inType))
			Log.error("Type mismatch: cannot convert from " + inType + " to "
					+ outType);
	}

}
