package upeu.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Clientes {

    private int idcliente;
    private String nombre;
    private String direccion;
    private String hobby;
    private String correo;
    private int idpersona;

}
