import java.util.Scanner;
fun main(){

    var scanner = Scanner(System.`in`);
    var choice:Int;

    do {
        println("Enter your choice");
        println("1. To calcute square");
        println("2. To calculate square root");
        println("3. To check armstring number");
        println("0. To exit");
        choice=scanner.nextInt();

        when(choice){
            1-> {
                println("Enter the number you want to get the square for");
                var number:Int=scanner.nextInt();
                println(square(number));
            }
            2-> {
                println("Enter the number you want to get square root for")
                var number:Int=scanner.nextInt();
                if(squarert(number))
                    println("Yes the number is a perfect square");
                else println("No the number is not a perfect square");
            }
            3-> {
                println("Enter the number you want to check if it is armstrong")
                var number:Int=scanner.nextInt();
                if(armstrong(number))
                    println("It is a armstrong number");
                else println("It is not a armstrong number")
            }
            else-> {
                println("You've exited");
            }
        }
    }
        while (choice!=0)


}
fun square(number:Int):Int{
    return number*number;
}

fun squarert(number:Int):Boolean{
    for(i in 1..number/2){
        if ( number / i == i)
            return true;
    }
    return false;
}

fun armstrong(number:Int):Boolean{
    var count:Int=0;
    var orgNumb:Int=number;

    while(orgNumb>0){
        orgNumb /= 10;
        count++;
    }

    orgNumb=number;

    var sum:Int=0;
    while(orgNumb!=0){
        var rem:Int=orgNumb%10;
        var mult:Int=1;
        for(i in 1..count){
            mult *= rem;
        }
        sum+=mult;
        orgNumb /= 10;
    }
    return sum==number;
}