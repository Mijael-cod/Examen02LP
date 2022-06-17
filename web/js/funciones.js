$(document).ready(function () {

    listarVentas();
    listarSucursales();
    listarClientes4();
    listarProductos();
    listarVendedor();

});

let xx;
let a;
var nombre = [];
let precio;

function listarVentas() {
    $.get("Tablita", {"opc": 1}, function (data) {
        let x = JSON.parse(data);
        $("#tablita tbody tr").remove();
        for (let i = 0; i < x.length; i++) {
            $("#tablita").append(
                    "<tr><td>" + (i + 1) + "</td><td>" + x[i].idventa + "</td><td>" + x[i].sucursal +
                    "</td><td>" + x[i].nombres + "</td><td>" +  x[i].vendedor + "</td><td>" + x[i].fecha + "</td><td><a href='#'> <i class='fa-solid fa-eye'></i> </a></td>");
        }
    });
}

function listarSucursales() {
    $.get("SucursalesController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        console.table(x);
        for (let i = 0; i < x.length; i++) {

        
            $("#sucursal").append($("<option>", {
                value: x[i],
                text: x[i].direccion

            })
                    );
        }

    });

}

function listarClientes4() {
    $.get("ClientesController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        console.table(x);
        for (let i = 0; i < x.length; i++) {


            $("#cliente").append($("<option>", {
                value: x[i].idcliente,
                text: x[i].nombre

            })
                    );
        }

    });

}


function listarClientes() {

    $('#cliente option').remove();
    $.get('ClientesController', {opc: 1}, (data) => {
        let x = JSON.parse(data);

        console.table(x);
        $('#cliente').append(`  <option value="o" disabled selected>Seleccionar Cliente: </option>`);

        x.forEach(
                (nombre) => {

            $('#cliente').append(`<option value="${nombre.cliente}">${nombre.nombres}</option>`);
        }
        );

    });

}

function listarVendedor() {
    $.get("VendedorController", {"opc": 1}, function (data)
    {
        
        let x = JSON.parse(data);
        console.log(data);
        for (let i = 0; i < x.length; i++) {

            $("#vendedorxd").append($("<option>", {
                value: x[i].idvendedor,
                text: x[i].nombres
            })
                    );
        }
    });
}

function listarProductos() {

    $.get("ProductosController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        precio = x;
        
        for (let i = 0; i < x.length; i++) {

            $("#productos").append($("<option>", {
                value: x[i].idproducto,
                text: x[i].nombre

            })
          );
        }

    });

}



let mostrar = () => {
    
    console.log(precio);

    var selected = $("#productos").val();
    console.log(selected);
    precio.forEach(function (elemento, indice, array) {
            console.log(elemento);
        if (parseInt(""+elemento.idproducto) === parseInt(""+selected)) {
            console.log("llega");
            $('#productoP').val(elemento.nombre);
            $('#precioP').val("S/ " + elemento.precio);
            $('#stockP').val(elemento.stock);
        }
    });
};
$('#agregar').click(mostrar);


