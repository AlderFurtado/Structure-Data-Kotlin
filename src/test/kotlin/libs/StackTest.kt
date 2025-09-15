package libs

import org.junit.jupiter.api.Test
import kotlin.test.asserter

class StackTest {
    @Test
    fun size() {
        val stack = Stack()
        stack.push(1)
        stack.push(2)

        asserter.assertEquals("",2,stack.size())
    }

    @Test
    fun push() {
        val stack = Stack()
        stack.push(1)
        stack.push(2)

        asserter.assertEquals("","12",stack.toString())
    }

    @Test
    fun pop() {
        val stack = Stack()
        stack.push(1)
        stack.push(2)
        stack.pop()

        asserter.assertEquals("","1",stack.toString())
    }

    @Test
    fun peek() {
        val stack = Stack()
        stack.push(1)
        stack.push(2)
        stack.push(3)

        asserter.assertEquals("",3,stack.peek())
    }

    @Test
    fun isEmpty() {
        val stack = Stack()
        asserter.assertTrue("",stack.isEmpty())
    }

    @Test
    fun isNotEmpty() {
        val stack = Stack()
        stack.push(1)
        asserter.assertTrue("",!stack.isEmpty())
    }



}