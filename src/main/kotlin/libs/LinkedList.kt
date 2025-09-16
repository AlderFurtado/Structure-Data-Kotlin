package org.study.libs

class LinkedList {
    private class LinkedListNode(val element: Any, var next: LinkedListNode? = null)
    private var size = 0
    private var head: LinkedListNode? = null

    fun push(element: Any){
        val node = LinkedListNode(element)
        var current:LinkedListNode
        if(this.head == null){
            head = node
        }else{
            current = this.head as LinkedListNode
            while (current.next != null){
                current.next?.let { next ->
                    current = next
                }
            }
            current.next = node
        }
        this.size++
    }

    fun removeAt(index: Int){
        if(index in 0..size){
            var current = this.head
            if(index == 0){
                this.head = current?.next
            }else{
                var previous = LinkedListNode(0,null)
                for (i in 0..<index){
                    previous = current as LinkedListNode
                    current = current.next
                }
                previous.next = current?.next
            }
            size--
        }else{
            throw Error("index is invalid")
        }
    }

    fun indexOf(element: Any): Int{
        if(this.size == 0) return -1
        var current = this.head
        for (i in 0..this.size){
            if(current?.element == element) return i
            current = current?.next
        }
        return -1
    }

    fun remove(element: Any){
        val indexOf = this.indexOf(element)
        removeAt(indexOf)
    }

    fun getHead() = this.head?.element

    fun size() = this.size

    fun isEmpty() = this.size == 0

    override fun toString(): String {
        var aux = ""
        if(head == null){
            return ""
        }else{
            var current: LinkedListNode = head as LinkedListNode
            aux += current.element
            while (current.next != null) {
                aux += current.next?.element
                current = current.next as LinkedListNode
            }
        }
        return aux
    }
}