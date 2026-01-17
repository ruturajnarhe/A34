package basic;
class SharedResource {
	volatile static int num = 0;
}
class Ramesh extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(100);
		} catch(Exception e) {
			System.out.println("exception occurred");
		}
		SharedResource.num = 5;
		System.out.println("Ramesh Thread : " + SharedResource.num);
	}
}
class Suresh extends Thread {
	@Override
	public void run() {
		while(SharedResource.num == 0) {
		}
		System.out.println("Suresh Thread : " + SharedResource.num);
	}
}

class VolatileExampleDriver {
	public static void main(String[] args) {
		Ramesh ramesh = new Ramesh();
		Suresh suresh = new Suresh();

		ramesh.start();
		suresh.start();
	}
}