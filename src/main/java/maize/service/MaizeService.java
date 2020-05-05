package maize.service;

import java.util.LinkedList;
import java.util.List;

import maize.model.Position;

public class MaizeService {

	private static int[][] maize = { { 2, 0, 1, 1 }, { 1, 1, 1, 0 }, { 0, 1, 1, 1 } };

	public static LinkedList<Position> path = new LinkedList<Position>();

	public static int[][] getMaize() {
		return maize;
	}

	public boolean isValid(int y, int x) {
		if (y < 0 || y >= maize.length || x < 0 || x >= maize[y].length) {
			return false;
		}
		return true;

	}

	public void pushOnePosition(Position position) {
		path.push(position);
		;
	}

	public int xPpeek() {
		return path.peek().getCoordinateX();
	}

	public int yPeek() {
		return path.peek().getCoordinateY();
	}

	public int minus_x_cordenates(int y, int x) {
		Position position = new Position(y, x - 1);
		path.push(position);
		return position.getCoordinateY() + position.getCoordinateX();
	}

	public int plus_y_cordenates(int y, int x) {

		Position position = new Position(y + 1, x);
		path.push(position);
		return position.getCoordinateY() + position.getCoordinateX();
	}

	public int minus_y_cordenates(int y, int x) {

		Position position = new Position(y - 1, x);
		path.push(position);
		return position.getCoordinateY() + position.getCoordinateX();
	}

	public int plus_x_cordenates(int y, int x) {

		Position position = new Position(y, x + 1);
		path.push(position);
		return position.getCoordinateY() + position.getCoordinateX();
	}

	public void popping() {
		path.pop();
		if (path.size() <= 0) {
			System.out.println(" No Path");
			return;
		}
	}

	public void print(String message) {
		System.out.println(message);
	}

}
