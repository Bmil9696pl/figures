 package Triangle;

import Point.Point;

public class Triangle implements ITriangle {
    Point [] points = new Point[3];

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        points[0] = new Point(x1,y1);
        points[1] = new Point(x2,y2);
        points[2] = new Point(x3,y3);
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
     * @return circuit of the triangle
     */
    @Override
    public double circuit() {
        double a = points[0].distance(points[1].getPoint());
        double b = points[1].distance(points[2].getPoint());
        double c = points[2].distance(points[0].getPoint());
        return a+b+c;
    }

    /**
     * @return field of the triangle
     */
    @Override
    public double field() {
        double [] a = points[0].getPoint();
        double [] b = points[1].getPoint();
        double [] c = points[2].getPoint();
        return Math.abs((b[0] - a[0])*(c[1] - a[1]) - (b[1] - a[1])*(c[0] - a[0]))/2;
    }

    /**
     * calculates the height of the triangle from n-th point
     * @param n - number of the poin
     * @return the height
     */
    @Override
    public double height(int n) { //h = 2P/a
        Point [] pointss = new Point[2];
        int j = 0;
        for (int i = 0; i<3; i++){
            if (i!=n){
                pointss[j] = points[i];
                j++;
            }
        }
        double p = field();
        double a = pointss[0].distance(pointss[1].getPoint());
        return (2*p)/a;
    }
}
