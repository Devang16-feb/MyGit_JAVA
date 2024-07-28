public class Operations {
    public static void main(String[] args) {
        Complex C1 = new Complex(2,3);
        C1.PrintComp();
        
        Complex C2 = new Complex(9,3);
        C2.PrintComp();
        
        Complex C3 = new Complex();
        
        C3 = C3.Add(C1, C2);
        System.out.print("Sum of");
        C3.PrintComp();
        
        C3 = C3.Sub(C1, C2);
        System.out.print("Subtraction of ");
        C3.PrintComp();
        
        C3 = C3.Mul(C1, C2);
        System.out.print("Multiplication of ");
        C3.PrintComp();
    }
}



class Complex{
int real, imaginary;

Complex(){}
Complex(int R, int I){
    real = R;
    imaginary = I;
}
Complex Add(Complex C1, Complex C2) {
    Complex temp = new Complex();
    temp.real = C1.real + C2.real;
    temp.imaginary = C1.imaginary + C2.imaginary;
    return temp;
    
}
Complex Sub(Complex C1, Complex C2) {
    Complex temp = new Complex();
    temp.real = C1.real - C2.real;
    temp.imaginary = C1.imaginary - C2.imaginary;
    return temp;
    
}

Complex Mul(Complex C1, Complex C2) {
    Complex temp = new Complex();
    temp.real = (C1.real)*(C2.real) + (C1.imaginary)*(C2.imaginary);
    temp.imaginary = (C1.real)*(C2.imaginary)+(C1.real)*(C2.imaginary);
    return temp;
    
}

void PrintComp() {
    System.out.println("Complex Number: "+real+"+"+imaginary+"i");
}
}

