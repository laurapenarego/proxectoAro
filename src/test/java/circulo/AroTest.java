/**
 * Probas para a clase Circulo
 * @author Laura
 */
package circulo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de test para a clase Aro.
 * @author Laura
 */
public class AroTest {
    
    /**
     * Constructor por defecto
     */
    public AroTest() {
    }
    
    /**
     * Test do método setCoordenadaX.
     */
    @Test
    public void testsetCoordenadaX() {
        System.out.println("test que proba o setCoordenadaX");
        int valorX = 0;
        Aro instance = new Aro();
        instance.setCoordenadaX(valorX);
    }

    /**
     * Test do método getCoordenadaX.
     */
    @Test
    public void testgetCoordenadaX() {
        System.out.println("getCoordenadaX");
        Aro instance = new Aro(0,0,0.1);
        int resultadoEsperado = 0;
        int resultado= instance.getCoordenadaX();
        assertEquals(resultadoEsperado, resultado);
    }

    /**
     * Test do método setCoordenadaY.
     */
    @Test
    public void testsetCoordenadaY() {
        System.out.println("establecerY");
        int valorY = 0;
        Aro instance = new Aro();
        instance.setCoordenadaY(valorY);
    }

    /**
     * Test do método getCoordenadaY.
     */
    @Test
    public void testgetCoordenadaY() {
        System.out.println("setCoordenadaY");
        Aro instance = new Aro(0,0,0.1);
        int resultadoEsperado = 0;
        int resultado= instance.getCoordenadaY();
        assertEquals(resultadoEsperado, resultado);
    }

    /**
     * Test do método setRadio.
     */
    @Test
    public void testsetRadio() {
        System.out.println("setRadio");
        Aro instance = new Aro();
        instance.setRadio(0.0);
        instance.setRadio(0.1);
        instance.setRadio(-0.1);
    }

    /**
     * Test do método getRadio.
     */
    
    @Test
    public void testgetRadio() {
        System.out.println("getRadio");
        Aro instance = new Aro(0,0,0.1);
        double resultado= instance.getRadio();
        assertEquals(0.1, resultado,0);

        instance.setRadio(0.1);
        resultado= instance.getRadio();
        assertEquals(0.1, resultado,0);

        instance.setRadio(-0.1);
        resultado= instance.getRadio();
        assertEquals(0.0, resultado,0);
    }

    /**
     * Test do método obterDiametro.
     */
    @Test
    public void testObterDiametro() {
        System.out.println("obterDiametro");
        Aro instance = new Aro(0,0,0.1);
        double resultado= instance.obterDiametro();
        assertEquals(0.2, resultado,0);
    }

    /**
     * Test do método obterCircunferencia.
     */
    @Test
    public void testObterCircunferencia() {
        System.out.println("obterCircunferencia");
        Aro instance = new Aro(0,0,0.1);
        double resultadoEsperado = 0.6283185;
        double resultado= instance.obterCircunferencia();
        assertEquals(resultadoEsperado, resultado,1e-6);
    }

    /**
     * Test do método obterSuperficie.
     */
    @Test
    public void testObterSuperficie() {
        System.out.println("obterArea");
        Aro instance = new Aro(0,0,0.1);
        double resultadoEsperado = 0.0314159;
        double resultado= instance.obterSuperficie();
        assertEquals(resultadoEsperado, resultado,1e-6);
    }

    /**
     * Test do método trasladarCentro.
     */
    @Test
    public void testTrasladarCentro() {
        System.out.println("trasladarCentro");
        Aro instance = new Aro();
        int resultx=instance.getCoordenadaX();
        int resulty=instance.getCoordenadaY();
        instance.trasladarCentro(5, 6);
        int resultnx = instance.getCoordenadaX();
        int resultny = instance.getCoordenadaY();
        assertEquals(resultx+5, resultnx);
        assertEquals(resulty+6, resultny);
    }
    
}
