class Main {

	public static void main(String[] args) {
		print("32 F is " + FtoC(32) + " C");
		print("Sphere volume (radius 3): " + sphereVolume(3));
		print("Cone volume (radius 3, height 4): " + coneVolume(3, 4));
		print("Distance from (0, 0) to (3, 4): " + distance(0, 0, 3, 4));
	}

	static void print(String text) {
		System.out.println(text);
	}

	static double FtoC(double fahrenheit) {
		return (fahrenheit - 32) * 5.0 / 9.0;
	}

	static double sphereVolume(double radius) {
		return (4.0 / 3.0) * Math.PI * radius * radius * radius;
	}

	static double coneVolume(double radius, double height) {
		return (1.0 / 3.0) * Math.PI * radius * radius * height;
	}

	static double distance(double x1, double y1, double x2, double y2) {
		return Math.hypot(x2 - x1, y2 - y1);
	}
}