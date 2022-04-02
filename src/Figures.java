import Triangle.Triangle;
import Quadrangle.Quadrangle;
import Sort.Sort;

import java.util.Arrays;

public class Figures {

    public static void main(String[] args) {
        System.out.println("///////////////////////////TROJKATY//////////////////////////////");
        Triangle triangle1 = new Triangle(3, 4, 1, 1, 6, 12);
        Triangle triangle2 = new Triangle(1,1,1,2,2,2);
        Triangle triangle3 = new Triangle(1,1,1,5,6,5);
        Triangle [] triangles = new Triangle[3];
        triangles[0] = triangle1;
        triangles[1] = triangle2;
        triangles[2] = triangle3;
        printTriangles(triangles);
        Sort.sortTriangles(triangles);
        System.out.println("/////////////////////////PO SORTOWANIU////////////////////////////");
        printTriangles(triangles);
        System.out.println("///////////////////PO ZMIANIE WIERZCHOLKA TROJKAT2////////////////");
        triangle2.setPoint(2,100,100);
        printTriangles(triangles);
        System.out.println("/////////////////////////PO SORTOWANIU2///////////////////////////");
        Sort.sortTriangles(triangles);
        printTriangles(triangles);

        int l = 1;
        for (Triangle triangle: triangles){

            System.out.print("WYSOKOSCI ");
            System.out.print(l);
            System.out.println("-EGO TROJKATA");
            System.out.println(triangle.height(0));
            System.out.println(triangle.height(1));
            System.out.println(triangle.height(2));
            l++;
        }
        System.out.println("///////////////////////////CZWOROKATY//////////////////////////////");
        Quadrangle quadrangle1 = new Quadrangle(1,1,2,1,2,2,1,2);
        Quadrangle quadrangle2 = new Quadrangle(6,7,7,10,14,14,5,14);
        Quadrangle quadrangle3 = new Quadrangle(1,1,4,5,9,9,15,13);
        Quadrangle [] quadrangles = new Quadrangle[3];
        quadrangles[0] = quadrangle1;
        quadrangles[1] = quadrangle2;
        quadrangles[2] = quadrangle3;
        printQuadrangles(quadrangles);
        System.out.println("/////////////////////////PO SORTOWANIU////////////////////////////");
        Sort.sortQuadrangles(quadrangles);
        printQuadrangles(quadrangles);
        System.out.println("////////////////PO ZMIANIE WIERZCHOLKA CZWOROKAT3/////////////////");
        quadrangle3.setPoint(0, 5,30);
        printQuadrangles(quadrangles);
        System.out.println("/////////////////////////PO SORTOWANIU2///////////////////////////");
        Sort.sortQuadrangles(quadrangles);
        printQuadrangles(quadrangles);

        l = 0;
        for(Quadrangle quadrangle: quadrangles){
            System.out.print("PRZEKATNE ");
            System.out.print(l);
            System.out.println("-EGO CZWOROKATA");
            System.out.println(quadrangle.diagonal(0));
            System.out.println(quadrangle.diagonal(1));
            l++;
        }
    }

    private static void printQuadrangles(Quadrangle[] quadrangles) {
        for(Quadrangle quadrangle: quadrangles){
            System.out.print(Arrays.toString(quadrangle.getPoint(0).getPoint()));
            System.out.print(Arrays.toString(quadrangle.getPoint(1).getPoint()));
            System.out.print(Arrays.toString(quadrangle.getPoint(2).getPoint()));
            System.out.print(Arrays.toString(quadrangle.getPoint(3).getPoint()));
            System.out.println(quadrangle.field());
        }
    }

    private static void printTriangles(Triangle[] triangles) {
        for (Triangle triangle: triangles){
            System.out.print(Arrays.toString(triangle.getPoint(0).getPoint()));
            System.out.print(Arrays.toString(triangle.getPoint(1).getPoint()));
            System.out.print(Arrays.toString(triangle.getPoint(2).getPoint()));
            System.out.println(triangle.field());
        }
    }

}
