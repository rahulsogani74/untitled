package random;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class CustomThreadPool {

    private BlockingQueue<Runnable> queue;
    private int poolSize;

    public CustomThreadPool(int poolSize) {
        this.poolSize = poolSize;
        queue = new LinkedBlockingDeque();
        for (int i =0; i< poolSize ; i++) {
            Worker worker = new Worker(queue);
            new Thread(worker).start();
        }
    }

    public void execute(Runnable workItem) {
        try {
            queue.put(workItem);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
