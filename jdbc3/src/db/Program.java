package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();

			/*
			// Prepara comandos para inserir dados
			st = conn.prepareStatement(
			"INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) "
			+ "VALUES " + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			// Cada ? representa um valor a ser inserido.

			st.setString(1, "Luiz Felipe");
			st.setString(2, "luiz@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("29/11/1994").getTime()));
			st.setDouble(4, 5700.0);
			st.setInt(5, 4);
			
			*/
			
			st = conn.prepareStatement(
					"insert into department (Name) values ('D1'),('D2')",
					Statement.RETURN_GENERATED_KEYS);

			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
				}

			}

			else {
				System.out.println("No rown affected!");
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
/*
		catch (ParseException e) {
			e.printStackTrace();
		}
*/
		finally {

			DB.closeStatement(st);
			DB.closeConnection();
		}

	}
}
