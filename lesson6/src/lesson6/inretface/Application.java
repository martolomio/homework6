package lesson6.inretface;

public class Application {

	public static void main(String[] args) {
		
		WorkerHourlyWage worker1 = new WorkerHourlyWage(9, 22.9, 30);
		System.out.println(worker1);
		worker1.salary();
		
		System.out.println();
		
		WorkerMounthlyWage worker2 = new WorkerMounthlyWage(7054.99);
		System.out.println(worker2);
		worker2.salary();
	}

}
