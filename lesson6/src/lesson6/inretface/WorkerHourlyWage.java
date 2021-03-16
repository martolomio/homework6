package lesson6.inretface;

public class WorkerHourlyWage implements Salary {
	
	private int hour ;
	private double salary ;
	private int days ;
	

	public WorkerHourlyWage(int hour, double salary, int days) {
		super();
		this.hour = hour;
		this.salary = salary;
		this.days = days;
	}
	


	public int getHour() {
		return hour;
	}



	public void setHour(int hour) {
		this.hour = hour;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public int getDays() {
		return days;
	}



	public void setDays(int days) {
		this.days = days;
	}



	@Override
	public void salary() {
		System.out.println("Worker hourly wage, your salary for mouth " + (hour * salary) * days);
	
	}



	@Override
	public String toString() {
		return "WorkerHourlyWage [hour=" + hour + ", salary=" + salary + ", days=" + days + "]";
	}



	


	


	
	

}
