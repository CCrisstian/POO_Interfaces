package org.CCristian.POO_Interfaces.Imprenta.Modelo;

abstract public class Hoja{

/*------------------ATRIBUTOS--------------------*/
    protected  String contenido;
/*------------------ATRIBUTOS--------------------*/


/*------------------CONSTRUCTOR--------------------*/
    public Hoja(String contenido) {
        this.contenido = contenido;
    }
/*------------------CONSTRUCTOR--------------------*/


/*------------------MÉTODOS--------------------*/
    abstract public String imprimir();
/*------------------MÉTODOS--------------------*/


}
