package com.uni.proyecto.proyecto_bd_2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
//import com.uni.proyecto.proyecto_bd_2.BD.DatabaseHelper
//import java.sql.CallableStatement
//import java.sql.SQLException
import com.uni.proyecto.proyecto_bd_2.databinding.FragmentHomeBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Llamar a la función al cargar el fragment
        //obtenerResultado()

        return root
    }

  /*  private fun obtenerResultado() {
        // Ejecutar en segundo plano para no bloquear el hilo principal
        GlobalScope.launch(Dispatchers.IO) {
            val resultado = ejecutarFuncion("Juan")

            // Actualizar el UI en el hilo principal
            launch(Dispatchers.Main) {
                binding.textHome.text = resultado
            }
        }
    }


    private fun ejecutarFuncion(nombre: String): String {
        val connection = DatabaseHelper.getConnection()
        var result = ""

        if (connection != null) {
            try {
                val callableStatement: CallableStatement = connection.prepareCall("{? = call nombre_usuario_vr(?)}")

                // Registrar el parámetro de salida (el resultado de la función)
                callableStatement.registerOutParameter(1, java.sql.Types.VARCHAR)

                // Establecer el parámetro de entrada
                callableStatement.setString(2, nombre)

                // Ejecutar la función
                callableStatement.execute()

                // Obtener el resultado de la función
                result = callableStatement.getString(1)
            } catch (e: SQLException) {
                e.printStackTrace()
            } finally {
                DatabaseHelper.closeConnection()
            }
        }

        return result
    }*/


}