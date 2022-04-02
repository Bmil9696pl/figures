package Point;

public class Point implements IPoint{
    double[] point = new double[2];


    public Point(double x, double y){
        point[0] = 0;
        point[1] = 0;
        setPoint(x,y);
    }

    @Override
    public double[] getPoint() {
        return point;
    }

    @Override
    public void setPoint(double x, double y) {
        point[0] = x;
        point [1] = y;
    }

    /**
     * calculates the distance between point this method is used on and the point in the parameter
     * @param point2 - the second point
     * @return the distance
     */
    @Override
    public double distance(double [] point2) {
        return Math.sqrt(Math.pow((point2[0] - point[0]),2) + Math.pow((point2[1] - point[1]), 2));
    }
}
