/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import upeu.entity.Tablita;

public interface TablitaDAO {
     int create(Tablita tablita);

    int update(Tablita tablita);

    int delete(int idventa);

    Tablita read(int idventa);

    List<Tablita> readAll();
}
