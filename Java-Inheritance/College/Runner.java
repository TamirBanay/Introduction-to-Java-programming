import java.util.Iterator;
import java.util.Scanner;
public class Runner {
	public static Scanner user = new Scanner(System.in);

	public static void main(String[] args) {
		// -------------Section a ------------
		College c1 = new College();
		// -------------Section b ------------
		System.out.println(c1.toString()+"\n");
		// -------------Section c ------------
		System.out.println("how much lecturer to add? ");
		int numOfL = user.nextInt();
		for (int i = 0; i < numOfL; i++) {
			c1.setNumOfLecturers(i);
		}
		c1.addLecturer();
		System.out.println();
		// -------------Section d ------------
		c1.checkCourseToLecturer();
		// -------------Section e ------------
		System.out.println(c1);

	}

}
