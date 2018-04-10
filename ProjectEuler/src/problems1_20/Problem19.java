package problems1_20;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAmount;

import util.GenericProblem;

public class Problem19 implements GenericProblem {

	@Override
	public Number execProb() {
		
		
		int numDayFirstMonth =0;
		
		LocalDate curDate = LocalDate.of(1901,1,1);
		LocalDate last = LocalDate.of(2000,12,31);
		
		while(curDate.isBefore(last)){
			if(curDate.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
				numDayFirstMonth++;
			}
			curDate = curDate.plusMonths(1);
		}
		return numDayFirstMonth;
	}

	public static void main(String[] args) {
		new Problem19().exec();

	}

}
