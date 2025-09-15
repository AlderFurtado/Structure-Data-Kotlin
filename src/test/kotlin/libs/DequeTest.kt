package libs

import org.junit.jupiter.api.Test
import kotlin.test.asserter

class DequeTest {
    @Test
    fun size() {
        val deque = Deque()
        deque.addFront(1)
        asserter.assertEquals("",1,deque.size())
    }

    @Test
    fun addFront() {
        val deque = Deque()
        deque.addFront(1)
        deque.addFront(2)
        asserter.assertEquals("","21",deque.toString())
    }

    @Test
    fun addBack() {
        val deque = Deque()
        deque.addBack(1)
        deque.addBack(2)
        deque.addBack(3)
        asserter.assertEquals("","123",deque.toString())
    }

    @Test
    fun removeBack() {
        val deque = Deque()
        deque.addBack(1)
        deque.addBack(2)
        deque.addBack(3)
        deque.removeBack()
        asserter.assertEquals("","12",deque.toString())
    }

    @Test
    fun removeFront() {
        val deque = Deque()
        deque.addBack(1)
        deque.addBack(2)
        deque.addBack(3)
        deque.removeFront()
        asserter.assertEquals("","23",deque.toString())
    }

    @Test
    fun peekFront() {
        val deque = Deque()
        deque.addBack(1)
        deque.addBack(2)
        deque.addBack(3)
        deque.removeFront()
        asserter.assertEquals("",2,deque.peekFront())
    }

    @Test
    fun peekBack() {
        val deque = Deque()
        deque.addBack(1)
        deque.addBack(2)
        deque.addBack(3)
        deque.removeBack()
        asserter.assertEquals("",2,deque.peekBack())
    }

    @Test
    fun isEmpty() {
        val deque = Deque()
        deque.addBack(1)
        deque.removeFront()
        asserter.assertTrue("", deque.isEmpty())
    }

    @Test
    fun isNotEmpty() {
        val deque = Deque()
        deque.addBack(1)
        deque.addBack(2)
        deque.removeFront()
        asserter.assertTrue("", !deque.isEmpty())
    }

}