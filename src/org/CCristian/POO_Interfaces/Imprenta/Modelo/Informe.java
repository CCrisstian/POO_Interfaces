package org.CCristian.POO_Interfaces.Imprenta.Modelo;

public class Informe extends Hoja implements Imprimible{

/*------------------ATRIBUTOS--------------------*/
    private Persona autor;
    private Persona revisor;
/*------------------ATRIBUTOS--------------------*/


/*------------------CONSTRUCTOR--------------------*/
    public Informe(String contenido) {
        super(contenido);
    }

    public Informe(String contenido, Persona autor, Persona revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

/*------------------CONSTRUCTOR--------------------*/


/*------------------MÉTODOS--------------------*/
    @Override
    public String imprimir() {
        return "\nInforme escrito por: "+autor+
                "\nRevisado por: "+revisor+
                "\n\n\t"+ this.contenido;
    }
/*------------------MÉTODOS--------------------*/

}
