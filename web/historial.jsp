<%@ page import="java.util.List" %>
<%@ page import="Modelos.CamionDAO" %>
<%@ page import="Modelos.Camion" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Historial de Camiones</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #000;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>Historial de Camiones</h1>
    <table>
        <tr>
            <th>ID Camión</th>
            <th>Modelo</th>
            <th>Marca</th>
            <th>Placa</th>
            <th>Estado</th>
        </tr>
        <%
            // Instancia de CamionDAO para obtener los camiones
            CamionDAO camionDAO = new CamionDAO();
            List<Camion> camiones = camionDAO.obtenerCamiones();
            for (Camion camion : camiones) {
        %>
        <tr>
            <td><%= camion.getIdCamion() %></td>
            <td><%= camion.getModelo() %></td>
            <td><%= camion.getMarca() %></td>
            <td><%= camion.getPlaca() %></td>
            <td><%= camion.getEstado() %></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
