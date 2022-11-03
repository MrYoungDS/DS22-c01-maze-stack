package queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedQueueTest {
    private QueueInterface<Integer> queue;

    @BeforeEach
    public void setup() {
        queue = new LinkedQueue<Integer>();
    }

    @Test
    public void testQueue() {
        assertTrue(queue.isEmpty(), "Queue should be empty after being constructed.");
        assertEquals(0, queue.size(), "Queue should contain zero elements after being constructed.");

        queue.enqueue(5);
        assertFalse(queue.isEmpty(), "Queue should not be empty.");
        assertEquals(Integer.valueOf(5), queue.first(), "The first element should be 5");
        assertEquals(1, queue.size(), "The queue should contain one element.");

        queue.enqueue(4);
        assertEquals(Integer.valueOf(5), queue.first(), "The front element should be 5");
        assertEquals(2, queue.size(), "The queue should contain two elements.");

        Integer t = queue.dequeue();
        assertEquals(Integer.valueOf(5), t, "The dequeued element should be 5");
        assertEquals(Integer.valueOf(4), queue.first(), "The front element should be 4");
        assertEquals(1, queue.size(), "The queue should contain one element.");
        assertFalse(queue.isEmpty(), "The queue should not be empty.");

        t = queue.dequeue();
        assertEquals(Integer.valueOf(4), t, "The dequeued element should be 4");
        assertTrue(queue.isEmpty(), "The queue should be empty.");
    }

    @Test
    public void testQueueUnderflowPop() {
        assertThrows(QueueUnderflowException.class,
                () -> queue.dequeue(),
                "Dequeue on an empty queue should throw underflow.");
    }

    @Test
    public void testQueueUnderflowTop() {
        assertThrows(QueueUnderflowException.class,
                () -> queue.first(),
                "Examining the front of an empty queue should throw underflow.");
    }
}
