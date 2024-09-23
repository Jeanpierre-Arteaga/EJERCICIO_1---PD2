package PRACTICA_DOMICILIARIA_02.EJERCICIO_1;

public class Complejo {
    // ATRIBUTOS
    private double ParteReal;
    private double ParteImaginaria;
    // CONSTRUCTORES
    public Complejo(){
    }
    public Complejo(double a,double b){
        ParteReal = a;
        ParteImaginaria = b;
    }
    // METODOS SETTERS
    public void setParteReal(double a){
        ParteReal = a;
    }
    public void setParteImaginaria(double b){
        ParteImaginaria = b;
    }
    // METODOS GETTERS
    public double getParteReal(){
        return ParteReal;
    }
    public double getParteImaginaria(){
        return ParteImaginaria;
    }
    // METODO DE COMPARACION
    public boolean equals(Complejo c){
        if(this.ParteReal == c.ParteReal){
            if(this.ParteImaginaria == c.ParteImaginaria){
                return true;
            }
            return false;
        }
        return false;
    }
    // METODO DE SUMA
    public Complejo suma(Complejo c){
        Complejo s = new Complejo();
        s.ParteReal = this.ParteReal+c.ParteReal;
        s.ParteImaginaria = this.ParteImaginaria+c.ParteImaginaria;
        return s;
    }
    // METODO DE RESTA
    public Complejo resta(Complejo c){
        Complejo r = new Complejo();
        r.ParteReal = this.ParteReal-c.ParteReal;
        r.ParteImaginaria = this.ParteImaginaria-c.ParteImaginaria;
        return r;
    }
    // METODO DE MULTIPLICACION
    public Complejo producto(Complejo c){
        Complejo m = new Complejo();
        m.ParteReal = this.ParteReal*c.ParteReal-this.ParteImaginaria*c.ParteImaginaria;
        m.ParteImaginaria = this.ParteReal*c.ParteImaginaria+this.ParteImaginaria*c.ParteReal;
        return m;
    }
    // METODO DE DIVISION
    public Complejo division(Complejo c){
        Complejo d = new Complejo();
        double denominador = Math.pow(c.ParteReal,2)+Math.pow(c.ParteImaginaria,2);
        d.ParteReal = (this.ParteReal*c.ParteReal+this.ParteImaginaria*c.ParteImaginaria)/denominador;
        d.ParteImaginaria = (this.ParteImaginaria*c.ParteReal-this.ParteReal*c.ParteImaginaria)/denominador;
        return d;
    }
    // METODO PARA LA SALIDA
    public String toString(){
        return Redondeo(ParteReal)+" + "+Redondeo(ParteImaginaria)+"i";
    }
    // METODO PARA EL REDONDEO DE CIFRAS
    public double Redondeo(double x){
        return Double.parseDouble(String.format("%.3f",x));
    }
}
