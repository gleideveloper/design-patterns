package creational_patterns.factory.factory_method.exemplo1.shape;

/**
 * Created by gleidesilva on 22/08/16.
 */
public class Quadrado implements Forma {
    @Override
    public void desenha() {
        System.out.println("Desenhando um Quadrado");
    }
}
