package thread;

/**
 * Created by zhangjunxu on 1/11/18.
 */
public class JavaThreadPoolExample {
    public static void main(String[] args) {
//        ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads
//        for (int i = 0; i < 10; i++) {
//            Runnable worker = new WorkerThread("" + i);
//            executor.execute(worker);//calling execute method of ExecutorService
//        }
//        executor.shutdown();
//        while (!executor.isTerminated()) {
//        }

        WorkerThread workerThread = new WorkerThread("");
        workerThread = null;
        System.gc();
        System.out.println("Finished all threads");
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
