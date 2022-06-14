
package upeu.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ventas {
    private int idventas;
    private String fecha;
    private int idusuario;
    private int idcliente;
    private int idsucursal;
    
}
