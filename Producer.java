public class Producer extends Thread
{
	//private static int count = 0;
	private MessageQueue queue = null;

	public Producer(MessageQueue queue)
	{
		this.queue = queue;
	}

	public void run()
	{
			queue.put(generateMessage0()); //Adding apple to queue
			queue.put(generateMessage1()); //Adding orange to queue
			queue.put(generateMessage2()); //Adding grape to queue
			queue.put(generateMessage3()); //Adding watermelon to queue

	}

	// Generating the message apple for a thread
	private synchronized String generateMessage0()
	{
		String apple = "Apple";

		return apple;
	}

	// Generating the message orange for a thread
	private synchronized String generateMessage1()
	{
	
		String orange = "Orange";

		return orange;
	}

	// Generating the message grape for a thread
	private synchronized String generateMessage2()
	{
		String grape = "Grape";

		return grape;
	}

	// Generating the message watermelon for a thread
	private synchronized String generateMessage3()
	{
		String watermelon = "Watermelon";

		return watermelon;
	}
}