package libs

class Deque {

    private var size = 0
    private var array = arrayOfNulls<Any>(0)

    fun addFront(value: Any){
        val aux = arrayOfNulls<Any>(size+1)
        if(size == 0){
            aux[size] = value
            array = aux
            size++
            return
        }
        aux[0] = value
        for(i in 0..<size){
            aux[i+1] = array[i]
        }
        size++
        array = aux
    }

    fun addBack(value: Any){
        val aux = arrayOfNulls<Any>(size+1)

        if(size == 0){
            aux[size] = value
            array = aux
            size++
            return
        }

        aux[size] = value
        for(i in 0..< size){
            aux[i] = array[i]
        }
        size++
        array = aux
    }

    fun removeBack(){
        if(size == 0) throw Error("Deque is empty")
        val aux = arrayOfNulls<Any>(size - 1)
        for(i in 0..<size-1){
            aux[i] = array[i]
        }
        size--
        array = aux
    }

    fun removeFront(){
        if(size == 0) throw Error("Deque is empty")
        val aux = arrayOfNulls<Any>(size - 1)
        for(i in 1..<size){
            aux[i-1] = array[i]
        }
        size--
        array = aux
    }

    fun peekFront(): Any{
        if(size == 0) throw Error("Deque is empty")
        return array[0] as Any
    }

    fun peekBack(): Any{
        if(size() == 0) throw Error("Deque is empty")
        return array[size - 1] as Any
    }

    fun isEmpty() = size == 0

    fun size() = size


    override fun toString(): String{
        var arrayString = ""
        for (arr in array){
            arrayString+= "$arr"
        }
        return arrayString
    }


}