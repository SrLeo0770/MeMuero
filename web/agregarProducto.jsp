<%-- 
    Document   : register
    Created on : 23 oct 2024, 4:16:49 p.m.
    Author     : Mmorales
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agrecar Predio</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Agregar Productos</h1>
        
        <form action="RegistrarProducto" method="post" class="mt-4">
            <div class="mb-3">
                <label for="nombre" class="form-label">Nombre del Producto</label>
                <input type="text" class="form-control" id="nombre" name="nombre" required>
            </div>
            
    <div class="mb-3">
        <label for="tipoProducto" class="form-label">Tipo de Producto</label>
        <select class="form-control" id="tipo" name="tipo" required>
            <option value="">Seleccione un tipo de producto</option>
            <option value="refrigerado">Refrigerado</option>
            <option value="carga_seca">Carga Seca</option>
        </select>
    </div>

            
            <button type="submit" class="btn btn-primary">Agregar</button>
        </form>
        
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>