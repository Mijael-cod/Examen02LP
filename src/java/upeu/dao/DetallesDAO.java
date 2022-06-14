/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import upeu.entity.Detalles;

/**
 *
 * @author alarc
 */
public interface DetallesDAO {
     int create(Detalles detalles);
    int update(Detalles detalles);
    int delete(int iddetalles);
    Detalles read(int iddetalles);
    List<Detalles> readAll();
}
