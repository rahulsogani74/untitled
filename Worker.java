package random;

import java.util.concurrent.BlockingQueue;

public class Worker implements Runnable{
    private BlockingQueue<Runnable> queue;

    public Worker(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true) {
            if (!queue.isEmpty()) {
                Runnable work = queue.poll();
                work.run();
            }
        }
    }
}
