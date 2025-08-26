
public class MessageSystem
{
	public static void main(String[] args)
	{
		MessageQueue queue = new MessageQueue(5);
		new Producer(queue).start();
		new Producer(queue).start();
		new Producer(queue).start();
		new Consumer(queue).start();
		new Consumer(queue).start();
		new Consumer(queue).start();
	}
}