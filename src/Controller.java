
public class Controller {

	public static void main(String[] args) {
		new Controller().go();
	}
	
	public void go(){
		IStudentDAO dao = new MysqlStudentDAO_impl();
		StudentDTO student = dao.getStudent();
		System.out.println(student);
	}
}
