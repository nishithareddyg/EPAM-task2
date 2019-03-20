package task2;
/*
 * Author:Nishitha
 * program for estimating construction cost for a house based on various materials
 * 
 */

public class CostEstimator {
	String materials;
	double area;
	boolean automated;
	public CostEstimator() {
	 this.materials=materials;
	 this.area=area;
	 this.automated=automated;
	}
	
	public double calculateCost(String materials,int area,boolean automated) {
		
		double cost=0;
		if (materials.equals("standard"))
			cost=1200*area;
		else if (materials.equals("abovestandard"))
			cost=1500*area;
		else if (materials.equals("highstandard"))
			cost=1800*area;
		else if (materials.equals("highstandard") && automated )
			cost=2500*area;
		return cost;
	}

}
