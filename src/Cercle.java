public class Cercle extends Figura {
   double r;
   double area;

    public Cercle(double radio){
        r = radio;
    }

    public double Area(){
        area = r * r * Math.PI;
        System.out.println("Cercle:     " + area);
        return area;
    }

}