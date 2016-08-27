package ar.fiuba.tdd.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTests {

    @Test
    public void dummy() {
        assertEquals(0, 0);
    }

    @Test
    public void createEmptyQueueTest() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void addOneElementToTheQueueTest() {
        Queue queue = new Queue();
        queue.add(new String("Hello"));
        assertEquals(1, queue.size());
    }

    @Test
    public void getTopElementFromQueueTest() {
        Queue queue = new Queue();
        queue.add(new String("Hello"));
        try {
            String data = (String) queue.top();
            assertEquals("Hello", data);
        } catch (EmptyQueueException e ) {
            assertEquals(0, 1);
        }
    }

    @Test
    public void removeElementFromQueue() {
        Queue queue = new Queue();
        queue.add(new String("Hello"));
        try {
            queue.remove();
            assertTrue(queue.isEmpty());
        } catch (EmptyQueueException e ) {
            assertEquals(0, 1);
        }
    }
}
