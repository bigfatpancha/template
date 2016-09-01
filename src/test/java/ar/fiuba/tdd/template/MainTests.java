package ar.fiuba.tdd.template;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTests {

    private String object1;
    private String object2;

    @Before
    public void createItems() {
        object1 = "Hello";
        object2 = "Bye";
    }

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
        Queue<String> queue = new Queue<String>();
        queue.add(object1);
        assertEquals(1, queue.size());
    }

    @Test
    public void getTopElementFromQueueTest() {
        Queue<String> queue = new Queue<String>();
        queue.add(object1);
        try {
            String data = (String) queue.top();
            assertEquals("Hello", data);
        } catch (EmptyQueueException e ) {
            assertEquals(0, 1);
        }
    }

    @Test
    public void removeElementFromQueue() {
        Queue<String> queue = new Queue<String>();
        queue.add(object1);
        try {
            queue.remove();
            assertTrue(queue.isEmpty());
        } catch (EmptyQueueException e ) {
            assertEquals(0, 1);
        }
    }

    @Test
    public void dosItemsTest() {
        Queue<String> queue = new Queue<String>();
        queue.add(object1);
        queue.add(object2);
        try {
            String first = (String) queue.top();
            assertEquals("Hello", first);
            String second = (String) queue.top();
            assertEquals("Bye", second);
        } catch (EmptyQueueException e) {
            assertEquals(0 , 1);
        }

    }
}
