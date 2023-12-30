package org.CCristian.POO_Interfaces.Imprenta.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

/*------------------ATRIBUTOS--------------------*/
    private Persona persona;
    private String carrera;
    private List<String> experiencia;
/*------------------ATRIBUTOS--------------------*/


/*------------------CONSTRUCTOR--------------------*/

    public Curriculum(String contenido, Persona persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }
/*------------------CONSTRUCTOR--------------------*/


/*------------------MÉTODOS--------------------*/
    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("\nNombre: ").append(persona);
        sb.append("\nResumen: ").append(this.contenido);
        sb.append("\nProfesión: ").append(this.carrera);
        sb.append("\nExperiencias :");

        for (String exp : this.experiencia){
            sb.append("\n\t- ").append(exp);
        }

        return sb.toString();
    }

    public Curriculum addExperiencias(String ex){
        experiencia.add(ex);
        return this;
    }

/*------------------MÉTODOS--------------------*/

}
