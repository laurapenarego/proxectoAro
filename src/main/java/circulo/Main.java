package circulo;

import java.text.DecimalFormat;

/**
 * Clase que fai probas para a clase Aro
 * @author Laura
 */
public class Main {

    /**
     * Instancia un Aro ao que lle pasa parámetros para establecer o valor dos atributos.
     * Garda na variable saida, de tipo String,  os valores dos atributos.
     * Posteriormente restablece os valores. Instancia un DecimalFormal para aumentar o número de decimais a dous.
     * Concatena na variable saida o diámetro, a circunferencia e área do Aro, 
     * chamándo aos métodos que os calculan. 
     * Finalmente imprime o valor de saida.
     * @param args
     */
    public static void main(String[] args) {
        Aro circulo = new Aro(37,43,2.5);
        String saida =
                "A coordenada X é "+circulo.getCoordenadaX()+
                "\nA coordenada Y é "+circulo.getCoordenadaY()+
                "\nO radio é "+circulo.getRadio();
        circulo.setCoordenadaX(35);
        circulo.setCoordenadaY(20);
        circulo.setRadio(4.2);
        DecimalFormat dousDixitos = new DecimalFormat("0.00");
        saida+="\nO diámetro é "+dousDixitos.format(circulo.obterDiametro());
        saida+="\nA circunferencia é "+dousDixitos.format(circulo.obterCircunferencia());
        saida+="\nA área é "+dousDixitos.format(circulo.obterSuperficie());
             
        System.out.println(saida);
        System.exit(0);
    }

}