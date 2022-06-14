$(document).ready(function () {
    
      listarVentas();
      listarSucursales();
      listarClientes();
     
});
function listarVentas() {

   
    $.get("Tablitauwu", {"opc": 1}, function (data) {

        let x = JSON.parse(data);
        $("#tablita tbody tr").remove();
        for (let i = 0; i < x.length; i++) {
            $("#tablita").append(
                    "<tr><td>" + (i + 1) + "</td><td>" + x[i].idventa + "</td><td>" + x[i].sucursal + 
                    "</td><td>" + x[i].vendedor +"</td><td>"+ x[i].fecha +"</td><td><a href='#'><i class='fa-solid fa-eye'></i></a></td>");
        }

    });
}
function listarSucursales() {
    $.get("SucursalesController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        for (let i = 0; i < x.length; i++) {


       
            $("#producto").append($("<option>", {
                value: x[i],
                text: x[i].direccion

            })
                    );


        }

    });

}
function listarClientes() {
    $.get("ClientesController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        for (let i = 0; i < x.length; i++) {


       
            $("#producto").append($("<option>", {
                value: x[i],
                text: x[i].nombre

            })
                    );


        }

    });

}