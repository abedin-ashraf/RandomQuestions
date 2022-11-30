public class ComplexNumberCalculator {
    public static void main(String[] args) {
        Complex c1 = new Complex(10,20);
        c1.print();
        Complex c2 = new Complex(20,30);
        c1.add(c2);
        c1.print();
    }
}
class Complex {
    int real, imaginary;

    void print() {
        System.out.println(real + "+i" + imaginary);
    }

    Complex(int r, int i) {
        real = r;
        imaginary = i;
    }
    void add(Complex c){
        real = real + c.real;
        imaginary = imaginary + c.imaginary;
    }
}
