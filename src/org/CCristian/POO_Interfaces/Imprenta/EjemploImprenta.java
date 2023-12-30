package org.CCristian.POO_Interfaces.Imprenta;

import org.CCristian.POO_Interfaces.Imprenta.Modelo.*;

import static org.CCristian.POO_Interfaces.Imprenta.Modelo.Genero.*;
import static org.CCristian.POO_Interfaces.Imprenta.Modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Resumen laboral",new Persona("Cristian","Cristaldo"),"Analista de Sistemas");
        cv.addExperiencias("JAVA")
        .addExperiencias("Oracle DB")
        .addExperiencias("Spring Framework")
        .addExperiencias("Desarrollador Fullstack")
        .addExperiencias("Angular");

        Informe informe = new Informe("Informe de Micro-Servicios",new Persona("Cristian","Cristaldo"),new Persona("Cristian","Alejandro"));

        Libro libro = new Libro(new Persona("Ercih","Gama"),"Patrones de Diseño: Elem. reeusables POO",PROGRAMACIÓN);
        libro.addPaginas(new Pagina("Patron SINGLETON"))
                .addPaginas(new Pagina("Patron OBSERVADOR"))
                .addPaginas(new Pagina("Patron FACTORY"))
                .addPaginas(new Pagina("Patron COMPOSITE"))
                .addPaginas(new Pagina("Patron FACADE"));


        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
        System.out.println(TEXTO_DEFECTO);

        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de una clase anónima";
            }
        });
    }

}
