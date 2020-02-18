import java.util.Scanner

fun main(){
    val sc : Scanner = Scanner(System.`in`)
    val a =sc.nextInt()
    val b =sc.nextInt()
    val c =sc.nextInt()


    if(a>b){
        if(c>=a)print(a)
        else if (b>=c) print(b)
        else print (c)
    }
    else if(b>a){
        if(c>=b)print(b)
        else if (a>=c) print(a)
        else print(c)
    }
    else if(b==a){
        print(a)
    }

}