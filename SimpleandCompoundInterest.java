package task2;
/*
 * Author:Nishitha
 * program for finding simple interest and compound interest 
 * 
 */

public class SimpleandCompoundInterest {
	
	   int principle;
	   int rateofInterest;
	   int timeperiod;
	    public void Interest(int principle,int rateofInterest,int timepreriod)
	  {
	        this.principle = principle;
	        this.rateofInterest=rateofInterest;
	        this.timeperiod = timeperiod;
	  }
	    public int SimpleInterest(int principle,int rateofInterest,int timepreriod)
	    { 
	    	Interest(principle,rateofInterest,timepreriod);
		   return principle*rateofInterest*timeperiod/100;
	    }
	    public double CompoundInterest(int principle,int rateofInterest,int timepreriod)
	    { 
	    	Interest(principle,rateofInterest,timepreriod);
		return principle *(Math.pow((1 + rateofInterest / 100),timeperiod));  
	    }
	    
	}
	