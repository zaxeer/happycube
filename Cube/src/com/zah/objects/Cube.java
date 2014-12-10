package com.zah.objects;

public class Cube {
	private Side[] sides = new Side[6];
		
	/**
	 * Cubes are created by static methods
	 */
	private Cube() {
		
	}
	
	public static Cube createBlueCube() {
		Cube blueCube = new Cube();
		blueCube.sides[0] = new Side( new int[][] {
				{0,0,1,0,0},
				{0,1,1,1,0},
				{1,1,1,1,1},
				{0,1,1,1,0},
				{0,0,1,0,0}
		});
		
		blueCube.sides[1] = new Side( new int[][] {
				{1,0,1,0,1},
				{1,1,1,1,1},
				{0,1,1,1,0},
				{1,1,1,1,1},
				{1,0,1,0,1}
		});
		
		blueCube.sides[2] = new Side( new int[][] {
				{0,0,1,0,0},
				{0,1,1,1,1},
				{1,1,1,1,0},
				{0,1,1,1,1},
				{0,0,1,0,0}
		});
		
		blueCube.sides[3] = new Side( new int[][] {
				{0,1,0,1,0},
				{1,1,1,1,0},
				{0,1,1,1,1},
				{1,1,1,1,0},
				{1,1,0,1,0}
		});
		
		blueCube.sides[4] = new Side( new int[][] {
				{0,1,0,1,0},
				{1,1,1,1,1},
				{0,1,1,1,0},
				{1,1,1,1,1},
				{1,0,1,0,0}
		});
		
		blueCube.sides[5] = new Side( new int[][] {
				{0,1,0,1,0},
				{0,1,1,1,1},
				{1,1,1,1,0},
				{0,1,1,1,1},
				{1,1,0,1,1}
		});
		return blueCube;
	}

	public Side[] getSides() {
		return sides;
	}

	public void setSides(Side[] sides) {
		this.sides = sides;
	}
}
