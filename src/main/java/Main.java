import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.dao.AccesorieDaoImpl;
import com.solvd.pojos.Accesorie;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        SingletonDatabaseConnection.getInstance();
        Connection s = SingletonDatabaseConnection.getConnection();
        System.out.println(s);
        Connection d = SingletonDatabaseConnection.getConnection();
        System.out.println(d);
        AccesorieDaoImpl a = new AccesorieDaoImpl();
        System.out.println(a.getById(5).toString());
        System.out.println(a.getById(6).toString());
        System.out.println(a.getById(7).toString());
        System.out.println(a.getById(8).toString());
        System.out.println(a.getById(1).toString());
    }
}
