package libs

class Stack {
     private var size = 0
     private var array = arrayOfNulls<Any>(0)

     fun push(value: Any){
         grow()
         array[size] = value
         size++
     }

     fun pop(): Array<Any?>{
         if(size <= 0) throw Error()
         val aux = arrayOfNulls<Any>(size-1)
         for ((index, value) in array.withIndex()){
             if(index < size - 1){
                 aux[index] = value
             }
         }
         size--
         array = aux
         return array
     }

     fun peek() = array[size-1]

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