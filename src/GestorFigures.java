// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class GestorFigures {
    public static void main(String[] args) {
        Figura[] v = new Figura[5];

        v[0] = new Rectangle(5,3);
        v[1] = new Cercle(2);
        v[2] = new Quadrat(4);
        v[3] = new Cercle(3);
        v[4] = new Triangle(2,3);
        
        double area = 0;

        for(int a =0; a < v.length ; a++) {
            area = v[a].Area() + area;
        }

        //double res = suma(v);
        System.out.println("Suma total: " + area);

    }
}
