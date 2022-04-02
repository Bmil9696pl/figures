package Triangle;

import Point.IPoint;
import Point.Point;

public interface ITriangle {
    public Point getPoint(int n);
    public void setPoint(int n, double x, double y);
    public double circuit();
    public double field();
    public double height(int n);
}
