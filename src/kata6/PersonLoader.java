/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class PersonLoader {
    public static ArrayList read() throws SQLException, ClassNotFoundException{
        ArrayList<Person1> list = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        Connection connect = DriverManager.getConnection("jdbc:sqlite:KATA.sDB");
        Statement state = connect.createStatement();
        String aux= "SELECT * FROM PEOPLE";
        ResultSet rs = state.executeQuery(aux);
        while(rs.next()){
             int id= rs.getInt(1);
             String name=rs.getString(2);
             String gender=rs.getString(3);
             String birthDate=rs.getString(4);
             float weight=rs.getFloat(5);
             String mail=rs.getString(6);
             list.add(new Person1(id,name,gender,birthDate,weight,mail));
        }
        
        return list;
        
    }
}
