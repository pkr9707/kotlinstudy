import java.util.Scanner

fun main(){
    val sc : Scanner = Scanner(System.`in`)
    val a= sc.nextInt()

    if(a>=90)print("A")
    else if(a>=80)print("B")
    else if(a>=70)print("C")
    else if(a>=60)print("D")
    else print("F")
}