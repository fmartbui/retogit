/*
 * Circulo
 */
package geometria;

public class Circulo implements FiguraGeometrica
{
    private double radio;
    private double areaRadio;
    static final double pi = 3.1416; //se cambia el valor de PI de 3.1415 a 3.1416

    public Circulo(double radio)
    {
        this.radio = radio;
    }

    public double getRadio()
    {
        return radio;
    }

    public void setRadio(double radio)
    {
        this.radio = radio;
    }

    public double getAreaRadio()
    {
        return areaRadio;
    }

    @Override
    public void area()
    {
        areaRadio = pi * radio * radio;
    }
}
