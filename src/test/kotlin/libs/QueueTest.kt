package libs

import org.junit.jupiter.api.Test
import kotlin.test.asserter

class QueueTest {
    @Test
    fun size() {
        val queue = Queue()
        queue.enqueue(1)
        queue.enqueue(2)
        asserter.assertEquals("",2,queue.size())
    }

    @Test
    fun enqueue() {
        val queue = Queue()
        queue.enqueue(1)
        queue.enqueue(2)
        queue.enqueue(3)
        asserter.assertEquals("","123",queue.toString())
    }

    @Test
    fun dequeue() {
        val queue = Queue()
        queue.enqueue(1)
        queue.enqueue(2)
        queue.enqueue(3)
        queue.dequeue()
        asserter.assertEquals("","23",queue.toString())
    }

    @Test
    fun peek() {
        val queue = Queue()
        queue.enqueue(1)
        queue.enqueue(2)
        queue.enqueue(3)
        asserter.assertEquals("",1,queue.peek())
    }

    @Test
    fun isEmpty() {
        val queue = Queue()
        asserter.assertTrue("",queue.isEmpty())
    }

    @Test
    fun isNotEmpty() {
        val queue = Queue()
        queue.enqueue(1)
        asserter.assertTrue("",!queue.isEmpty())
    }

}