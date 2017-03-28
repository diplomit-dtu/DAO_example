import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlStudentDAO_impl implements IStudentDAO {

	public StudentDTO getStudent() throws RuntimeException{
		Connector c = new Connector();

		/* Alt SQL er holdt ude af java koden */
		SQLMapper m = new SQLMapper();
		String query = m.getStatement(1);
		
		
		try {
			ResultSet rs = c.doQuery(query);
			while(rs.next()){
				String name = rs.getString("name");
				int id = rs.getInt(1);
				StudentDTO dto = new StudentDTO(id, name);
				return dto;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Error");
		}
	}
}
