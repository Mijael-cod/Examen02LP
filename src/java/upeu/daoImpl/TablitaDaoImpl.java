/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import upeu.config.Conexion;
import upeu.dao.TablitaDAO;
import upeu.entity.Tablitauwu;

/**
 *
 * @author alarc
 */
public class TablitaDaoImpl implements TablitaDAO{
private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(Tablitauwu tablita) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Tablitauwu tablita) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int idventa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Tablitauwu read(int idventa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Tablitauwu> readAll() {
        
        String SQL = "SELECT ventas.idventa AS \"id\", sucursales.direccion AS \"sucursal\",personas.nombres AS \"vendedor\",ventas.fecha AS \"fecha\" FROM ventas,sucursales,personas ORDER BY 1";
        List<Tablitauwu> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Tablitauwu v = new Tablitauwu();
                v.setIdventa(rs.getInt("id"));
                v.setSucursal(rs.getString("sucursal"));
                v.setVendedor(rs.getString("vendedor"));
                
                v.setFecha(rs.getString("fecha"));

                lista.add(v);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }
    }
    

