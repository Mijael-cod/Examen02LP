
package upeu.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author admin
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Productos {
    private int idproducto;
    private String nombre;
    private int precio;
    private double stock;
    private int idcategoria;
}
