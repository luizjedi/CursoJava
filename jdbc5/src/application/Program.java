package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {

		// Deletando dados
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
			"DELETE FROM seller "
			+ "WHERE " // Se where n�o for adicionado o comando de delete ser� aplicado 
			// a todos os componentes do banco.
			+ "ID = ?");
			
			st.setInt(1, 8);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
					
		}
		
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		
		finally {
			
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
