
package upeu.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Detalles {
    private int iddetalles;
    private int idventa;
    private int idproducto;
    private double precio; 
    private int cantidad;
}
