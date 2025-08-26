import java.util.ArrayList;
import java.util.List;

public class MessageQueue {
    private int bufferSize;  // Buffer size
    private List<String> buffer = new ArrayList<>(); // Queue of messages

    public MessageQueue(int bufferSize) {
        if (bufferSize <= 0) throw new IllegalArgumentException("Size is illegal.");
        this.bufferSize = bufferSize;
    }

    // Check if the buffer is full
    public synchronized boolean isFull() {
        return buffer.size() == bufferSize;
    }

    // Check if the buffer is empty
    public synchronized boolean isEmpty() {
        return buffer.isEmpty();
    }

    // Add a message to the queue for the customer waiting
    public synchronized void put(String message) {
        while (isFull()) {
            System.out.println("Customer waiting to buy one " + message);
			System.out.println("Customer waiting to buy one " + message);
            System.out.println("Customer waiting to buy one " + message);
            System.out.println("Customer waiting to buy one " + message);

            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
		// Add a message for when the farmer puts a fruit on sale
        buffer.add(message);
        System.out.println("Farmer 1 put one " + message + " up for sale");
		System.out.println("Farmer 2 put one " + message + " up for sale");
        System.out.println("Farmer 3 put one " + message + " up for sale");
        System.out.println("Farmer 4 put one " + message + " up for sale");

        notifyAll();  // Notify consumers waiting to buy
    }

    // Get a message from the queue
    public synchronized String get() {
        while (isEmpty()) {
            System.out.println("Nothing!");
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }

        String message = buffer.remove(0);
        notifyAll();  // Notify producers waiting to put
        return message;
    }
}
