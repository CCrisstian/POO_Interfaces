package org.CCristian.POO_Interfaces.Imprenta.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

/*------------------ATRIBUTOS--------------------*/
    private List<Imprimible> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;
/*------------------ATRIBUTOS--------------------*/


/*------------------CONSTRUCTOR--------------------*/
    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }
/*------------------CONSTRUCTOR--------------------*/


/*------------------MÉTODOS--------------------*/
    public Libro addPaginas(Imprimible pagina){
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nTitulo :").append(this.titulo);
        sb.append("\nAutor: ").append(this.autor);
        sb.append("\nGenero: ").append(this.genero);

        for (Imprimible pag: this.paginas){
            sb.append(pag.imprimir()).append("\n");
        }

        return sb.toString();
    }
/*------------------MÉTODOS--------------------*/

}
