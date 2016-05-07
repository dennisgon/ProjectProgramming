
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Koneksi {
    private Vector<Object> vec1 = new Vector<Object>();
    Vector<Object> vec2 = new Vector<Object>();
    Connection co;
    ResultSet rs;
    ResultSetMetaData rm;

    public Koneksi(){
        try {
            //driver java yang digunakan
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //mengkoneksikan driver dengan ms access
            co = DriverManager.getConnection("jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=database.mdb");
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //digunakan untuk menentukan result set sebuah query
    public ResultSet exec(String query){
        
        try {
            Statement sm;
            sm = co.createStatement(1004,1008);
            rs = sm.executeQuery(query);
            rm = rs.getMetaData();
            
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }
    //digunakan untuk mengupdate querry
    public void Update(String query){ 
        try {
            Statement sm;
            sm = co.createStatement(1004,1008);
            sm.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    


    /**
     * @return the vec1
     */
    // digunakan untuk mengambil semua data baris yang ada di table database
    public Vector<Object> getVec1(){
        vec1.clear();
        try {
            while(rs.next()){
                vec2 = new Vector<Object>();
                for(int i = 1;i<=rm.getColumnCount();i++){
                    vec2.add(rs.getString(i));
                }
                vec1.add(vec2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vec1;
    }
    
    
}
