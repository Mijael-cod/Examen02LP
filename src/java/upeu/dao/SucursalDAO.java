/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import upeu.entity.Sucursales;

/**
 *
 * @author alarc
 */
public interface SucursalDAO  {
      int create(Sucursales sucursales);
    int update(Sucursales sucursales);
    int delete(int idsucursal);
    Sucursales read(int idsucursales);
    List<Sucursales> readAll();
}
