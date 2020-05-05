package model;

import java.util.LinkedList;
import java.util.List;

import javax.swing.text.Position;

public class Maze {

	public int[][] maze;
	public List<Position> path = new LinkedList<Position>();
	public Position start;
}
