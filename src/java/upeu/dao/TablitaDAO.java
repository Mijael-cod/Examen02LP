/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import upeu.entity.Tablitauwu;

/**
 *
 * @author alarc
 */
public interface TablitaDAO {
     int create(Tablitauwu tablita);

    int update(Tablitauwu tablita);

    int delete(int idventa);

    Tablitauwu read(int idventa);

    List<Tablitauwu> readAll();
}
