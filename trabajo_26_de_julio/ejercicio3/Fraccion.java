package trabajo_26_de_julio.ejercicio3;

/**
 * Clase comercial, hija de Empleado
 *
 * @author DiscoDurodeRoer
 */
public class Fraccion {
private int num;
    private int den;
    private int signo;

    public Fraccion() {
        this.num = 1;
        this.den = 1;
        this.signo = 1;
    }

    public Fraccion(int num, int den) {
        this.num = num;
        this.den = den;
        this.signo = 1;
    }

    public int getNumerador() {
        return num;
    }

    public int getDenominador() {
        return den;
    }
    
    public int getSigno() {
        return signo;
    }
    
    public void setNumerador(int num) {
        this.num = num;
    }

    public void setDenominador(int den) {
        this.den = den;
    }

    public void cambiarSigno() {
        signo *= -1;
    }
    
    public void procesar() {
        if (num >= 0 && den < 0)
            signo = -1;
        else if (num < 0 && den >= 0)
            signo = -1;
        num = Math.abs(num);
        den = Math.abs(den);
    }
    
    public void invertir() {
        int aux = num;
        num = den;
        den = aux;
    }
    
    public void simplificar() {
        System.out.println("Simplificando...");
        int cont = 2;
        while (cont <= Math.abs(num) && cont <= Math.abs(den)) {
            if (num % cont == 0 && den % cont == 0) {
                num = num / cont;
                den = den / cont;
                System.out.println(toString());
            }
            else
                cont++;
        }
        System.out.println("Fin");
    }
    
    public double getResultado() {
        try {
            return (double) num / (double) den;
        } catch (Exception e) {
            System.out.println("Error: División por CERO.");
            return 0;
        }
    }

    @Override
    public String toString() {
        if (signo == 1)
            return "(" + num + "/" + den + ")";
        else
            return "-(" + num + "/" + den + ")";
    }
}
