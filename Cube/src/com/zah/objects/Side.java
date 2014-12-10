package com.zah.objects;

/**
 * @author zahahm
 * Sides of Cube are six.
 */
public class Side {

	/**
	 * All four sided edges data.
	 */
	private Edge[] edges = new Edge[4];
	private int[][] matrix = null;

	/**
	 * Default Constructor.
	 * 
	 * @param this.matrix
	 */
	public Side(int[][] input) {
		this.matrix = input;
		makeEdges();
	}
	
	private void makeEdges() {
		edges[0] = new Edge(new int[]{ this.matrix[0][0],this.matrix[1][0],this.matrix[2][0],this.matrix[3][0], this.matrix[4][0]}); 
		edges[1] = new Edge(new int[]{ this.matrix[0][0],this.matrix[0][1],this.matrix[0][1],this.matrix[0][3], this.matrix[0][4]});
		edges[2] = new Edge(new int[]{ this.matrix[0][4],this.matrix[1][4],this.matrix[2][4],this.matrix[3][4], this.matrix[4][4]});
		edges[3] = new Edge(new int[]{ this.matrix[4][0],this.matrix[4][1],this.matrix[4][1],this.matrix[4][3], this.matrix[4][4]});
	}
	
	public void rotate90Degree() {
		final int M = matrix.length;
	    final int N = matrix[0].length;
	    int[][] ret = new int[N][M];
	    for (int r = 0; r < M; r++) {
	        for (int c = 0; c < N; c++) {
	            ret[c][M-1-r] = matrix[r][c];
	        }
	    }
	    matrix = ret;
	    makeEdges();
	}
	
	public void printSide() {
		for(int i = 0; i<5 ; ++i) {
			for(int j = 0; j<5 ; ++j) {
				if(matrix[i][j] == 1) {
					String s = "\u2588\u2588";
					System.out.print(s);
				} else {
					System.out.print("  ");
				}				
			}
			System.out.println("");
		}
		System.out.println("");
	}
}
