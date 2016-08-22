package factory.exemplo1.factory;

import factory.exemplo1.shape.Forma;

/**
 * Created by gleidesilva on 22/08/16.
 */
public class MainFactory {

    public static void main(String [] args){
        //Cria um fábrica de desenho
        FabricaDesenho fabricaDesenho = new FabricaDesenho();

        //Cria uma instancia de forma pegando o desenho de um Circulo da Fabrica de Desenho
        Forma circulo = fabricaDesenho.getdForma("Circulo");

        //Chama o metodo que desenha
        circulo.desenha();

        //Cria uma instancia de forma pegando o desenho de um Retangulo da Fabrica de Desenho
        Forma retangulo = fabricaDesenho.getdForma("Retangulo");

        //Chama o metodo que desenha
        retangulo.desenha();

        //Cria uma instancia de forma pegando o desenho de um Quadrado da Fabrica de Desenho
        Forma quadrado = fabricaDesenho.getdForma("Quadrado");

        //Chama o metodo que desenha
        quadrado.desenha();
    }
}
