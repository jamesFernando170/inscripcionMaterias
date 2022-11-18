package Modelo;

import java.util.HashSet;
import java.util.Set;

public class Estudiante {
    private String nombre;
    private String cedula;
    private Set<String> codigosMaterias;

    public Estudiante(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigosMaterias = new HashSet<String>();
    }

    /**
     * @param codigoMateria
     * Metodo encargado de adicionar una materia, donde se lo agregara al tipo de lista que tiene
     * el codigo de las materias que el estudiante esta cursando
     */
    public boolean adicionarMateria(String codigoMateria) {
        return false;
    }

    /**
     * Metodo encargado de mostrarnos toda la informacion con respecto al estudiante
     */
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", cedula=" + cedula + ", codigosMaterias=" + codigosMaterias + "]";
    }

}
