package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HistorialCamionDAO {

    // Método para obtener el historial de cambios de camiones
    public List<HistorialCamion> obtenerHistorial() {
        List<HistorialCamion> historial = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();
            String query = "SELECT * FROM historial_camion";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                historial.add(new HistorialCamion(
                    rs.getInt("idHistorial"),
                    rs.getInt("idCamion"),
                    rs.getString("cambio"),
                    rs.getTimestamp("fecha"),
                    rs.getString("usuario")
                ));
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return historial;
    }
}
