public class Triangle extends Figura {
    double base;
    double altura;
    double area;
    public Triangle(double b, double a){
        base = b;
        altura = a;
    }

    public double Area(){
        area = base*altura;
        area = area/2;
        System.out.println("Triangle:   " + area);
        return area;
    }

}