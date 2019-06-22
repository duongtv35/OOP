package DAy3;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double delta(){
        double  delta = b*b- 4*a*c;
        return  delta;
    }
    public void result(){
        if(this.delta()>0){
            double x1 = (-a +Math.sqrt(this.delta())/2*a);
            double x2 = (-a -Math.sqrt(this.delta())/2*a);
            System.out.println("phuong trinh co 2 nghiem la x1 ,x2");
            System.out.println("x1: " +x1);
            System.out.println("x2: " +x2);
        }
        else if(this.delta()==0){
            double x = -b/(2*a);
            System.out.println("phuong trinh co nghiem kep x1 = x2 = "+ x);

        }
        else {
            System.out.println("phuong trinh vo nghiem");
        }

    }

    public static void main(String[] args) {
        QuadraticEquation QE = new QuadraticEquation(4,5,-1);
        QE.delta();
        QE.result();
    }
}
