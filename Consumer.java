
public class Consumer extends Thread
{
	private MessageQueue queue = null;

	// Constructor to initialize the queue
	public Consumer(MessageQueue queue)
	{
		this.queue = queue;
	}

	public void run()
	{
		// Each customer is attempting to buy a fruit from the queue and prints out a message
			System.out.println("Customer 1 bought one " + queue.get() + ".");
			System.out.println("Customer 2 bought one " + queue.get() + ".");
			System.out.println("Customer 3 bought one " + queue.get() + ".");
			System.out.println("Customer 4 bought one " + queue.get() + ".");

		
	}
}