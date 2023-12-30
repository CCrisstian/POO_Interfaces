package org.CCristian.POO_Interfaces.Imprenta.Modelo;

public interface Imprimible {

/*------------------ATRIBUTOS--------------------*/
    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";
/*------------------ATRIBUTOS--------------------*/


/*------------------MÉTODOS--------------------*/
    default String imprimir(){
        return TEXTO_DEFECTO;
    };

    static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
/*------------------MÉTODOS--------------------*/

}
