package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String [] args) throws IOException {
		
		double [] R = new double[4];
		
		for (int i = 1 ; i <= 4 ; i++) {
			R[i-1] = (double)(1.0)/((double)(i) * (double)(i));
		}
		
		ArrayList<ResultHexagon> list = new ArrayList<ResultHexagon>();
		
		BufferedReader r = new BufferedReader(new FileReader(new File("data.txt")));
		String line;
		
		while ((line = r.readLine()) != null) {
			String [] splittedLine = line.split(" ");
			
			int index = Integer.parseInt(splittedLine[0]);
			
			double sum = 0;
			
			for (int i = 1 ; i < splittedLine.length ; i++) {
				sum += Double.parseDouble(splittedLine[i]) * R[i - 1];
			}
			
			sum = sum / (double)(16100);
			
			list.add(new ResultHexagon(index, sum));
		}
		
		r.close();
		
		Collections.sort(list);
		
		for (ResultHexagon res : list)
			System.out.println(res);
	}
	
}
