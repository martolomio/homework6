package lesson6.inretface;

public class WorkerMounthlyWage implements Salary {
	
	private double mouthSalary ;
	

	public WorkerMounthlyWage(double mouthSalary) {
		super();
		this.mouthSalary = mouthSalary;
	}


	public double getMouthSalary() {
		return mouthSalary;
	}


	public void setMouthSalary(double mouthSalary) {
		this.mouthSalary = mouthSalary;
	}


	@Override
	public void salary() {
		System.out.println("Worker mounthly wage, your salary for mouth " +  mouthSalary );
		
	}


	@Override
	public String toString() {
		return "WorkerMounthlyWage [mouthSalary=" + mouthSalary + "]";
	}
	

}
