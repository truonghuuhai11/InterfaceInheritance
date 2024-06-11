package advance.dev;

public class MainApp {
	public static void main(String[] args) {
		ItStudent student = new ItStudent();

		// Gọi các phương thức của đối tượng ItStudent
		System.out.println(student.sleep("10:00 PM"));
		student.code();
		student.playGame();
		student.hackFacebook();
		student.goToSchool();
	}
}
