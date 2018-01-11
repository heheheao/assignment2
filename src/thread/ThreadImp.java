package thread;


import static java.lang.Thread.currentThread;

/**
 * Created by zhangjunxu on 1/11/18.
 */
public class ThreadImp implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Impl +" + currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadImp mThreadImp = new ThreadImp();
        Thread mThread = new Thread(mThreadImp);
        mThread.setName("hahahah");
        System.out.print("Thread Impl +" + currentThread().getName());
        mThread.start();
    }
}
