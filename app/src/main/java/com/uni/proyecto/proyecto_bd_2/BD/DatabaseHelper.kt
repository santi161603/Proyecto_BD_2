package com.uni.proyecto.proyecto_bd_2.BD

/*
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

object DatabaseHelper {
    private const val DB_URL = "jdbc:oracle:thin:@192.168.1.4:1521:xe"
    private const val USER = "TEST"
    private const val PASSWORD = "123456"

    private var connection: Connection? = null

    // Método para obtener la conexión
    fun getConnection(): Connection? {
        if (connection == null) {
            try {
                // Cargar el driver de Oracle
                Class.forName("oracle.jdbc.OracleDriver")

                // Establecer la conexión
                connection = DriverManager.getConnection(DB_URL, USER, PASSWORD)
            } catch (e: SQLException) {
                e.printStackTrace()
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            }
        }
        return connection
    }

    // Método para cerrar la conexión
    fun closeConnection() {
        try {
            connection?.close()
        } catch (e: SQLException) {
            e.printStackTrace()
        }
    }
}*/
