package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CamionDAO {

    // Método para obtener la lista de camiones desde la base de datos
    public List<Camion> obtenerCamiones() {
        List<Camion> camiones = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();
            String query = "SELECT * FROM camion";  // Obtiene todos los camiones
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                // Crear un objeto Camion para cada fila de resultado
                camiones.add(new Camion(
                    rs.getInt("idCamion"),
                    rs.getString("modelo"),
                    rs.getString("marca"),
                    rs.getString("placa"),
                    rs.getString("estado")
                ));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return camiones;
    }
}
