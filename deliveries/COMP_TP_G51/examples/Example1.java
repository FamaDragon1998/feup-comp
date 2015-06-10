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

		/*@jQ
		selected = $("students[toString()*='ri']");
		*/

		System.out.println("selected:");
		for (String str : selected)
			System.out.println(str);
		System.out.println();
	}

}
