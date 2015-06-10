import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();
		students.add("henrique ferrolho");
		students.add("joao pereira");
		students.add("rafaela faria");

		System.out.println("students: ");
		for (String student : students)
			System.out.println(student);
		System.out.println();

		ArrayList<String> selected = new ArrayList<String>();

		// --- BEGIN --- jQuery block
		// selected=$("students[toString()='ri']");
		for (int i = 0; i < students.size(); i++)
			if (students.get(i).toString().toLowerCase().equals("ri"))
				selected.add(students.get(i));
		// --- END --- jQuery block

		System.out.println("selected:");
		for (String str : selected)
			System.out.println(str);
		System.out.println();
	}

}
