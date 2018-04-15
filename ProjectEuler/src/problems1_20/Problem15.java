package problems1_20;

import util.GenericProblem;

public class Problem15 implements GenericProblem {

	
	private static int num_paths = 0;
	private final static int MAX_X =4;
	private final static int MAX_Y =4;
	@Override
	public Number execProb() {
		visitPoint(0, 0);
		return num_paths;
	}

	
	public static void main(String[] args) {
		new Problem15().exec();
	}
	
	private void visitPoint (int x, int y) {
	//	System.out.println("visit ("+x+","+y+")");
		if ((x==MAX_X)&&(x==MAX_Y)) {
			num_paths++;
			System.out.println("found path:"+num_paths);
			return;
		}
		if(x<MAX_X) {
			visitPoint(x+1, y);
		}
		if(y<MAX_Y) {
			visitPoint(x, y+1);
		}
	}
}
