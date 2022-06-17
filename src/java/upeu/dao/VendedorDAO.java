/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import upeu.entity.Vendedor;


public interface VendedorDAO {

    int create(Vendedor vendedor);

    int update(Vendedor vendedor);

    int delete(int idvendedor);

    Vendedor read(int idvendedor);

    List<Vendedor> readAll();
}
