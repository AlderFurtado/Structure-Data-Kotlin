package libs

class Queue {

    private var size = 0
    private var array = arrayOfNulls<Any>(0)

    fun enqueue(value: Any){
        grow()
        array[size] = value
        size++
    }

    fun dequeue(): Array<Any?>{
        if(size == 0) throw Error("Queue is empty")

        val aux = arrayOfNulls<Any>(size - 1)
        for((index, arr) in array.withIndex()){
            if (index != 0) aux[index - 1] = arr
        }
        size--
        array = aux

        return array
    }

    fun peek() = array[0]

    fun isEmpty() = size == 0

    fun size() = size

    override fun toString(): String{
        var arrayString = ""
        for (arr in array){
            arrayString+= "$arr"
        }
        return arrayString
    }

    private fun grow(){
        val aux = arrayOfNulls<Any>(size + 1)
        for ((index,arr) in array.withIndex()){
            aux[index] = arr
        }
        array = aux
    }
}