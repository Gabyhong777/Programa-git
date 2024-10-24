
import com.mycompany.jdbc_pagosofa.JDBC_PAGOSOFA;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raul-PC
 */

    
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PagoDAO {

   
     public void insertarPago(Pago pago) throws java.sql.SQLException {
        Connection conn = JDBC_PAGOSOFA.conectar();
        String sql = "INSERT INTO pagos (monto, fecha) VALUES (?, ?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setDouble(1, pago.getMonto());
            statement.setString(2, pago.getFecha());
            statement.executeUpdate();
            System.out.println("Pago insertado exitosamente.");
        } catch (SQLException e) {
        }
    }

    // Método para consultar pagos
    public List<Pago> obtenerPagos() throws java.sql.SQLException {
        Connection conn = JDBC_PAGOSOFA.conectar();
        String sql = "SELECT * FROM pagos";
        List<Pago> pagos = new ArrayList<>();
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = (ResultSet) statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                double monto = resultSet.getDouble("monto");
                String fecha = resultSet.getString("fecha");
                pagos.add(new Pago(id, monto, fecha));
            }
        } catch (SQLException e) {
        }
        return pagos;
    }}

    



