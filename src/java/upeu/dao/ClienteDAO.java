/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import upeu.entity.Clientes;

/**
 *
 * @author alarc
 */
public interface ClienteDAO {

    int create(Clientes clientes);

    int update(Clientes clientes);

    int delete(int idcliente);

    Clientes read(int idcliente);

    List<Clientes> readAll();
}
