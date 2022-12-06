package vh.helper;

public class Utility {
	
	public static int GetHypoDistance( int x1, int y1, float x2, float y2) {
		
		float xDifference = Math.abs(x1-x2);
		float yDifference = Math.abs(y1-y2);
		
		return (int) Math.hypot(xDifference, yDifference);
	}
}
