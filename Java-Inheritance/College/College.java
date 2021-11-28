
class College {

	private String name;
	private int numOfLecturers;
	private int numOfCourses;

	public College() {
		name = "Sapir";
		numOfLecturers = 0;
		numOfCourses = 5;
	}

	public String getNameOfMember() {
		return name;
	}

	public void setNameOfMember(String newName) {
		name = newName;
	}

	public String toString() {

		return "the name of College: " + name + "\n" + "number of lecturers: " + numOfLecturers + "\n"
				+ "number of courses: " + numOfCourses;
	}

	public void addLecturer() {
		numOfLecturers += 1;
		System.out.println( numOfLecturers +" plus lecturer");

	}

	public int getNumOfLecturers() {
		return numOfLecturers;
	}

	public void setNumOfLecturers(int NewNumOfLecturers) {
		numOfLecturers = NewNumOfLecturers;
	}

	public void checkCourseToLecturer() {

		if (numOfLecturers >= numOfCourses)
			System.out.println("yes, there is enough lecturer");
		else
			System.out.println("no, it's not enough lecturer");
	}

	public void setNumOfLecturers1(int newNewNumOfLecturers) {
		numOfLecturers = newNewNumOfLecturers;

	}
}
