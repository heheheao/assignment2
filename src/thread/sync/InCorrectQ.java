package threads.sync;
// An incorrect implementation of a producer and consumer.
class InCorrectQ {
	int n;
	synchronized int get() {
		System.out.println("Got: " + n);
		return n;
	}
	synchronized void put(int n) {
		this.n = n;
		System.out.println("Put: " + n);
	}
}
//-------------------------------------------
class Producer implements Runnable {
	InCorrectQ q;
	Producer(InCorrectQ q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}
	public void run() {
		int i = 0;
		while(true) {
			q.put(i++);
		}
	}
}

//------------------------
class Consumer implements Runnable {
	InCorrectQ q;
	Consumer(InCorrectQ q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	public void run() {
		while(true) {
			q.get();
		}
	}
}
//----------------------------------------------
class PC {
	public static void main(String args[]) {
		InCorrectQ q = new InCorrectQ();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Control-C to stop.");
	}
}