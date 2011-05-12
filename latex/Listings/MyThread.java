class MyThread extends Thread {
	static SharedResource shared;

	public static void main(String[] x) throws InterruptedException {
		shared = new SharedResource();
		Thread threads[] = new MyThread[10];
		for (int i = 0; i <= 9; i++) {
			threads[i] = new MyThread();
			threads[i].start();
		}
		for (Thread t : threads) {
			while (t.isAlive()) {
				sleep(20);
			}
			t.join();
		}
		System.out.println(shared.sum);
	}

	public void run() {
		for (int i = 1; i <= 10000; i++) {
			shared.inc();
		}
	}
}

class SharedResource {
	protected int sum = 0;

	public int inc() {
		return sum++;
	}
}