public class Complex {
    private float real = 0.0f;
    private float imag = 0.0f;

    public Complex(float real, float imag){
        setReal(real);
        setImag(imag);
    }
    public Complex(){
    }
    public Complex(Complex other) {
        setReal(other.getReal());
        setImag(other.getImag());
    }

    @Override
    public String toString(){
        if (this.getImag() >= 0) {
            return getReal() + " + " + getImag() + "i";
        }
        else {
            return getReal() + " - " + Math.abs(this.getImag()) + "i";
        }
    }
    public float getReal() {
        return real;
    }
    public void setReal(float real) {
        this.real = real;
    }
    public float getImag() {
        return imag;
    }
    public void setImag(float imag) {
        this.imag = imag;
    }
    
    public Complex add(Complex other){
        return new Complex(this.getReal() + other.getReal(), this.getImag() + other.getImag());
    }
    public Complex sub(Complex other){
        return new Complex(this.getReal() - other.getReal(), this.getImag() - other.getImag());
    }
    public Complex mul(Complex other){
        return new Complex((this.getReal() * other.getReal() - this.getImag() * other.getImag()),(this.getReal() * other.getImag() + this.getImag() * other.getReal()));
    }
    public Complex div(Complex other) {
        Complex numerator = this.mul(other.conj());
        float denominator = other.getReal() * other.getReal() + other.getImag() * other.getImag();
        return new Complex((numerator.getReal() / denominator), (numerator.getImag() / denominator));
    }
    public Complex conj() {
        return new Complex(this.getReal(), this.getImag()*(-1));
    }
}
