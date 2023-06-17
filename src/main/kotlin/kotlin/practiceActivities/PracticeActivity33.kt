package practiceActivities

fun main(){
    print("Input a word to be reversed: ")
    var input = readln()
    print("The reversed word is: ")
    var ctr = input.length
    while(ctr > 0){
        print(input[ctr-1])
        ctr--
    }
}