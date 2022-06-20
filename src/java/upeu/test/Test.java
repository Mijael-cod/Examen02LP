/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package upeu.test;

import com.google.gson.Gson;
import upeu.config.Conexion;
import upeu.dao.ClienteDAO;
import upeu.dao.TablitaDAO;
import upeu.dao.VendedorDAO;
import upeu.daoImpl.ClientesDAOImlp;
import upeu.daoImpl.TablitaDaoImpl;
import upeu.daoImpl.VendedorDaoImpl;


public class Test {

static Gson g = new Gson();
    /**
     * @param args the command line arguments
     */
    static Gson gson = new Gson();
    static ClienteDAO clienteDao = new ClientesDAOImlp();
    static VendedorDAO vendedorDAO = new VendedorDaoImpl();
    static TablitaDAO tablitaDAO = new TablitaDaoImpl();
    

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(gson.toJson(clienteDao.readAll()));
        System.out.println("");
        System.out.println(gson.toJson(vendedorDAO.readAll()));
        System.out.println("");
        System.out.println(gson.toJson(tablitaDAO.readAll()));
        
        System.out.println("");
        System.out.println("Hola mundo");
        
        if(Conexion.getConexion()!=null){
            System.out.println("si");
        }else{
            System.out.println("no");
        }

        
    }
    
}
