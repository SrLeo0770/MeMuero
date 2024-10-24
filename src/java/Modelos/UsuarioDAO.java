/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Lester
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    public Usuario validarUsuario(String correo, String password) {
        Usuario usuario = null;
        try {
            Connection conn = DatabaseConnection.getConnection();
            String query = "SELECT * FROM usuario WHERE correo = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, correo);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                usuario = new Usuario(
                    rs.getInt("idusuario"),
                    rs.getString("nombre"),
                    rs.getString("correo"),
                    rs.getString("roll"),
                    rs.getString("password")
                );
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;
    }

    public void registrarUsuario(Usuario usuario) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String query = "INSERT INTO usuario (nombre, correo, password, roll) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getCorreo());
            stmt.setString(3, usuario.getContrasena());
            stmt.setString(4, usuario.getRoll());

            stmt.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

