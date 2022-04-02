package Quadrangle;

import Point.Point;
import Triangle.Triangle;

public class Quadrangle implements IQuadrangle {
    Point [] points = new Point[4];

    public Quadrangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        points[0] = new Point(x1, y1);
        points[1] = new Point(x2, y2);
        points[2] = new Point(x3, y3);
        points[3] = new Point(x4, y4);
    }

    @Override
    public Point getPoint(int n) {
        return points[n];
    }

    @Override
    public void setPoint(int n, double x, double y) {
        points[n].setPoint(x, y);
    }

    /**
     * @return circuit of the quadrangle
     */
    @Override
    public double circuit() {
        double a = points[0].distance(points[1].getPoint());
        double b = points[1].distance(points[2].getPoint());
        double c = points[2].distance(points[3].getPoint());
        double d = points[3].distance(points[0].getPoint());
        return a+b+c+d;
    }

    /**
     * @return field of the quadrangle
     */
    @Override
    public double field() {
        double [] A = points[0].getPoint();
        double [] B = points[1].getPoint();
        double [] C = points[2].getPoint();
        double [] D = points[3].getPoint();

        Triangle ABC = new Triangle(A[0], A[1], B[0], B[1], C[0], C[1]);
        Triangle ADC = new Triangle(A[0], A[1], D[0], D[1], C[0], C[1]);

        return ABC.field()+ ADC.field();
    }

    /**
     * caltulates the diagonal of the quadrangle from the chosen point
     * @param n the point
     * @return the diagonal
     */
    @Override
    public double diagonal(int n) {
        int m = (n+2)%4;
        return points[n].distance(points[m].getPoint());
    }
}
