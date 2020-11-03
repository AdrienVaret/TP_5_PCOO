package test;

public class ResultHexagon implements Comparable<ResultHexagon>{

	private int index;
	private double value;
	
	public ResultHexagon(int index, double value) {
		this.index = index;
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
	
	@Override
	public int compareTo(ResultHexagon o) {
		if (value < o.getValue())
			return -1;
		else if (value == o.getValue())
			return 0;
		else
			return 1;
	}
	
	@Override
	public String toString() {
		return "( " + index + " : " + value + ")";
	}
}
