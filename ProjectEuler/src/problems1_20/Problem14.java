package problems1_20;

import util.GenericProblem;

public class Problem14 implements GenericProblem {

	@Override
	public Number execProb() {
		
		long max_len = 0;
		
		int startNUm = 2;
		int max_num =1000000;
		
		for (int idx = startNUm;idx<=max_num; idx++) {
			long len=1;
			long seq = idx;
			while (true) {
				len++;
				if(seq%2==0){
					seq = seq/2;
					
				}else {
					seq = 3*seq +1;
				}
				
					
				if(seq ==1) {
					if(len>max_len) {
						max_len = len;
						System.out.println("idx:"+idx+" len "+max_len);
					}
					
					break;
				}
			}
		}
		return max_len;
	}

	public static void main(String[] args) {
		new Problem14().exec();
	}

}
