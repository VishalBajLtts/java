package vishal;
public abstract class Match {
	 int currentscore;
	 float currentover;
	 int target;
	 double reqRunrate;
		int balls;
	 public double getReqRunrate() {
		return reqRunrate;
	}
	public void setReqRunrate(double reqRunrate) {
		this.reqRunrate = reqRunrate;
	}
	public int getBalls() {
		return balls;
	}
	public void setBalls(int balls) {
		this.balls = balls;
	}

	
	
	 public abstract double calculateRunRate(int currentscore,float currentover);
	 public abstract float calculateBalls(float currentover);
	 public abstract double display( int currentscore,int target);
	
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public float getCurrentover() {
		return currentover;
	}
	public void setCurrentover(float currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
		
	
}