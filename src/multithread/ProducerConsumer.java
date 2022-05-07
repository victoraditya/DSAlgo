package multithread;

import java.util.LinkedList;
import java.util.List;

import static java.lang.Thread.sleep;

public class ProducerConsumer {
    int capacity;
    List<Integer> list;

    ProducerConsumer(int capacity) {
        list = new LinkedList<>();
        this.capacity = capacity;
    }

    //produce - if list is not full - fills the list with values and notifies consumer.

    //consumer - if list is not empty - consumes the value from the list and notifies producer.

    public static void main(String[] args) {

        ProducerConsumer producerConsumer = new ProducerConsumer(2);

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }

    private void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                if (list.size() == capacity) {
                    wait();
                }
                System.out.println("Producer produced - " + value);
                list.add(value++);
                System.out.println("List size is : " + list.size());

                notify();
                sleep(1000);
            }

        }
    }

    private void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                if (list.size() == 0) {
                    wait();
                }
                Integer value = list.remove(0);
                System.out.println("Consumer consumed : " + value);
                System.out.println("List size is : " + list.size());
                notify();
                sleep(1000);
            }

        }
    }


}
