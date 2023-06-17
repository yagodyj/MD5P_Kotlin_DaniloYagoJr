package kotlinbasics

fun main(){
    repeat(5){
        print("${(it+1)*5} ")
    }
    repeat(5){counter->
        print("\n${counter + 1}")
    }
}