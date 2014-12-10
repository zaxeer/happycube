package com.zah.objects;

/**
 * @author zahahm
 *
 */
public class Edge {

	/**
	 * Each edge contains five cells to represent the edge of
	 */
	private int[] cells;

	private boolean isConnected;

	public int[] getCells() {
		return cells;
	}

	public void setCells(int[] cells) {
		this.cells = cells;
	}

	public boolean isConnected() {
		return isConnected;
	}

	public void setConnected(boolean isConnected) {
		this.isConnected = isConnected;
	}

	/**
	 * Constructor
	 * 
	 * @param cells
	 */
	public Edge(int[] cells) {
		this.cells = cells;
	}

	public boolean canJoin(Edge otherEdge) {
		for (int pos = 0; pos < 5; ++pos) {
			if ((this.cells[pos] == 1 && otherEdge.cells[pos] == 1)
					|| (this.cells[pos] == 0 && otherEdge.cells[pos] == 0 && 0 < pos && pos < 4)) {
				return false;
			}
		}
		return true;
	}

}
