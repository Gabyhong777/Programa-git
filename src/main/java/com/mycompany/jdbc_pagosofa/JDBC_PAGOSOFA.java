/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jdbc_pagosofa;

/**
 *
 * @author Raul-PC
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_PAGOSOFA{

    // URL de conexión a la base de datos MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_pagos_ofa_gp";  // Cambia 'nombre_base_datos' por el nombre de tu BD
    private static final String USER = "root";  // Usuario de MySQL
    private static final String PASSWORD = "K4NAEriol89720ryok4naeDSBAA4378monday";  // Contraseña de MySQL

    public static Connection getConnection() {
        Connection conn = null;
        try {
           
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos");
        }
        return conn;
    }

    public static void main(String[] args) {
        // Probar la conexión
        JDBC_PAGOSOFA.getConnection();
    }

    public static Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

