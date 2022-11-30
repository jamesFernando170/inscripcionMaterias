package Modelo;

import java.util.HashMap;
import java.util.List;

public class ProcesoInscripciones {
    private HashMap<String, Estudiante> estudiantes;
    private LectorArchivo lector;

    public List<String> procesarArchivo(String ruta) {
        return null;
    }

    private void procesarLinea(String linea) {
        String[] datosEstudiante = linea.split(",");

        if (datosEstudiante.length != 4) {
            // ERROR_LOG
            System.out.println("ERROR");
        } else {
            String cedula = datosEstudiante[0];

            if (buscarEstudiante(cedula) == null) {
                System.out.println("NO EXISTE");
            } else {
                String nombreEstudiante = datosEstudiante[2];
                Estudiante estudiante = new Estudiante(cedula, nombreEstudiante);
                estudiantes.put(cedula, estudiante);
                estudiante.adicionarMateria(datosEstudiante[3]);
            }

        }

    }

    private Estudiante buscarEstudiante(String cedula) {
        return null;
    }
}
