
import java.util.concurrent.*;

public class ConsumerProducerUsingBlockingQueue {

    private static ArrayBlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(2);

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(new ProducerTask());
        executor.execute(new Consumertask());
        executor.shutdown();
    }

    public static class ProducerTask implements Runnable {

        public void run() {
            try {
                int i = 1;
                while (true) {
                    System.out.println("Producer writes " + i);

                    buffer.put(i++);

                    Thread.sleep((int) (Math.random() * 10000));
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static class Consumertask implements Runnable {

        public void run() {
            try {
                while (true) {
                    System.out.println("\t\tConsumer reads " + buffer.take());

                    Thread.sleep((int) (Math.random() * 10000));
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
