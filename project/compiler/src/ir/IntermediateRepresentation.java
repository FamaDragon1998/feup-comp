package ir;

import java.util.HashMap;

public class IntermediateRepresentation {
	
	HashMap<String, String> collections;
	
	public IntermediateRepresentation() {
		collections = new HashMap<String, String>();
	}
	
	public void addCollection(String collectionName, String collectionType) {
		collections.put(collectionName, collectionType);
	}

}
