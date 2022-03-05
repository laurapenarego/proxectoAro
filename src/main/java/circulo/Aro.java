package circulo;

/**
 * Representación dun aro
 * @author Laura
 */
public class Aro {

    /**
     *@value 0.0
     */
    public static final double MINIMO = 0.0;

    /**
     * 
     *@value 0.0 
     */
    public final double LIMITERADIO = 0.0;

    private int coordenadaX;
    private int coordenadaY;
    private double radio;

    /**
     *Crea un aro cos valores a 0.
     */
    public Aro() {
    }

    /**
     * Crea un aro e da valores aos atributos.
     * @param valorX valor da coordenadaX
     * @param valorY valor da coordenadaY
     * @param valorRadio valor do radio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }
     /**
     * Obtén a coordenadaX
     * @return coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Establece a coordenadaX
     * @param coordenadaX 
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Obén a coordenadaY
     * @return  coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Establece a coordenadaY
     * @param coordenadaY  
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Obtén o radio
     * @return radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece o valor de radio.
     * Comproba se é menor que a constante MÍNIMO(0.0) e, de ser o caso, igualao a esta. 
     * @param radio 
     */
    
    public void setRadio(double radio) {
       if(radio < MINIMO){
           this.radio = MINIMO;
       } else{
           this.radio = radio;
       }     
    }
   
    /**
     * Obtén o valor do diámetro
     * @return diámetro
     */
    public double obterDiametro() {
        return getRadio() * 2;
    }

    /**
     * Obtén o valor da circunferencia 
     * @return circunferencia
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    /**
     * Obtén o valor da superficie.
     * @return superficie
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     * Representa o aro nun String.
     * @return a representación do aro nunha cadea de caracteres.
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Traslada o centro da circunferencia
     * @param trasladarX valor que se suma á coordenadaX
     * @param trasladarY valor que se suma á coordenadaY
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }
}