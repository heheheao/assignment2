package thread;

/**
 * Created by zhangjunxu on 1/11/18.
 */
public class ThreadExt extends Thread{
    @Override
    public void run() {
        System.out.println("thread Ext");
    }

    public static void main(String[] args) {
        ThreadExt mThreadExt = new ThreadExt();
        mThreadExt.start();
    }
}
