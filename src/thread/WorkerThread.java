package thread;

/**
 * Created by zhangjunxu on 1/11/18.
 */

class WorkerThread implements Runnable {
    private String message;

    public WorkerThread(String s) {
        this.message = s;
    }

    public void run() {
      //  System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
      //  processmessage();//call processmessage method that sleeps the thread for 2 seconds
      //  System.out.println(Thread.currentThread().getName() + " (End)");//prints thread name
    }

    private void processmessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void finalize() {
        System.out.println("object is garbage collected");
    }
}
