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
import upeu.dao.DetallesDAO;
import upeu.entity.Detalles;

public class DetallesDaoImpl implements DetallesDAO {

    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    @Override
    public int create(Detalles detalles) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Detalles detalles) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(int iddetalles) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Detalles read(int iddetalles) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Detalles> readAll() {
        String SQL = "Select *from detalles";
        List<Detalles> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Detalles d = new Detalles();
              d.setIddetalles(rs.getInt("iddetalle"));
              d.setIdventa(rs.getInt("idventa"));
              d.setIdproducto(rs.getInt("idproducto"));
              d.setPrecio(rs.getDouble("precio"));
              d.setCantidad(rs.getInt("cantidad"));

                lista.add(d);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return lista;
    }

}
