class Area {
	int l, b;

	Area(int l, int b) {
		this.l = l;
		this.b = b;
		System.out.println("inside constructor area of rectangle : " + (l * b));
	}

	public void getArea() {
		System.out.println("inside method area of rectangle : " + (l * b));
	}
}

class Rectanlge {
	int l, b;

	Rectanlge(Area s) {
		this.l = s.l;
		this.b = s.b;
		System.out.println("inside constructor area of rectangle : " + (l * b));
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		Area s = new Area(12, 2);
		s.getArea();
//		Rectanlge r = new Rectanlge(s);
	}
}
