package com.zah.main;

import com.zah.objects.Cube;
import com.zah.objects.Side;

public class MainTest {

	public static void main(String[] args) {
		Cube blueCube = Cube.createBlueCube();
		for(Side eachSide:blueCube.getSides()) {
			eachSide.printSide();
			eachSide.rotate90Degree();
			eachSide.rotate90Degree();
			eachSide.rotate90Degree();			
			eachSide.printSide();
		}
		
	}
}
