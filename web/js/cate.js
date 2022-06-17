$(document).ready(function () {
    
    listarVentas();
    listarSucursales();
   
    listarClientes();
    listarProductos();
    
});
let xx;
let a;
var nombre = [];

function listarVentas() {
    $.get("Tablitauwu", {"opc": 1}, function (data) {
        let x = JSON.parse(data);
        $("#tablita tbody tr").remove();
        for (let i = 0; i < x.length; i++) {
            $("#tablita").append(
                    "<tr><td>" + (i + 1) + "</td><td>" + x[i].idventa + "</td><td>" + x[i].sucursal +
                    "</td><td>" + x[i].vendedor + "</td><td>" + x[i].fecha + "</td><td><a href='#'><i class='fa-solid fa-eye'></i></a></td>");
        }
    });
}
function listarSucursales() {
    $.get("SucursalesController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
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
        for (let i = 0; i < x.length; i++) {



            $("#clientes").append($("<option>", {
                value: x[i].idcliente,
                text: x[i].nombre

            })
                    );


        }

    });

}



function listarClientes() {
    
    $('#cliente option').remove();
    $.get('ClientesController', {opc: 1},(data) => {
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

function listarVendedores() {
    
    $('#vendedor option').remove();
    $.get('VentasController', {opc: 1},(data) => {
        let x = JSON.parse(data);
        
        console.table(x);
        $('#vendedor').append(`  <option value="o" disabled selected>Cliente: </option>`);
        
        x.forEach(
                
        (nombre) => {
            
            $('#vendedor').append(`<option value="${nombre.vendedor}">${nombre.nombres}</option>`);
            
        }       

                );

    });
    
}

function listarProductos() {
    
    
    
    $.get("ProductosController", {"opc": 1}, function (data)
    {
        let x = JSON.parse(data);
        for (let i = 0; i < x.length; i++) {
            
            
            
            $("#productos").append($("<option>", {
                value: x[i],
                text: x[i].nombre
                        
            })
                    );
            
            
        }
        
    });
    
}
let mostrar = () => {
    const valor = $("#productos :selected").val(),
            texto = $("#productos :selected").text();
    $('#productosP').val(texto);
};


$('#productos').change(mostrar);

