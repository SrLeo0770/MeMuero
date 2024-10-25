<%-- 
    Document   : agregarBodega
    Created on : 24/10/2024, 9:09:31 p. m.
    Author     : mmora
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agregar Bodegas</title>
    <script>
        function cargarPredios() {
            var xhr = new XMLHttpRequest();
            xhr.open('GET', 'PrediosJSONServlet', true);
            xhr.onload = function() {
                if (this.status === 200) {
                    var predios = JSON.parse(this.responseText);
                    var select = document.getElementById("predio");
                    predios.forEach(function(predio) {
                        var option = document.createElement("option");
                        option.value = predio.idpredio;
                        option.text = predio.nombre;
                        select.add(option);
                    });
                }
            };
            xhr.send();
        }
        window.onload = cargarPredios;
    </script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Agregar Bodega</h1>
        
        <form action="RegistrarBodega" method="post" class="mt-4">
            
            <div class="mb-3">
                <label for="predio" class="form-label">Seleccione el Predio:</label>
                <select name="predio" id="predio"></select>
            </div>
            
            <div class="mb-3">
                <label for="bodega" class="form-label">Nombre de la Bodega:</label>
                <input type="text" name="bodega" id="bodega" required>
            </div>
            
            <input type="submit" class="btn btn-primary" value="Agregar Bodega">
        </form>
   </div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>    
</body>
</html>
