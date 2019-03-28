/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import clientes.Control.SQLiteConn;
import clientes.View.Main;

/**
 *
 * @author Jonathan
 */
public class Clientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            SQLiteConn conn = new SQLiteConn();
            Main main = new Main();
            main.setVisible(true);
            
        } catch (Exception e) {
            System.out.print("Erro: " + e.getMessage());
        }
    }
    
}
