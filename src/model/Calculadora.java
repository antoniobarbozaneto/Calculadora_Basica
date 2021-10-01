package model;

/**
 *
 * @author Elio
 */
public class Calculadora {
    
    private Character operador;
    private Float valor1;
    private Float valor2;

    public Calculadora() {
    }
    
     public float Resultado(){
     float valor;
        switch (this.getOperador()){
            case ('+'):
                valor = this.getValor1() + this.getValor2();
                break;
            case ('-'):
                valor = this.getValor1() - this.getValor2();
                break;
            case ('*'):
                valor = this.getValor1() * this.getValor2();
                break;
            case ('/'):
                valor = this.getValor1() / this.getValor2();
                break;
            default: valor = 0;
        }

        return valor;

    }

    /**
     * @return the operador
     */
    public Character getOperador() {
        return operador;
    }

    /**
     * @param operador the operador to set
     */
    public void setOperador(Character operador) {
        this.operador = operador;
    }

    /**
     * @return the valor1
     */
    public Float getValor1() {
        return valor1;
    }

    /**
     * @param valor1 the valor1 to set
     */
    public void setValor1(Float valor1) {
        this.valor1 = valor1;
    }

    /**
     * @return the valor2
     */
    public Float getValor2() {
        return valor2;
    }

    /**
     * @param valor2 the valor2 to set
     */
    public void setValor2(Float valor2) {
        this.valor2 = valor2;
    }
        
}
