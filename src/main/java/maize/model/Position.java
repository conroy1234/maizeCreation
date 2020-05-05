package maize.model;

public class Position {
	
	private int coordinateY;
	private int coordinateX;
		
	public Position(int coordinateY, int coordinateX) {		
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
	}
	
	public int getCoordinateX() {
		return coordinateX;
	}
	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}
	public int getCoordinateY() {
		return coordinateY;
	}
	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}

	@Override
	public String toString() {
		return "Position [coordinateX=" + coordinateX + ", coordinateY=" + coordinateY + "]";
	}
	
	
	
	
}
