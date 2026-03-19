package Task6_Parallel;
import java.util.Vector;
public class CommandQueue implements Queue {
    private Vector<Command> tasks = new Vector<>();
    private boolean shutdown = false;
    public CommandQueue() {
        new Thread(new Worker()).start();
    }
    public void shutdown() {
        shutdown = true;
    }
    @Override
    public synchronized void put(Command cmd) {
        tasks.add(cmd);
        notify();
    }
    @Override
    public synchronized Command take() {
        while (tasks.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return tasks.remove(0);
    }
    private class Worker implements Runnable {
        @Override
        public void run() {
            while (!shutdown) {
                Command cmd = take();
                cmd.execute();
            }
        }
    }
}