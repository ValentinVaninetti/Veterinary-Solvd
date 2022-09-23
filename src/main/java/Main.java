import com.solvd.db.SingletonDatabaseConnection;
import com.solvd.dao.AccesorieDaoImpl;
import com.solvd.pojos.Accesorie;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main (String [] args) throws SQLException {
        SingletonDatabaseConnection.getInstance();
        Connection s = SingletonDatabaseConnection.getConnection();
        System.out.println(s);
        Connection d = SingletonDatabaseConnection.getConnection();
        System.out.println(d);
        AccesorieDaoImpl a = new AccesorieDaoImpl();
        Accesorie test = new Accesorie("test2", "testingAgain", 3);
        a.insert(test);
        System.out.println(test.getId());
        a.delete(test);
    }
}
