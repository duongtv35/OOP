package DAy3;

import java.util.Scanner;

public class Retangle {
    double width,height;

    public Retangle() {

    }

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }



    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeters(){
        return (this.height+this.width)*2;
    }
    public String display(){
        return "Retangle{" + "width: " +this.width + "height: " +this.height +"}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        double width = scanner.nextDouble();
        System.out.println("enter height");
        double height = scanner.nextDouble();
        Retangle retangle = new Retangle(width,height);
        System.out.println(retangle.display());
        System.out.println("the area is " +retangle.getArea());
        System.out.println("the perimeter is: " + retangle.getPerimeters());
    }
}
