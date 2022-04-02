package Quadrangle;

import Point.Point;

public interface IQuadrangle {
    public Point getPoint(int n);
    public void setPoint(int n, double x, double y);
    public double circuit();
    public double field();
    public double diagonal(int n);
}
