package application;

import com.mysql.cj.protocol.Resultset;
import db.DB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        Resultset rs = null;

        try{
            DB.getConnection();

            st = conn.createStatement();

            rs = st.executeQuery("select * from departament");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
