This program is a Producer-Consumer system with Java threads:

-Producers generate fruit messages and place them into a shared message queue.

-Consumers remove messages from the queue and print purchase messages.

-The queue acts as a synchronized buffer, ensuring that:

-Producers don’t overfill it.

-Consumers don’t take from an empty buffer.
