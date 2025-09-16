package libs

import org.junit.jupiter.api.Test
import org.study.libs.LinkedList
import kotlin.test.asserter

class LinkedListTest {

    @Test
    fun push() {
        val linkedList = LinkedList()
        linkedList.push(1)
        linkedList.push(2)
        linkedList.push(3)
        asserter.assertEquals("",3,linkedList.size())
    }

    @Test
    fun removeAt() {
        val linkedList = LinkedList()
        linkedList.push(1)
        linkedList.push(2)
        linkedList.push(3)
        linkedList.removeAt(2)
        asserter.assertEquals("","12",linkedList.toString())
    }

    @Test
    fun indexOf() {
        val linkedList = LinkedList()
        linkedList.push(1)
        linkedList.push(2)
        linkedList.push(3)
        val indexOf = linkedList.indexOf(2)
        asserter.assertEquals("",1,indexOf)
    }

    @Test
    fun remove() {
        val linkedList = LinkedList()
        linkedList.push(1)
        linkedList.push(2)
        linkedList.push(3)
        linkedList.push(4)
       linkedList.remove(2)
        asserter.assertEquals("","134",linkedList.toString())
    }

    @Test
    fun getHead() {
        val linkedList = LinkedList()
        linkedList.push(2)
        linkedList.push(1)
        linkedList.push(3)
        linkedList.push(4)
        asserter.assertEquals("",2,linkedList.getHead())
    }

    @Test
    fun isNotEmpty() {
        val linkedList = LinkedList()
        linkedList.push(2)
        linkedList.push(1)
        linkedList.push(3)
        linkedList.push(4)
        asserter.assertTrue("", !linkedList.isEmpty())
    }

    @Test
    fun isEmpty() {
        val linkedList = LinkedList()
        asserter.assertTrue("", linkedList.isEmpty())
    }

}