/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import upeu.entity.Ventas;

/**
 *
 * @author alarc
 */
public interface VentasDAO {
     int create(Ventas ventas);
    int update(Ventas ventas);
    int delete(int idventas);
    Ventas read(int idventas);
    List<Ventas> readAll();
}
