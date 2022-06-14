<%-- 
    Document   : exazzz
    Created on : Jun 14, 2022, 3:29:54 PM
    Author     : alarc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="css/bootstrap.min.css"/>
    </head>
    <body style="background:  url('') no-repeat; background-size: cover; ">
        <div class="container pt-2">
            <nav class="navbar navbar-expand-lg navbar-light bg-primary ">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-expanded="false">
                                Dropdown
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#">Action</a>
                                <a class="dropdown-item" href="#">Another action</a>
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">Something else here</a>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link disabled">Disabled</a>
                        </li>
                    </ul>
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </div>
            </nav>

            <div class="row pt-4" >
                <div class="col">
                    <div class="form-group">
                        <label for="sucursal" style="background-color:  white; color:#721c24 ">Sucursal:</label>
                        <i class="fa-solid fa-apple-whole"></i>
                        <select name="producto" id="producto" class="form-control">
                            <option value="0">Seleccionar Sucursal</option>
                        </select>
                    </div>

                </div>
                <div class="col">
                    <div class="form-group">
                        <label for="sucursal" style="background-color: white">Cliente:</label>
                        <select name="producto" id="producto" class="form-control">
                            <option value="0">Seleccionar Cliente</option>
                        </select>
                    </div>

                </div>
                <div class="col">
                    <div class="form-group">
                        <label for="sucursal" style="background-color: white">Vendedor:</label>
                        <select name="producto" id="producto" class="form-control">
                            <option value="0">Seleccionar Vendedor</option>
                        </select>
                    </div>

                </div>
                <div class="col">
                    <div class="form-group">
                        <label for="sucursal" style="background-color: white">Producto:</label>
                        <select name="producto" id="producto" class="form-control">
                            <option value="0">Seleccionar Producto</option>
                        </select>
                    </div>

                </div>


            </div>
            <div class="row col-1 col-lg-1">

                <button class="btn btn-danger" type="submit">Agregar</button>

            </div>
            <div class="row pt-4">
                <div class="col">
                    <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                        <option selected>Cantidad</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="1">4</option>
                        <option value="2">5</option>
                        <option value="3">6</option>
                    </select>
                </div>
                <div class="col">
                    <input type="text" class="form-control" placeholder="Producto">
                </div>
                <div class="col">
                    <input type="text" class="form-control" placeholder="Precio">
                </div>
                <div class="col">
                    <input type="text" class="form-control" placeholder="Stock">
                </div>
                <div class="col">
                    <button type="button" class="btn btn-success">Registrar Venta</button>
                </div>
            </div>    
            <br>
            <table class="table table-hover" id="tablita">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">ID</th>
                    <th scope="col">SUCURSAL</th>
                    <th scope="col">VENDEDOR</th>
                    <th scope="col">CLIENTE</th>
                    <th scope="col">FECHA</th>
                    <th scope="col" colspan="2">DETALLE VENTA</th>
                </tr>
            </thead>
            <tbody>                
            </tbody>
        </table>
            
        </div>
        



  
      
        <script src="../js/exazzz.js"></script>

    </body>
</html>
