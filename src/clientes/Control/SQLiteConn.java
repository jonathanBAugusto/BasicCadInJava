/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes.Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Jonathan
 */
public class SQLiteConn {
    private String dbName;
    private String url;
    
    public String getUrl() {
        return url;
    }    
    public SQLiteConn(){
        createDB("db.db");
    }
    
    public void createDB(String dbName){
        this.dbName = dbName;
        String url = "jdbc:sqlite:" + this.dbName;
        
        try {
            Connection conn;
            conn = DriverManager.getConnection(url);
            if (conn == null) {
                System.out.println("Fail in Connection");
            }
        }catch (SQLException e) {
            System.out.println("Caminho " + url + " não Encontrado. Erro: " + e.getMessage());
            return;
        }
        createTables();
    }
    
    public void createTables(){
      // SQLite connection string
        String url = "jdbc:sqlite:" + this.dbName;
        
        //USER
        List<String> Columns = new ArrayList();
        
        Columns.add("ID INTEGER PRIMARY KEY AUTOINCREMENT");
        Columns.add("USER TEXT NOT NULL ");
        Columns.add("TYPE TEXT NOT NULL ");
        Columns.add("LOGIN TEXT NOT NULL ");
        Columns.add("EMAIL TEXT NOT NULL ");
        Columns.add("PASSWORD TEXT NOT NULL ");
        Columns.add("GENDER TEXT NOT NULL ");
        Columns.add("DOB DATE NOT NULL ");
        Columns.add("REGISTERED DATE NOT NULL ");
        //create the table        
        createTable(url, returnSQLCreateTable("USER", Columns));
        ///USER
        
        //USERTYPE
        Columns = new ArrayList();
        
        Columns.add("ID TEXT PRIMARY");
        Columns.add("DESCRIPTION TEXT NOT NULL ");
        //create the table        
        createTable(url, returnSQLCreateTable("USERTYPE", Columns));
        ///USERTYPE
        
        
    }
    
    private boolean createTable(String url, String query)
    {
         try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            stmt.execute(query);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } 
    }
    
    private String returnSQLCreateTable(String TableName, List<String> Columns)
    {
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS ").append(TableName).append(" (\n");
        
        boolean firstAppend = true;
        for (String column : Columns) {
            if (firstAppend) {
                sql.append(column);
                firstAppend = false;
            }
            else{
                sql.append(",\n ").append(column);
            }
        }
        sql.append(");");
        return sql.toString();
    }
}
