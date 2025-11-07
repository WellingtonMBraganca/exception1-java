package application;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;

        try{
            conn = DB.getConnection();

            ps = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary = BaseSalary * ? "
                    + "WHERE "
                    + "(DepartmentId = ?)"
            );

            //numero 1 representa que é o primeiro interrogação
            // e o segundo argumento é o que estamos dado update...
            ps.setDouble(1, 1.1);
            ps.setInt(2, 2);

            //aqui temos o comando de executar o update, onde retorna como valor o numero de
            //linhas afetadas, alem é claro, de fazer o que o comando diz... executar o update.
            int rowsAffected = ps.executeUpdate();

            System.out.println("Done: " + rowsAffected + " rowsAffected.");
        }catch (SQLException e ){
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }
}
