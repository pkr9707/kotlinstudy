import java.util.Scanner

fun main(){
    val sc : Scanner = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()

    println(a*(b%10))
    println(a*((b/10)%10))
    println(a*((b/100)%10))
    println(a*b)

}
