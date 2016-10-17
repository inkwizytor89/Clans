package construction.point;

public class Point {
	public Double x;
	public Double y;
	
	public Point(Double x, Double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		this.x = 0.0;
		this.y = 0.0;
	}

	public static double distance(Point p1, Point p2) {
		double tmp = (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
		return Math.sqrt(tmp);
	}
}
